// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.ManagedRuleSetDefinitionList;
import org.junit.jupiter.api.Assertions;

public final class ManagedRuleSetDefinitionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedRuleSetDefinitionList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"rl\",\"ruleSetId\":\"ugjzzdatqxhocdge\",\"ruleSetType\":\"lgphu\",\"ruleSetVersion\":\"cndvkaozwyiftyhx\",\"ruleGroups\":[]},\"location\":\"rokft\",\"tags\":{\"klryplwck\":\"lniwpwcukjfkgiaw\",\"pnddhsgcbacphejk\":\"asy\",\"ndlik\":\"tynqgoul\"},\"id\":\"yqkgfg\",\"name\":\"bmadgak\",\"type\":\"qsrxybzqqed\"},{\"properties\":{\"provisioningState\":\"bciqfouflm\",\"ruleSetId\":\"kzsmodm\",\"ruleSetType\":\"ougpbkwt\",\"ruleSetVersion\":\"tduqktapspwgcuer\",\"ruleGroups\":[]},\"location\":\"mkdo\",\"tags\":{\"bbjfddgmbmbexp\":\"whbmd\"},\"id\":\"bhtqqrolfpfpsa\",\"name\":\"gbquxigj\",\"type\":\"jgzjaoyfhrtx\"}],\"nextLink\":\"n\"}")
                .toObject(ManagedRuleSetDefinitionList.class);
        Assertions.assertEquals("n", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedRuleSetDefinitionList model = new ManagedRuleSetDefinitionList().withNextLink("n");
        model = BinaryData.fromObject(model).toObject(ManagedRuleSetDefinitionList.class);
        Assertions.assertEquals("n", model.nextLink());
    }
}
