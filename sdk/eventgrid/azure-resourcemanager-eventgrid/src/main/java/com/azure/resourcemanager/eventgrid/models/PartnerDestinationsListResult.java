// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerDestinationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List Partner Destinations operation. */
@Fluent
public final class PartnerDestinationsListResult {
    /*
     * A collection of partner destinations.
     */
    @JsonProperty(value = "value")
    private List<PartnerDestinationInner> value;

    /*
     * A link for the next page of partner destinations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of PartnerDestinationsListResult class. */
    public PartnerDestinationsListResult() {
    }

    /**
     * Get the value property: A collection of partner destinations.
     *
     * @return the value value.
     */
    public List<PartnerDestinationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of partner destinations.
     *
     * @param value the value value to set.
     * @return the PartnerDestinationsListResult object itself.
     */
    public PartnerDestinationsListResult withValue(List<PartnerDestinationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of partner destinations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of partner destinations.
     *
     * @param nextLink the nextLink value to set.
     * @return the PartnerDestinationsListResult object itself.
     */
    public PartnerDestinationsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
