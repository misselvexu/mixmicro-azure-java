// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.LabAccountsClient;
import com.azure.resourcemanager.labservices.fluent.models.GetRegionalAvailabilityResponseInner;
import com.azure.resourcemanager.labservices.fluent.models.LabAccountInner;
import com.azure.resourcemanager.labservices.models.CreateLabProperties;
import com.azure.resourcemanager.labservices.models.GetRegionalAvailabilityResponse;
import com.azure.resourcemanager.labservices.models.LabAccount;
import com.azure.resourcemanager.labservices.models.LabAccounts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LabAccountsImpl implements LabAccounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabAccountsImpl.class);

    private final LabAccountsClient innerClient;

    private final com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager;

    public LabAccountsImpl(
        LabAccountsClient innerClient, com.azure.resourcemanager.labservices.ManagedLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LabAccount> list() {
        PagedIterable<LabAccountInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new LabAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<LabAccount> list(String expand, String filter, Integer top, String orderby, Context context) {
        PagedIterable<LabAccountInner> inner = this.serviceClient().list(expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new LabAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<LabAccount> listByResourceGroup(String resourceGroupName) {
        PagedIterable<LabAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new LabAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<LabAccount> listByResourceGroup(
        String resourceGroupName, String expand, String filter, Integer top, String orderby, Context context) {
        PagedIterable<LabAccountInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new LabAccountImpl(inner1, this.manager()));
    }

    public LabAccount getByResourceGroup(String resourceGroupName, String labAccountName) {
        LabAccountInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, labAccountName);
        if (inner != null) {
            return new LabAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LabAccount> getByResourceGroupWithResponse(
        String resourceGroupName, String labAccountName, String expand, Context context) {
        Response<LabAccountInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, labAccountName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LabAccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String labAccountName) {
        this.serviceClient().delete(resourceGroupName, labAccountName);
    }

    public void delete(String resourceGroupName, String labAccountName, Context context) {
        this.serviceClient().delete(resourceGroupName, labAccountName, context);
    }

    public void createLab(String resourceGroupName, String labAccountName, CreateLabProperties createLabProperties) {
        this.serviceClient().createLab(resourceGroupName, labAccountName, createLabProperties);
    }

    public Response<Void> createLabWithResponse(
        String resourceGroupName, String labAccountName, CreateLabProperties createLabProperties, Context context) {
        return this
            .serviceClient()
            .createLabWithResponse(resourceGroupName, labAccountName, createLabProperties, context);
    }

    public GetRegionalAvailabilityResponse getRegionalAvailability(String resourceGroupName, String labAccountName) {
        GetRegionalAvailabilityResponseInner inner =
            this.serviceClient().getRegionalAvailability(resourceGroupName, labAccountName);
        if (inner != null) {
            return new GetRegionalAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GetRegionalAvailabilityResponse> getRegionalAvailabilityWithResponse(
        String resourceGroupName, String labAccountName, Context context) {
        Response<GetRegionalAvailabilityResponseInner> inner =
            this.serviceClient().getRegionalAvailabilityWithResponse(resourceGroupName, labAccountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GetRegionalAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LabAccount getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labAccountName = Utils.getValueFromIdByName(id, "labaccounts");
        if (labAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labaccounts'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, labAccountName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<LabAccount> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labAccountName = Utils.getValueFromIdByName(id, "labaccounts");
        if (labAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labaccounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, labAccountName, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labAccountName = Utils.getValueFromIdByName(id, "labaccounts");
        if (labAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labaccounts'.", id)));
        }
        this.delete(resourceGroupName, labAccountName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labAccountName = Utils.getValueFromIdByName(id, "labaccounts");
        if (labAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labaccounts'.", id)));
        }
        this.delete(resourceGroupName, labAccountName, context);
    }

    private LabAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.labservices.ManagedLabsManager manager() {
        return this.serviceManager;
    }

    public LabAccountImpl define(String name) {
        return new LabAccountImpl(name, this.manager());
    }
}