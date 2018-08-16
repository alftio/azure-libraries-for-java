/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.graphrbac.implementation;

import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import com.microsoft.rest.v2.http.HttpPipeline;
import io.reactivex.annotations.NonNull;

/**
 * Initializes a new instance of the AuthorizationManagementClientImpl type.
 */
public final class AuthorizationManagementClientImpl extends AzureServiceClient {
    /**
     * The ID of the target subscription.
     */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public AuthorizationManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * The preferred language for the response.
     */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself.
     */
    public AuthorizationManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * The retry timeout in seconds for Long Running Operations. Default value is 30.
     */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself.
     */
    public AuthorizationManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /**
     * Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself.
     */
    public AuthorizationManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ClassicAdministratorsInner object to access its operations.
     */
    private ClassicAdministratorsInner classicAdministrators;

    /**
     * Gets the ClassicAdministratorsInner object to access its operations.
     *
     * @return the ClassicAdministratorsInner object.
     */
    public ClassicAdministratorsInner classicAdministrators() {
        return this.classicAdministrators;
    }

    /**
     * The ProviderOperationsMetadatasInner object to access its operations.
     */
    private ProviderOperationsMetadatasInner providerOperationsMetadatas;

    /**
     * Gets the ProviderOperationsMetadatasInner object to access its operations.
     *
     * @return the ProviderOperationsMetadatasInner object.
     */
    public ProviderOperationsMetadatasInner providerOperationsMetadatas() {
        return this.providerOperationsMetadatas;
    }

    /**
     * The PermissionsInner object to access its operations.
     */
    private PermissionsInner permissions;

    /**
     * Gets the PermissionsInner object to access its operations.
     *
     * @return the PermissionsInner object.
     */
    public PermissionsInner permissions() {
        return this.permissions;
    }

    /**
     * The RoleAssignmentsInner object to access its operations.
     */
    private RoleAssignmentsInner roleAssignments;

    /**
     * Gets the RoleAssignmentsInner object to access its operations.
     *
     * @return the RoleAssignmentsInner object.
     */
    public RoleAssignmentsInner roleAssignments() {
        return this.roleAssignments;
    }

    /**
     * The RoleDefinitionsInner object to access its operations.
     */
    private RoleDefinitionsInner roleDefinitions;

    /**
     * Gets the RoleDefinitionsInner object to access its operations.
     *
     * @return the RoleDefinitionsInner object.
     */
    public RoleDefinitionsInner roleDefinitions() {
        return this.roleDefinitions;
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     *
     * @param credentials the management credentials for Azure.
     */
    public AuthorizationManagementClientImpl(@NonNull ServiceClientCredentials credentials) {
        this(AzureProxy.createDefaultPipeline(AuthorizationManagementClientImpl.class, credentials));
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     *
     * @param credentials the management credentials for Azure.
     * @param azureEnvironment The environment that requests will target.
     */
    public AuthorizationManagementClientImpl(@NonNull ServiceClientCredentials credentials, @NonNull AzureEnvironment azureEnvironment) {
        this(AzureProxy.createDefaultPipeline(AuthorizationManagementClientImpl.class, credentials), azureEnvironment);
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AuthorizationManagementClientImpl(@NonNull HttpPipeline httpPipeline) {
        this(httpPipeline, null);
    }

    /**
     * Initializes an instance of AuthorizationManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param azureEnvironment The environment that requests will target.
     */
    public AuthorizationManagementClientImpl(@NonNull HttpPipeline httpPipeline, @NonNull AzureEnvironment azureEnvironment) {
        super(httpPipeline, azureEnvironment);
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.classicAdministrators = new ClassicAdministratorsInner(this);
        this.providerOperationsMetadatas = new ProviderOperationsMetadatasInner(this);
        this.permissions = new PermissionsInner(this);
        this.roleAssignments = new RoleAssignmentsInner(this);
        this.roleDefinitions = new RoleDefinitionsInner(this);
    }
}
