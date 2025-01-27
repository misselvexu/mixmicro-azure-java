// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Direction. */
public final class Direction extends ExpandableStringEnum<Direction> {
    /** Static value uplink for Direction. */
    public static final Direction UPLINK = fromString("uplink");

    /** Static value downlink for Direction. */
    public static final Direction DOWNLINK = fromString("downlink");

    /**
     * Creates or finds a Direction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Direction.
     */
    @JsonCreator
    public static Direction fromString(String name) {
        return fromString(name, Direction.class);
    }

    /**
     * Gets known Direction values.
     *
     * @return known Direction values.
     */
    public static Collection<Direction> values() {
        return values(Direction.class);
    }
}
