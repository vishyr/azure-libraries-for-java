/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import com.microsoft.azure.management.apimanagement.TagTagResourceContractProperties;
import com.microsoft.azure.management.apimanagement.ApiTagResourceContractProperties;
import com.microsoft.azure.management.apimanagement.OperationTagResourceContractProperties;
import com.microsoft.azure.management.apimanagement.ProductTagResourceContractProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TagResource contract properties.
 */
public class TagResourceContractInner {
    /**
     * Tag associated with the resource.
     */
    @JsonProperty(value = "tag", required = true)
    private TagTagResourceContractProperties tag;

    /**
     * Api associated with the tag.
     */
    @JsonProperty(value = "api")
    private ApiTagResourceContractProperties api;

    /**
     * Operation associated with the tag.
     */
    @JsonProperty(value = "operation")
    private OperationTagResourceContractProperties operation;

    /**
     * Product associated with the tag.
     */
    @JsonProperty(value = "product")
    private ProductTagResourceContractProperties product;

    /**
     * Get the tag value.
     *
     * @return the tag value
     */
    public TagTagResourceContractProperties tag() {
        return this.tag;
    }

    /**
     * Set the tag value.
     *
     * @param tag the tag value to set
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withTag(TagTagResourceContractProperties tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the api value.
     *
     * @return the api value
     */
    public ApiTagResourceContractProperties api() {
        return this.api;
    }

    /**
     * Set the api value.
     *
     * @param api the api value to set
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withApi(ApiTagResourceContractProperties api) {
        this.api = api;
        return this;
    }

    /**
     * Get the operation value.
     *
     * @return the operation value
     */
    public OperationTagResourceContractProperties operation() {
        return this.operation;
    }

    /**
     * Set the operation value.
     *
     * @param operation the operation value to set
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withOperation(OperationTagResourceContractProperties operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public ProductTagResourceContractProperties product() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     * @return the TagResourceContractInner object itself.
     */
    public TagResourceContractInner withProduct(ProductTagResourceContractProperties product) {
        this.product = product;
        return this;
    }

}
