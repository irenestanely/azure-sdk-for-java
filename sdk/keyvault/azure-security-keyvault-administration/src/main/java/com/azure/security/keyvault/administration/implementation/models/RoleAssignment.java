// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Role Assignments. */
@Fluent
public final class RoleAssignment implements JsonSerializable<RoleAssignment> {
    /*
     * The role assignment ID.
     */
    private String id;

    /*
     * The role assignment name.
     */
    private String name;

    /*
     * The role assignment type.
     */
    private String type;

    /*
     * Role assignment properties.
     */
    private RoleAssignmentPropertiesWithScope properties;

    /** Creates an instance of RoleAssignment class. */
    public RoleAssignment() {}

    /**
     * Get the id property: The role assignment ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The role assignment name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: The role assignment type.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the properties property: Role assignment properties.
     *
     * @return the properties value.
     */
    public RoleAssignmentPropertiesWithScope getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Role assignment properties.
     *
     * @param properties the properties value to set.
     * @return the RoleAssignment object itself.
     */
    public RoleAssignment setProperties(RoleAssignmentPropertiesWithScope properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleAssignment from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleAssignment if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleAssignment.
     */
    public static RoleAssignment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    RoleAssignment deserializedRoleAssignment = new RoleAssignment();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("id".equals(fieldName)) {
                            deserializedRoleAssignment.id = reader.getString();
                        } else if ("name".equals(fieldName)) {
                            deserializedRoleAssignment.name = reader.getString();
                        } else if ("type".equals(fieldName)) {
                            deserializedRoleAssignment.type = reader.getString();
                        } else if ("properties".equals(fieldName)) {
                            deserializedRoleAssignment.properties = RoleAssignmentPropertiesWithScope.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedRoleAssignment;
                });
    }
}
