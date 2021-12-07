// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.implementation.converters;

import com.azure.communication.callingserver.implementation.models.CallingOperationResultDetailsInternal;
import com.azure.communication.callingserver.models.CallingOperationResultDetails;

/**
 * A converter between {@link CallingOperationResultDetailsInternal} and {@link CallingOperationResultDetails}.
 */
public final class ResultDetailsConverter {

    /**
     * Maps from {@link CallingOperationResultDetailsInternal} to {@link CallingOperationResultDetails}.
     */
    public static CallingOperationResultDetails convert(CallingOperationResultDetailsInternal callingOperationResultDetailsInternal) {
        if (callingOperationResultDetailsInternal == null) {
            return null;
        }

        return new CallingOperationResultDetails(
            callingOperationResultDetailsInternal.getCode(),
            callingOperationResultDetailsInternal.getSubcode(),
            callingOperationResultDetailsInternal.getMessage());
    }
}