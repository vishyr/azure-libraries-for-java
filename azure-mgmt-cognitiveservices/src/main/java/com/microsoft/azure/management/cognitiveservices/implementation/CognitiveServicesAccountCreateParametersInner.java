/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.implementation;

import com.microsoft.azure.management.cognitiveservices.Kind;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters to provide for the account.
 */
public class CognitiveServicesAccountCreateParametersInner {
    /**
     * Required. Gets or sets the SKU of the resource.
     */
    @JsonProperty(value = "sku", required = true)
    private SkuInner sku;

    /**
     * Required. Gets or sets the Kind of the resource. Possible values
     * include: 'Bing.Autosuggest.v7', 'Bing.CustomSearch', 'Bing.Search.v7',
     * 'Bing.Speech', 'Bing.SpellCheck.v7', 'ComputerVision',
     * 'ContentModerator', 'CustomSpeech', 'CustomVision.Prediction',
     * 'CustomVision.Training', 'Emotion', 'Face', 'LUIS', 'QnAMaker',
     * 'SpeakerRecognition', 'SpeechTranslation', 'TextAnalytics',
     * 'TextTranslation', 'WebLM'.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /**
     * Required. Gets or sets the location of the resource. This will be one of
     * the supported and registered Azure Geo Regions (e.g. West US, East US,
     * Southeast Asia, etc.). The geo region of a resource cannot be changed
     * once it is created, but if an identical geo region is specified on
     * update the request will succeed.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used in viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key no greater than 128 characters and value no greater than
     * 256 characters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Must exist in the request. Must be an empty object. Must not be null.
     */
    @JsonProperty(value = "properties", required = true)
    private Object properties;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuInner sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the CognitiveServicesAccountCreateParametersInner object itself.
     */
    public CognitiveServicesAccountCreateParametersInner withSku(SkuInner sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the CognitiveServicesAccountCreateParametersInner object itself.
     */
    public CognitiveServicesAccountCreateParametersInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the CognitiveServicesAccountCreateParametersInner object itself.
     */
    public CognitiveServicesAccountCreateParametersInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the CognitiveServicesAccountCreateParametersInner object itself.
     */
    public CognitiveServicesAccountCreateParametersInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the CognitiveServicesAccountCreateParametersInner object itself.
     */
    public CognitiveServicesAccountCreateParametersInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
