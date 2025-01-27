// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OSImageVersion. */
public final class OSImageVersion extends ExpandableStringEnum<OSImageVersion> {
    /** Static value latest for OSImageVersion. */
    public static final OSImageVersion LATEST = fromString("latest");

    /**
     * Creates or finds a OSImageVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OSImageVersion.
     */
    @JsonCreator
    public static OSImageVersion fromString(String name) {
        return fromString(name, OSImageVersion.class);
    }

    /**
     * Gets known OSImageVersion values.
     *
     * @return known OSImageVersion values.
     */
    public static Collection<OSImageVersion> values() {
        return values(OSImageVersion.class);
    }
}
