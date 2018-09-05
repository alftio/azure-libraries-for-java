/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.graphrbac;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Request parameters for GetMemberGroups API call.
 */
public final class GroupGetMemberGroupsParameters {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * If true, only membership in security-enabled groups should be checked.
     * Otherwise, membership in all groups should be checked.
     */
    @JsonProperty(value = "securityEnabledOnly", required = true)
    private boolean securityEnabledOnly;

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties value.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GroupGetMemberGroupsParameters object itself.
     */
    public GroupGetMemberGroupsParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the securityEnabledOnly value.
     *
     * @return the securityEnabledOnly value.
     */
    public boolean securityEnabledOnly() {
        return this.securityEnabledOnly;
    }

    /**
     * Set the securityEnabledOnly value.
     *
     * @param securityEnabledOnly the securityEnabledOnly value to set.
     * @return the GroupGetMemberGroupsParameters object itself.
     */
    public GroupGetMemberGroupsParameters withSecurityEnabledOnly(boolean securityEnabledOnly) {
        this.securityEnabledOnly = securityEnabledOnly;
        return this;
    }
}