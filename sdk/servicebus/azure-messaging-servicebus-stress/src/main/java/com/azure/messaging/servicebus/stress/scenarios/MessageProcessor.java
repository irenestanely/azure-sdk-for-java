// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.stress.scenarios;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.messaging.servicebus.stress.util.EntityType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;

/**
 * Test ServiceBusProcessorClient
 */
@Component("MessageProcessor")
public class MessageProcessor extends ServiceBusScenario {
    private static final ClientLogger LOGGER = new ClientLogger(MessageProcessor.class);

    @Value("${MAX_CONCURRENT_CALLS:20}")
    private int maxConcurrentCalls;

    @Value("${PREFETCH_COUNT:0}")
    private int prefetchCount;

    @Override
    public void run() {
        final CountDownLatch latch = new CountDownLatch(1);

        final String connectionString = options.getServicebusConnectionString();
        final EntityType entityType = options.getServicebusEntityType();
        String queueName = null;
        String topicName = null;
        String subscriptionName = null;
        if (entityType == EntityType.QUEUE) {
            queueName = options.getServicebusQueueName();
        } else if (entityType == EntityType.TOPIC) {
            topicName = options.getServicebusTopicName();
            subscriptionName = options.getServicebusSubscriptionName();
        }

        final String receiveCounterKey = "Number of received messages - "
            + (queueName != null ? queueName : topicName + "/" + subscriptionName);

        ServiceBusProcessorClient client = new ServiceBusClientBuilder()
            .connectionString(connectionString)
            .retryOptions(new AmqpRetryOptions().setTryTimeout(Duration.ofSeconds(5)))
            .processor()
            .queueName(queueName)
            .topicName(topicName)
            .subscriptionName(subscriptionName)
            .maxConcurrentCalls(maxConcurrentCalls)
            .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
            .disableAutoComplete()
            .prefetchCount(prefetchCount)
            .processMessage(messageContext -> {
                LOGGER.verbose("Before complete. messageId: {}, lockToken: {}",
                    messageContext.getMessage().getMessageId(),
                    messageContext.getMessage().getLockToken());
                messageContext.complete();
                rateMeter.add(receiveCounterKey, 1);
                LOGGER.verbose("After complete. messageId: {}, lockToken: {}",
                    messageContext.getMessage().getMessageId(),
                    messageContext.getMessage().getLockToken());
            })
            .processError(err -> {
                throw LOGGER.logExceptionAsError(new RuntimeException(err.getException()));
            })
            .buildProcessorClient();

        client.start();

        // When the connection is recovering, there is a gap between the creation of new reactor-executor thread and
        // the disposal of old reactor-executor thread. Since only the daemon threads are running, the program ends.
        // Here we add a 'CountDownLatch' to block main thread and keep the processor running forever.
        // In the future, we can add wait time as test parameter so that we can control the testing time.
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // We won't hit here unless we add a wait time for the 'CountDownLatch'.
        client.close();
    }
}
