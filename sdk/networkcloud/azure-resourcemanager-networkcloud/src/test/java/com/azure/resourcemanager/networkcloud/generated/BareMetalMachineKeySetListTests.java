// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineKeySetInner;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySetList;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySetPrivilegeLevel;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BareMetalMachineKeySetListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BareMetalMachineKeySetList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"t\",\"value\":[{\"extendedLocation\":{\"name\":\"vopvp\",\"type\":\"dbzqgqqihed\"},\"properties\":{\"azureGroupId\":\"vqwt\",\"detailedStatus\":\"AllActive\",\"detailedStatusMessage\":\"ibcysihsgqc\",\"expiration\":\"2021-01-02T11:43:38Z\",\"jumpHostsAllowed\":[],\"lastValidation\":\"2021-08-30T04:21:25Z\",\"osGroupName\":\"sdtmcdzs\",\"privilegeLevel\":\"Superuser\",\"provisioningState\":\"Canceled\",\"userList\":[],\"userListStatus\":[]},\"location\":\"xbzlmc\",\"tags\":{\"onqzinkfkbgbzbow\":\"pcvhdbevwqqxeys\",\"qkjjeokbz\":\"eqocljmygvk\"},\"id\":\"fezrx\",\"name\":\"czurtlei\",\"type\":\"q\"}]}")
                .toObject(BareMetalMachineKeySetList.class);
        Assertions.assertEquals("t", model.nextLink());
        Assertions.assertEquals("xbzlmc", model.value().get(0).location());
        Assertions.assertEquals("pcvhdbevwqqxeys", model.value().get(0).tags().get("onqzinkfkbgbzbow"));
        Assertions.assertEquals("vopvp", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("dbzqgqqihed", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("vqwt", model.value().get(0).azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-02T11:43:38Z"), model.value().get(0).expiration());
        Assertions.assertEquals("sdtmcdzs", model.value().get(0).osGroupName());
        Assertions.assertEquals(BareMetalMachineKeySetPrivilegeLevel.SUPERUSER, model.value().get(0).privilegeLevel());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BareMetalMachineKeySetList model =
            new BareMetalMachineKeySetList()
                .withNextLink("t")
                .withValue(
                    Arrays
                        .asList(
                            new BareMetalMachineKeySetInner()
                                .withLocation("xbzlmc")
                                .withTags(mapOf("onqzinkfkbgbzbow", "pcvhdbevwqqxeys", "qkjjeokbz", "eqocljmygvk"))
                                .withExtendedLocation(new ExtendedLocation().withName("vopvp").withType("dbzqgqqihed"))
                                .withAzureGroupId("vqwt")
                                .withExpiration(OffsetDateTime.parse("2021-01-02T11:43:38Z"))
                                .withJumpHostsAllowed(Arrays.asList())
                                .withOsGroupName("sdtmcdzs")
                                .withPrivilegeLevel(BareMetalMachineKeySetPrivilegeLevel.SUPERUSER)
                                .withUserList(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(BareMetalMachineKeySetList.class);
        Assertions.assertEquals("t", model.nextLink());
        Assertions.assertEquals("xbzlmc", model.value().get(0).location());
        Assertions.assertEquals("pcvhdbevwqqxeys", model.value().get(0).tags().get("onqzinkfkbgbzbow"));
        Assertions.assertEquals("vopvp", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("dbzqgqqihed", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("vqwt", model.value().get(0).azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-02T11:43:38Z"), model.value().get(0).expiration());
        Assertions.assertEquals("sdtmcdzs", model.value().get(0).osGroupName());
        Assertions.assertEquals(BareMetalMachineKeySetPrivilegeLevel.SUPERUSER, model.value().get(0).privilegeLevel());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
