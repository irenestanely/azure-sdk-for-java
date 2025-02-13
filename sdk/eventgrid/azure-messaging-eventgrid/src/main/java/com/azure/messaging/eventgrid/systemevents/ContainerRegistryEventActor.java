// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The agent that initiated the event. For most situations, this could be from the authorization context of the request.
 */
@Fluent
public final class ContainerRegistryEventActor {
    /*
     * The subject or username associated with the request context that generated the event.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of ContainerRegistryEventActor class. */
    public ContainerRegistryEventActor() {}

    /**
     * Get the name property: The subject or username associated with the request context that generated the event.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The subject or username associated with the request context that generated the event.
     *
     * @param name the name value to set.
     * @return the ContainerRegistryEventActor object itself.
     */
    public ContainerRegistryEventActor setName(String name) {
        this.name = name;
        return this;
    }
}
