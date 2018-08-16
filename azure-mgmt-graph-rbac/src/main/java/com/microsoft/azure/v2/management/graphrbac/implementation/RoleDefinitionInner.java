/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.graphrbac.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Role definition.
 */
@JsonFlatten
public class RoleDefinitionInner {
    /**
     * The role definition ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The role definition name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The role definition type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The role name.
     */
    @JsonProperty(value = "properties.roleName")
    private String roleName;

    /**
     * The role definition description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The role type.
     */
    @JsonProperty(value = "properties.type")
    private String roleType;

    /**
     * Role definition permissions.
     */
    @JsonProperty(value = "properties.permissions")
    private List<PermissionInner> permissionsProperty;

    /**
     * Role definition assignable scopes.
     */
    @JsonProperty(value = "properties.assignableScopes")
    private List<String> assignableScopes;

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
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
     * Get the roleName value.
     *
     * @return the roleName value.
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set the roleName value.
     *
     * @param roleName the roleName value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the roleType value.
     *
     * @return the roleType value.
     */
    public String roleType() {
        return this.roleType;
    }

    /**
     * Set the roleType value.
     *
     * @param roleType the roleType value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * Get the permissionsProperty value.
     *
     * @return the permissionsProperty value.
     */
    public List<PermissionInner> permissionsProperty() {
        return this.permissionsProperty;
    }

    /**
     * Set the permissionsProperty value.
     *
     * @param permissionsProperty the permissionsProperty value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withPermissionsProperty(List<PermissionInner> permissionsProperty) {
        this.permissionsProperty = permissionsProperty;
        return this;
    }

    /**
     * Get the assignableScopes value.
     *
     * @return the assignableScopes value.
     */
    public List<String> assignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set the assignableScopes value.
     *
     * @param assignableScopes the assignableScopes value to set.
     * @return the RoleDefinitionInner object itself.
     */
    public RoleDefinitionInner withAssignableScopes(List<String> assignableScopes) {
        this.assignableScopes = assignableScopes;
        return this;
    }
}
