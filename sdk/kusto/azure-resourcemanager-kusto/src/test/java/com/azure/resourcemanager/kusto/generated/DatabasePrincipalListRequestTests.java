// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalListRequest;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabasePrincipalListRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabasePrincipalListRequest model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"role\":\"Viewer\",\"name\":\"j\",\"type\":\"Group\",\"fqn\":\"wyzmhtxon\",\"email\":\"ts\",\"appId\":\"jcbpwxqpsrknft\",\"tenantName\":\"vriuhprwmdyvx\"},{\"role\":\"Admin\",\"name\":\"ayriwwroyqbexrm\",\"type\":\"User\",\"fqn\":\"bycnojvkn\",\"email\":\"fqsgzvahapjy\",\"appId\":\"pvgqzcjrvxdjzlm\",\"tenantName\":\"xkvugfhzov\"},{\"role\":\"UnrestrictedViewer\",\"name\":\"jvzunluthnnp\",\"type\":\"App\",\"fqn\":\"i\",\"email\":\"ilpjzuaejxdult\",\"appId\":\"zbbtdzumveek\",\"tenantName\":\"wozuhkf\"},{\"role\":\"User\",\"name\":\"sjyofdx\",\"type\":\"User\",\"fqn\":\"sd\",\"email\":\"ouwaboekqvkeln\",\"appId\":\"vbxwyjsflhh\",\"tenantName\":\"aln\"}]}")
                .toObject(DatabasePrincipalListRequest.class);
        Assertions.assertEquals(DatabasePrincipalRole.VIEWER, model.value().get(0).role());
        Assertions.assertEquals("j", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.GROUP, model.value().get(0).type());
        Assertions.assertEquals("wyzmhtxon", model.value().get(0).fqn());
        Assertions.assertEquals("ts", model.value().get(0).email());
        Assertions.assertEquals("jcbpwxqpsrknft", model.value().get(0).appId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabasePrincipalListRequest model =
            new DatabasePrincipalListRequest()
                .withValue(
                    Arrays
                        .asList(
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.VIEWER)
                                .withName("j")
                                .withType(DatabasePrincipalType.GROUP)
                                .withFqn("wyzmhtxon")
                                .withEmail("ts")
                                .withAppId("jcbpwxqpsrknft"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.ADMIN)
                                .withName("ayriwwroyqbexrm")
                                .withType(DatabasePrincipalType.USER)
                                .withFqn("bycnojvkn")
                                .withEmail("fqsgzvahapjy")
                                .withAppId("pvgqzcjrvxdjzlm"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.UNRESTRICTED_VIEWER)
                                .withName("jvzunluthnnp")
                                .withType(DatabasePrincipalType.APP)
                                .withFqn("i")
                                .withEmail("ilpjzuaejxdult")
                                .withAppId("zbbtdzumveek"),
                            new DatabasePrincipalInner()
                                .withRole(DatabasePrincipalRole.USER)
                                .withName("sjyofdx")
                                .withType(DatabasePrincipalType.USER)
                                .withFqn("sd")
                                .withEmail("ouwaboekqvkeln")
                                .withAppId("vbxwyjsflhh")));
        model = BinaryData.fromObject(model).toObject(DatabasePrincipalListRequest.class);
        Assertions.assertEquals(DatabasePrincipalRole.VIEWER, model.value().get(0).role());
        Assertions.assertEquals("j", model.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.GROUP, model.value().get(0).type());
        Assertions.assertEquals("wyzmhtxon", model.value().get(0).fqn());
        Assertions.assertEquals("ts", model.value().get(0).email());
        Assertions.assertEquals("jcbpwxqpsrknft", model.value().get(0).appId());
    }
}
