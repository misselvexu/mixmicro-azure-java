// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PricingModelType. */
public final class PricingModelType extends ExpandableStringEnum<PricingModelType> {
    /** Static value On Demand for PricingModelType. */
    public static final PricingModelType ON_DEMAND = fromString("On Demand");

    /** Static value Reservation for PricingModelType. */
    public static final PricingModelType RESERVATION = fromString("Reservation");

    /** Static value Spot for PricingModelType. */
    public static final PricingModelType SPOT = fromString("Spot");

    /**
     * Creates or finds a PricingModelType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PricingModelType.
     */
    @JsonCreator
    public static PricingModelType fromString(String name) {
        return fromString(name, PricingModelType.class);
    }

    /** @return known PricingModelType values. */
    public static Collection<PricingModelType> values() {
        return values(PricingModelType.class);
    }
}