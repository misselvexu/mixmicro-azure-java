// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Basic information for any product system. */
@Immutable
public class BasicInformation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BasicInformation.class);

    /*
     * Display Name for the product system.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Description related to the product system.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private Description description;

    /*
     * Image information for the product system.
     */
    @JsonProperty(value = "imageInformation", access = JsonProperty.Access.WRITE_ONLY)
    private List<ImageInformation> imageInformation;

    /*
     * Cost information for the product system.
     */
    @JsonProperty(value = "costInformation", access = JsonProperty.Access.WRITE_ONLY)
    private CostInformation costInformation;

    /*
     * Availability information of the product system.
     */
    @JsonProperty(value = "availabilityInformation", access = JsonProperty.Access.WRITE_ONLY)
    private AvailabilityInformation availabilityInformation;

    /*
     * Hierarchy information of a product.
     */
    @JsonProperty(value = "hierarchyInformation", access = JsonProperty.Access.WRITE_ONLY)
    private HierarchyInformation hierarchyInformation;

    /**
     * Get the displayName property: Display Name for the product system.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: Description related to the product system.
     *
     * @return the description value.
     */
    public Description description() {
        return this.description;
    }

    /**
     * Get the imageInformation property: Image information for the product system.
     *
     * @return the imageInformation value.
     */
    public List<ImageInformation> imageInformation() {
        return this.imageInformation;
    }

    /**
     * Get the costInformation property: Cost information for the product system.
     *
     * @return the costInformation value.
     */
    public CostInformation costInformation() {
        return this.costInformation;
    }

    /**
     * Get the availabilityInformation property: Availability information of the product system.
     *
     * @return the availabilityInformation value.
     */
    public AvailabilityInformation availabilityInformation() {
        return this.availabilityInformation;
    }

    /**
     * Get the hierarchyInformation property: Hierarchy information of a product.
     *
     * @return the hierarchyInformation value.
     */
    public HierarchyInformation hierarchyInformation() {
        return this.hierarchyInformation;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (description() != null) {
            description().validate();
        }
        if (imageInformation() != null) {
            imageInformation().forEach(e -> e.validate());
        }
        if (costInformation() != null) {
            costInformation().validate();
        }
        if (availabilityInformation() != null) {
            availabilityInformation().validate();
        }
        if (hierarchyInformation() != null) {
            hierarchyInformation().validate();
        }
    }
}