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
 * Contains information about a sign-in name of a local account user in an
 * Azure Active Directory B2C tenant.
 */
public final class SignInName {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * A string value that can be used to classify user sign-in types in your
     * directory, such as 'emailAddress' or 'userName'.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The sign-in used by the local account. Must be unique across the
     * company/tenant. For example, 'johnc@example.com'.
     */
    @JsonProperty(value = "value")
    private String value;

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
     * @return the SignInName object itself.
     */
    public SignInName withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set.
     * @return the SignInName object itself.
     */
    public SignInName withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set.
     * @return the SignInName object itself.
     */
    public SignInName withValue(String value) {
        this.value = value;
        return this;
    }
}
