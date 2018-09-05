/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.msi.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.Resource;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.UUID;

/**
 * Describes an identity resource.
 */
@JsonFlatten
public class IdentityInner extends Resource {
    /**
     * The id of the tenant which the identity belongs to.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /**
     * The id of the service principal object associated with the created
     * identity.
     */
    @JsonProperty(value = "properties.principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /**
     * The id of the app associated with the identity. This is a random
     * generated UUID by MSI.
     */
    @JsonProperty(value = "properties.clientId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID clientId;

    /**
     * The ManagedServiceIdentity DataPlane URL that can be queried to obtain
     * the identity credentials.
     */
    @JsonProperty(value = "properties.clientSecretUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String clientSecretUrl;

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the principalId value.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId value.
     *
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Get the clientSecretUrl value.
     *
     * @return the clientSecretUrl value.
     */
    public String clientSecretUrl() {
        return this.clientSecretUrl;
    }
}
