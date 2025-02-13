// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Quota availability request content. */
@Fluent
public final class QuotaAvailabilityRequest {
    /*
     * Name of the resource to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Resource type used for verification.
     */
    @JsonProperty(value = "type", required = true)
    private CheckQuotaNameResourceTypes type;

    /*
     * Resource group name.
     */
    @JsonProperty(value = "resourceGroup", required = true)
    private String resourceGroup;

    /** Creates an instance of QuotaAvailabilityRequest class. */
    public QuotaAvailabilityRequest() {
    }

    /**
     * Get the name property: Name of the resource to verify.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource to verify.
     *
     * @param name the name value to set.
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     *
     * @return the type value.
     */
    public CheckQuotaNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     *
     * @param type the type value to set.
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withType(CheckQuotaNameResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the resourceGroup property: Resource group name.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Resource group name.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the QuotaAvailabilityRequest object itself.
     */
    public QuotaAvailabilityRequest withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model QuotaAvailabilityRequest"));
        }
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model QuotaAvailabilityRequest"));
        }
        if (resourceGroup() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceGroup in model QuotaAvailabilityRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QuotaAvailabilityRequest.class);
}
