// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The properties for updating encoded task step. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("EncodedTask")
@Fluent
public final class EncodedTaskStepUpdateParameters extends TaskStepUpdateParameters {
    /*
     * Base64 encoded value of the template/definition file content.
     */
    @JsonProperty(value = "encodedTaskContent")
    private String encodedTaskContent;

    /*
     * Base64 encoded value of the parameters/values file content.
     */
    @JsonProperty(value = "encodedValuesContent")
    private String encodedValuesContent;

    /*
     * The collection of overridable values that can be passed when running a task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /** Creates an instance of EncodedTaskStepUpdateParameters class. */
    public EncodedTaskStepUpdateParameters() {
    }

    /**
     * Get the encodedTaskContent property: Base64 encoded value of the template/definition file content.
     *
     * @return the encodedTaskContent value.
     */
    public String encodedTaskContent() {
        return this.encodedTaskContent;
    }

    /**
     * Set the encodedTaskContent property: Base64 encoded value of the template/definition file content.
     *
     * @param encodedTaskContent the encodedTaskContent value to set.
     * @return the EncodedTaskStepUpdateParameters object itself.
     */
    public EncodedTaskStepUpdateParameters withEncodedTaskContent(String encodedTaskContent) {
        this.encodedTaskContent = encodedTaskContent;
        return this;
    }

    /**
     * Get the encodedValuesContent property: Base64 encoded value of the parameters/values file content.
     *
     * @return the encodedValuesContent value.
     */
    public String encodedValuesContent() {
        return this.encodedValuesContent;
    }

    /**
     * Set the encodedValuesContent property: Base64 encoded value of the parameters/values file content.
     *
     * @param encodedValuesContent the encodedValuesContent value to set.
     * @return the EncodedTaskStepUpdateParameters object itself.
     */
    public EncodedTaskStepUpdateParameters withEncodedValuesContent(String encodedValuesContent) {
        this.encodedValuesContent = encodedValuesContent;
        return this;
    }

    /**
     * Get the values property: The collection of overridable values that can be passed when running a task.
     *
     * @return the values value.
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the values property: The collection of overridable values that can be passed when running a task.
     *
     * @param values the values value to set.
     * @return the EncodedTaskStepUpdateParameters object itself.
     */
    public EncodedTaskStepUpdateParameters withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EncodedTaskStepUpdateParameters withContextPath(String contextPath) {
        super.withContextPath(contextPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EncodedTaskStepUpdateParameters withContextAccessToken(String contextAccessToken) {
        super.withContextAccessToken(contextAccessToken);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }
}
