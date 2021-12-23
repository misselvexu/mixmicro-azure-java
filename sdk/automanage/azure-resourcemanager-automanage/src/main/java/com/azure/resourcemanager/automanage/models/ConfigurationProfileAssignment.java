// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileAssignmentInner;

/** An immutable client-side representation of ConfigurationProfileAssignment. */
public interface ConfigurationProfileAssignment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Properties of the configuration profile assignment.
     *
     * @return the properties value.
     */
    ConfigurationProfileAssignmentProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileAssignmentInner object.
     *
     * @return the inner object.
     */
    ConfigurationProfileAssignmentInner innerModel();

    /** The entirety of the ConfigurationProfileAssignment definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ConfigurationProfileAssignment definition stages. */
    interface DefinitionStages {
        /** The first stage of the ConfigurationProfileAssignment definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ConfigurationProfileAssignment definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vmName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param vmName The name of the virtual machine.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualMachine(String resourceGroupName, String vmName);
        }
        /**
         * The stage of the ConfigurationProfileAssignment definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ConfigurationProfileAssignment create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ConfigurationProfileAssignment create(Context context);
        }
        /** The stage of the ConfigurationProfileAssignment definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the configuration profile assignment..
             *
             * @param properties Properties of the configuration profile assignment.
             * @return the next definition stage.
             */
            WithCreate withProperties(ConfigurationProfileAssignmentProperties properties);
        }
    }
    /**
     * Begins update for the ConfigurationProfileAssignment resource.
     *
     * @return the stage of resource update.
     */
    ConfigurationProfileAssignment.Update update();

    /** The template for ConfigurationProfileAssignment update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ConfigurationProfileAssignment apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ConfigurationProfileAssignment apply(Context context);
    }
    /** The ConfigurationProfileAssignment update stages. */
    interface UpdateStages {
        /** The stage of the ConfigurationProfileAssignment update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Properties of the configuration profile assignment..
             *
             * @param properties Properties of the configuration profile assignment.
             * @return the next definition stage.
             */
            Update withProperties(ConfigurationProfileAssignmentProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ConfigurationProfileAssignment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ConfigurationProfileAssignment refresh(Context context);
}