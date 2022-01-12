// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description related properties of a product system. */
@Immutable
public final class Description {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Description.class);

    /*
     * Type of description.
     */
    @JsonProperty(value = "descriptionType", access = JsonProperty.Access.WRITE_ONLY)
    private DescriptionType descriptionType;

    /*
     * Short description of the product system.
     */
    @JsonProperty(value = "shortDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String shortDescription;

    /*
     * Long description of the product system.
     */
    @JsonProperty(value = "longDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String longDescription;

    /*
     * Keywords for the product system.
     */
    @JsonProperty(value = "keywords", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> keywords;

    /*
     * Attributes for the product system.
     */
    @JsonProperty(value = "attributes", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> attributes;

    /*
     * Links for the product system.
     */
    @JsonProperty(value = "links", access = JsonProperty.Access.WRITE_ONLY)
    private List<Link> links;

    /**
     * Get the descriptionType property: Type of description.
     *
     * @return the descriptionType value.
     */
    public DescriptionType descriptionType() {
        return this.descriptionType;
    }

    /**
     * Get the shortDescription property: Short description of the product system.
     *
     * @return the shortDescription value.
     */
    public String shortDescription() {
        return this.shortDescription;
    }

    /**
     * Get the longDescription property: Long description of the product system.
     *
     * @return the longDescription value.
     */
    public String longDescription() {
        return this.longDescription;
    }

    /**
     * Get the keywords property: Keywords for the product system.
     *
     * @return the keywords value.
     */
    public List<String> keywords() {
        return this.keywords;
    }

    /**
     * Get the attributes property: Attributes for the product system.
     *
     * @return the attributes value.
     */
    public List<String> attributes() {
        return this.attributes;
    }

    /**
     * Get the links property: Links for the product system.
     *
     * @return the links value.
     */
    public List<Link> links() {
        return this.links;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (links() != null) {
            links().forEach(e -> e.validate());
        }
    }
}