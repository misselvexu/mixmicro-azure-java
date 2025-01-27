// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.config.resource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.Assert;

/**
 * Connection information for connecting to a Azure APp Configuration Store.
 */
public final class Connection {

    /**
     * Invalid Connection String error message
     */
    public static final String NON_EMPTY_MSG = "%s property should not be null or empty in the connection string of Azure Config Service.";

    /**
     * Connection String Regex format
     */
    private static final String CONN_STRING_REGEXP = "Endpoint=([^;]+);Id=([^;]+);Secret=([^;]+)";

    /**
     * Invalid Formatted Connection String Error message
     */
    public static final String ENDPOINT_ERR_MSG = String.format("Connection string does not follow format %s.",
        CONN_STRING_REGEXP);

    private static final Pattern CONN_STRING_PATTERN = Pattern.compile(CONN_STRING_REGEXP);

    private final String endpoint;

    private final String connectionString;

    private final String clientId;

    /**
     * Creates a Connection that can be used to connect to an Azure App Configuration Store.
     * 
     * @param connectionString App Configuration Connection String
     * @throws IllegalStateException Connection String format is invalid.
     */
    public Connection(String connectionString) {
        Assert.hasText(connectionString, "Connection string cannot be empty.");

        Matcher matcher = CONN_STRING_PATTERN.matcher(connectionString);
        if (!matcher.find()) {
            throw new IllegalStateException(ENDPOINT_ERR_MSG);
        }

        this.endpoint = matcher.group(1);

        Assert.hasText(endpoint, String.format(NON_EMPTY_MSG, "Endpoint"));

        this.connectionString = connectionString;
        this.clientId = "";
    }

    /**
     * Creates a Connection that can be used to connect to an Azure App Configuration Store.
     * 
     * @param endpoint App Configuration endpoint
     * @param clientId Client Id to connect to App Configuration
     */
    public Connection(String endpoint, String clientId) {
        this.endpoint = endpoint;
        this.clientId = clientId;
        this.connectionString = "";
    }

    /**
     * @return the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * @return the connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * @return the clientId
     */
    public String getClientId() {
        return clientId;
    }

}
