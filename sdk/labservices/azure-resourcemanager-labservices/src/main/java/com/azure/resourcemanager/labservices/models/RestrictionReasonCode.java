// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RestrictionReasonCode. */
public final class RestrictionReasonCode extends ExpandableStringEnum<RestrictionReasonCode> {
    /** Static value QuotaId for RestrictionReasonCode. */
    public static final RestrictionReasonCode QUOTA_ID = fromString("QuotaId");

    /** Static value NotAvailableForSubscription for RestrictionReasonCode. */
    public static final RestrictionReasonCode NOT_AVAILABLE_FOR_SUBSCRIPTION =
        fromString("NotAvailableForSubscription");

    /**
     * Creates or finds a RestrictionReasonCode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RestrictionReasonCode.
     */
    @JsonCreator
    public static RestrictionReasonCode fromString(String name) {
        return fromString(name, RestrictionReasonCode.class);
    }

    /** @return known RestrictionReasonCode values. */
    public static Collection<RestrictionReasonCode> values() {
        return values(RestrictionReasonCode.class);
    }
}
