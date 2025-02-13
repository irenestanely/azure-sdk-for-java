// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.AlertsState;
import com.azure.resourcemanager.recoveryservices.models.ClassicAlertSettings;
import org.junit.jupiter.api.Assertions;

public final class ClassicAlertSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClassicAlertSettings model =
            BinaryData.fromString("{\"alertsForCriticalOperations\":\"Enabled\"}").toObject(ClassicAlertSettings.class);
        Assertions.assertEquals(AlertsState.ENABLED, model.alertsForCriticalOperations());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClassicAlertSettings model = new ClassicAlertSettings().withAlertsForCriticalOperations(AlertsState.ENABLED);
        model = BinaryData.fromObject(model).toObject(ClassicAlertSettings.class);
        Assertions.assertEquals(AlertsState.ENABLED, model.alertsForCriticalOperations());
    }
}
