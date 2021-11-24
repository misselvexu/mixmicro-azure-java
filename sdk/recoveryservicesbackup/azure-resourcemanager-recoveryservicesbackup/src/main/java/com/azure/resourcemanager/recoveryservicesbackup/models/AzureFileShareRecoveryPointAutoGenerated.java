// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Azure File Share workload specific backup copy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureFileShareRecoveryPoint")
@Immutable
public final class AzureFileShareRecoveryPointAutoGenerated extends RecoveryPoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFileShareRecoveryPointAutoGenerated.class);

    /*
     * Type of the backup copy. Specifies whether it is a crash consistent
     * backup or app consistent.
     */
    @JsonProperty(value = "recoveryPointType", access = JsonProperty.Access.WRITE_ONLY)
    private String recoveryPointType;

    /*
     * Time at which this backup copy was created.
     */
    @JsonProperty(value = "recoveryPointTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime recoveryPointTime;

    /*
     * Contains Url to the snapshot of fileshare, if applicable
     */
    @JsonProperty(value = "fileShareSnapshotUri", access = JsonProperty.Access.WRITE_ONLY)
    private String fileShareSnapshotUri;

    /*
     * Contains recovery point size
     */
    @JsonProperty(value = "recoveryPointSizeInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer recoveryPointSizeInGB;

    /**
     * Get the recoveryPointType property: Type of the backup copy. Specifies whether it is a crash consistent backup or
     * app consistent.
     *
     * @return the recoveryPointType value.
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Get the recoveryPointTime property: Time at which this backup copy was created.
     *
     * @return the recoveryPointTime value.
     */
    public OffsetDateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Get the fileShareSnapshotUri property: Contains Url to the snapshot of fileshare, if applicable.
     *
     * @return the fileShareSnapshotUri value.
     */
    public String fileShareSnapshotUri() {
        return this.fileShareSnapshotUri;
    }

    /**
     * Get the recoveryPointSizeInGB property: Contains recovery point size.
     *
     * @return the recoveryPointSizeInGB value.
     */
    public Integer recoveryPointSizeInGB() {
        return this.recoveryPointSizeInGB;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}