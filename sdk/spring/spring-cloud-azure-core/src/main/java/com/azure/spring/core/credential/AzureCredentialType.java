// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.credential;

import org.springframework.util.Assert;

import java.util.Objects;

/**
 * Azure credential type for Azure SDKs authentication.
 */
public final class AzureCredentialType {

    // Built-in type
    public static final AzureCredentialType TOKEN_CREDENTIAL = new AzureCredentialType("token_credential");
    public static final AzureCredentialType KEY_CREDENTIAL = new AzureCredentialType("key_credential");
    public static final AzureCredentialType SAS_CREDENTIAL = new AzureCredentialType("sas_credential");
    public static final AzureCredentialType NAMED_KEY_CREDENTIAL = new AzureCredentialType("named_key_credential");

    private final String type;

    /**
     * Create an {@link AzureCredentialType} with the type name.
     * @param type The name of the Azure credential type.
     */
    public AzureCredentialType(String type) {
        Assert.hasText(type, "type cannot be empty");
        this.type = type;
    }

    /**
     * Get name of the Azure credential type.
     * @return The name of the Azure credential type.
     */
    public String getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object current) {
        if (this == current) {
            return true;
        }
        if (current == null || getClass() != current.getClass()) {
            return false;
        }
        AzureCredentialType another = (AzureCredentialType) current;
        return Objects.equals(type, another.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}