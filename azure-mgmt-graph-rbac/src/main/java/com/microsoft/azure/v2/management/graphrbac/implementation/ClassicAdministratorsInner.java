/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.graphrbac.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.Page;
import com.microsoft.azure.v2.PagedList;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * ClassicAdministrators.
 */
public final class ClassicAdministratorsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private ClassicAdministratorsService service;

    /**
     * The service client containing this operation class.
     */
    private AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of ClassicAdministratorsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ClassicAdministratorsInner(AuthorizationManagementClientImpl client) {
        this.service = AzureProxy.create(ClassicAdministratorsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for ClassicAdministrators to be
     * used by the proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface ClassicAdministratorsService {
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/classicAdministrators")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<ClassicAdministratorInner>>> list(@PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<ClassicAdministratorInner>>> listNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;ClassicAdministratorInner&gt; object if successful.
     */
    public PagedList<ClassicAdministratorInner> list() {
        Page<ClassicAdministratorInner> response = listSinglePageAsync().blockingGet();
        return new PagedList<ClassicAdministratorInner>(response) {
            @Override
            public Page<ClassicAdministratorInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @return the observable to the PagedList&lt;ClassicAdministratorInner&gt; object.
     */
    public Observable<Page<ClassicAdministratorInner>> listAsync() {
        return listSinglePageAsync()
            .toObservable()
            .concatMap((Page<ClassicAdministratorInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink));
            });
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @return the Single&lt;Page&lt;ClassicAdministratorInner&gt;&gt; object if successful.
     */
    public Single<Page<ClassicAdministratorInner>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2015-06-01";
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<ClassicAdministratorInner>> res) -> res.body());
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;ClassicAdministratorInner&gt; object if successful.
     */
    public PagedList<ClassicAdministratorInner> listNext(@NonNull String nextPageLink) {
        Page<ClassicAdministratorInner> response = listNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<ClassicAdministratorInner>(response) {
            @Override
            public Page<ClassicAdministratorInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;ClassicAdministratorInner&gt; object.
     */
    public Observable<Page<ClassicAdministratorInner>> listNextAsync(@NonNull String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<ClassicAdministratorInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink1));
            });
    }

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;ClassicAdministratorInner&gt;&gt; object if successful.
     */
    public Single<Page<ClassicAdministratorInner>> listNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<ClassicAdministratorInner>> res) -> res.body());
    }
}
