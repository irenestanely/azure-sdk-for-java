// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for HybridAksClusters ListByResourceGroup. */
public final class HybridAksClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2022-12-12-preview/examples/HybridAksClusters_ListByResourceGroup.json
     */
    /**
     * Sample code: List Hybrid AKS provisioned clusters data for resource group.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listHybridAKSProvisionedClustersDataForResourceGroup(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.hybridAksClusters().listByResourceGroup("resourceGroupName", com.azure.core.util.Context.NONE);
    }
}
