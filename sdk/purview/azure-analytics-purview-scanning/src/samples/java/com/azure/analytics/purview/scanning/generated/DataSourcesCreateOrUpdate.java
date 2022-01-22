// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning.generated;

import com.azure.analytics.purview.scanning.DataSourcesClient;
import com.azure.analytics.purview.scanning.PurviewScanningClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DataSourcesCreateOrUpdate {
    public static void main(String[] args) {
        DataSourcesClient client =
                new PurviewScanningClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildDataSourcesClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setBody(
                BinaryData.fromString(
                        "{\"kind\":\"AzureStorage\",\"properties\":{\"collection\":{\"type\":\"CollectionReference\",\"referenceName\":\"Collection-rZX\"},\"endpoint\":\"https://azurestorage.core.windows.net/\"}}"));
        Response<BinaryData> response = client.createOrUpdateWithResponse("myDataSource", requestOptions);
    }
}