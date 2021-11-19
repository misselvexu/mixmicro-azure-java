// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.Context;

/** Samples for Accounts ListUsages. */
public final class AccountsListUsagesSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2021-10-01/examples/GetUsages.json
     */
    /**
     * Sample code: Get Usages.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void getUsages(com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.accounts().listUsagesWithResponse("myResourceGroup", "TestUsage02", null, Context.NONE);
    }
}