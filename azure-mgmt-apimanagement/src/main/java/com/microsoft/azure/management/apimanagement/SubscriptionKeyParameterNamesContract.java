/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription key parameter names details.
 */
public class SubscriptionKeyParameterNamesContract {
    /**
     * Subscription key header name.
     */
    @JsonProperty(value = "header")
    private String headerProperty;

    /**
     * Subscription key query string parameter name.
     */
    @JsonProperty(value = "query")
    private String query;

    /**
     * Get the headerProperty value.
     *
     * @return the headerProperty value
     */
    public String headerProperty() {
        return this.headerProperty;
    }

    /**
     * Set the headerProperty value.
     *
     * @param headerProperty the headerProperty value to set
     * @return the SubscriptionKeyParameterNamesContract object itself.
     */
    public SubscriptionKeyParameterNamesContract withHeaderProperty(String headerProperty) {
        this.headerProperty = headerProperty;
        return this;
    }

    /**
     * Get the query value.
     *
     * @return the query value
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query value.
     *
     * @param query the query value to set
     * @return the SubscriptionKeyParameterNamesContract object itself.
     */
    public SubscriptionKeyParameterNamesContract withQuery(String query) {
        this.query = query;
        return this;
    }

}
