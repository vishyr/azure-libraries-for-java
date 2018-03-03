/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Azure Storage account information.
 */
@JsonFlatten
public class StorageAccountInformation extends SubResource {
    /**
     * The optional suffix for the storage account.
     */
    @JsonProperty(value = "properties.suffix", access = JsonProperty.Access.WRITE_ONLY)
    private String suffix;

    /**
     * Get the suffix value.
     *
     * @return the suffix value
     */
    public String suffix() {
        return this.suffix;
    }

}