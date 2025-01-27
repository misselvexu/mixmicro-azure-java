// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An environment variable to be set on a task process. */
@Fluent
public final class EnvironmentSetting {
    /*
     * The name of the environment variable.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The value of the environment variable.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: The name of the environment variable.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the environment variable.
     *
     * @param name the name value to set.
     * @return the EnvironmentSetting object itself.
     */
    public EnvironmentSetting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the environment variable.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the environment variable.
     *
     * @param value the value value to set.
     * @return the EnvironmentSetting object itself.
     */
    public EnvironmentSetting withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model EnvironmentSetting"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnvironmentSetting.class);
}
