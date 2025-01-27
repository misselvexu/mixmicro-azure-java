// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Association entity contract properties. */
@Fluent
public final class AssociationContractProperties {
    /*
     * Provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the AssociationContractProperties object itself.
     */
    public AssociationContractProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
