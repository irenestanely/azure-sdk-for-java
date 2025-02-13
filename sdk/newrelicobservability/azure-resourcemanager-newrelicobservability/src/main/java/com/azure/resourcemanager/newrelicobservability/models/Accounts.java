// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Accounts. */
public interface Accounts {
    /**
     * List all the existing accounts.
     *
     * @param userEmail User Email.
     * @param location Location for NewRelic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of get all accounts Operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AccountResource> list(String userEmail, String location);

    /**
     * List all the existing accounts.
     *
     * @param userEmail User Email.
     * @param location Location for NewRelic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of get all accounts Operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AccountResource> list(String userEmail, String location, Context context);
}
