// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.models.ClientGroupProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of client group. */
@Fluent
public final class ClientGroupProperties {
    /*
     * Description for the Client Group resource.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The grouping query for the clients.
     * Example : attributes.keyName IN ['a', 'b', 'c'].
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * Provisioning state of the ClientGroup resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ClientGroupProvisioningState provisioningState;

    /** Creates an instance of ClientGroupProperties class. */
    public ClientGroupProperties() {
    }

    /**
     * Get the description property: Description for the Client Group resource.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the Client Group resource.
     *
     * @param description the description value to set.
     * @return the ClientGroupProperties object itself.
     */
    public ClientGroupProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the query property: The grouping query for the clients. Example : attributes.keyName IN ['a', 'b', 'c'].
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: The grouping query for the clients. Example : attributes.keyName IN ['a', 'b', 'c'].
     *
     * @param query the query value to set.
     * @return the ClientGroupProperties object itself.
     */
    public ClientGroupProperties withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the ClientGroup resource.
     *
     * @return the provisioningState value.
     */
    public ClientGroupProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
