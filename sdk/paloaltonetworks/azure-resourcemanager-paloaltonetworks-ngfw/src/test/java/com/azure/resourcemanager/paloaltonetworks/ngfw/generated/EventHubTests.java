// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.EventHub;
import org.junit.jupiter.api.Assertions;

public final class EventHubTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EventHub model =
            BinaryData
                .fromString(
                    "{\"id\":\"rn\",\"subscriptionId\":\"x\",\"name\":\"uwrykqgaifmvikl\",\"nameSpace\":\"dvk\",\"policyName\":\"ejd\"}")
                .toObject(EventHub.class);
        Assertions.assertEquals("rn", model.id());
        Assertions.assertEquals("x", model.subscriptionId());
        Assertions.assertEquals("uwrykqgaifmvikl", model.name());
        Assertions.assertEquals("dvk", model.nameSpace());
        Assertions.assertEquals("ejd", model.policyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EventHub model =
            new EventHub()
                .withId("rn")
                .withSubscriptionId("x")
                .withName("uwrykqgaifmvikl")
                .withNameSpace("dvk")
                .withPolicyName("ejd");
        model = BinaryData.fromObject(model).toObject(EventHub.class);
        Assertions.assertEquals("rn", model.id());
        Assertions.assertEquals("x", model.subscriptionId());
        Assertions.assertEquals("uwrykqgaifmvikl", model.name());
        Assertions.assertEquals("dvk", model.nameSpace());
        Assertions.assertEquals("ejd", model.policyName());
    }
}
