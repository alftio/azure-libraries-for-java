/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The health status of the VM.
 */
public final class VirtualMachineHealthStatus {
    /**
     * The health status information for the VM.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private InstanceViewStatus status;

    /**
     * Get the status value.
     *
     * @return the status value.
     */
    public InstanceViewStatus status() {
        return this.status;
    }
}