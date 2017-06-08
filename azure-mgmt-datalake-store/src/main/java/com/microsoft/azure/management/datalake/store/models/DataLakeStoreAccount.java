/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.store.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Data Lake Store account information.
 */
@JsonFlatten
public class DataLakeStoreAccount extends Resource {
    /**
     * The Key Vault encryption identity, if any.
     */
    @JsonProperty(value = "identity")
    private EncryptionIdentity identity;

    /**
     * the status of the Data Lake Store account while being provisioned.
     * Possible values include: 'Failed', 'Creating', 'Running', 'Succeeded',
     * 'Patching', 'Suspending', 'Resuming', 'Deleting', 'Deleted'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeStoreAccountStatus provisioningState;

    /**
     * the status of the Data Lake Store account after provisioning has
     * completed. Possible values include: 'Active', 'Suspended'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeStoreAccountState state;

    /**
     * the account creation time.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * The current state of encryption for this Data Lake store account.
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.encryptionState")
    private EncryptionState encryptionState;

    /**
     * The current state of encryption provisioning for this Data Lake store
     * account. Possible values include: 'Creating', 'Succeeded'.
     */
    @JsonProperty(value = "properties.encryptionProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private EncryptionProvisioningState encryptionProvisioningState;

    /**
     * The Key Vault encryption configuration.
     */
    @JsonProperty(value = "properties.encryptionConfig")
    private EncryptionConfig encryptionConfig;

    /**
     * The current state of the IP address firewall for this Data Lake store
     * account. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallState")
    private FirewallState firewallState;

    /**
     * The list of firewall rules associated with this Data Lake store account.
     */
    @JsonProperty(value = "properties.firewallRules")
    private List<FirewallRule> firewallRules;

    /**
     * The current state of the trusted identity provider feature for this Data
     * Lake store account. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.trustedIdProviderState")
    private TrustedIdProviderState trustedIdProviderState;

    /**
     * The list of trusted identity providers associated with this Data Lake
     * store account.
     */
    @JsonProperty(value = "properties.trustedIdProviders")
    private List<TrustedIdProvider> trustedIdProviders;

    /**
     * the account last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * the gateway host.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * the default owner group for all new folders and files created in the
     * Data Lake Store account.
     */
    @JsonProperty(value = "properties.defaultGroup")
    private String defaultGroup;

    /**
     * the commitment tier to use for next month. Possible values include:
     * 'Consumption', 'Commitment_1TB', 'Commitment_10TB', 'Commitment_100TB',
     * 'Commitment_500TB', 'Commitment_1PB', 'Commitment_5PB'.
     */
    @JsonProperty(value = "properties.newTier")
    private TierType newTier;

    /**
     * the commitment tier in use for the current month. Possible values
     * include: 'Consumption', 'Commitment_1TB', 'Commitment_10TB',
     * 'Commitment_100TB', 'Commitment_500TB', 'Commitment_1PB',
     * 'Commitment_5PB'.
     */
    @JsonProperty(value = "properties.currentTier", access = JsonProperty.Access.WRITE_ONLY)
    private TierType currentTier;

    /**
     * The current state of allowing or disallowing IPs originating within
     * Azure through the firewall. If the firewall is disabled, this is not
     * enforced. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallAllowAzureIps")
    private FirewallAllowAzureIpsState firewallAllowAzureIps;

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public EncryptionIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withIdentity(EncryptionIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public DataLakeStoreAccountStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public DataLakeStoreAccountState state() {
        return this.state;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the encryptionState value.
     *
     * @return the encryptionState value
     */
    public EncryptionState encryptionState() {
        return this.encryptionState;
    }

    /**
     * Set the encryptionState value.
     *
     * @param encryptionState the encryptionState value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withEncryptionState(EncryptionState encryptionState) {
        this.encryptionState = encryptionState;
        return this;
    }

    /**
     * Get the encryptionProvisioningState value.
     *
     * @return the encryptionProvisioningState value
     */
    public EncryptionProvisioningState encryptionProvisioningState() {
        return this.encryptionProvisioningState;
    }

    /**
     * Get the encryptionConfig value.
     *
     * @return the encryptionConfig value
     */
    public EncryptionConfig encryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Set the encryptionConfig value.
     *
     * @param encryptionConfig the encryptionConfig value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    /**
     * Get the firewallState value.
     *
     * @return the firewallState value
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the firewallState value.
     *
     * @param firewallState the firewallState value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the firewallRules value.
     *
     * @return the firewallRules value
     */
    public List<FirewallRule> firewallRules() {
        return this.firewallRules;
    }

    /**
     * Set the firewallRules value.
     *
     * @param firewallRules the firewallRules value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withFirewallRules(List<FirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    /**
     * Get the trustedIdProviderState value.
     *
     * @return the trustedIdProviderState value
     */
    public TrustedIdProviderState trustedIdProviderState() {
        return this.trustedIdProviderState;
    }

    /**
     * Set the trustedIdProviderState value.
     *
     * @param trustedIdProviderState the trustedIdProviderState value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withTrustedIdProviderState(TrustedIdProviderState trustedIdProviderState) {
        this.trustedIdProviderState = trustedIdProviderState;
        return this;
    }

    /**
     * Get the trustedIdProviders value.
     *
     * @return the trustedIdProviders value
     */
    public List<TrustedIdProvider> trustedIdProviders() {
        return this.trustedIdProviders;
    }

    /**
     * Set the trustedIdProviders value.
     *
     * @param trustedIdProviders the trustedIdProviders value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withTrustedIdProviders(List<TrustedIdProvider> trustedIdProviders) {
        this.trustedIdProviders = trustedIdProviders;
        return this;
    }

    /**
     * Get the lastModifiedTime value.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the defaultGroup value.
     *
     * @return the defaultGroup value
     */
    public String defaultGroup() {
        return this.defaultGroup;
    }

    /**
     * Set the defaultGroup value.
     *
     * @param defaultGroup the defaultGroup value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withDefaultGroup(String defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * Get the newTier value.
     *
     * @return the newTier value
     */
    public TierType newTier() {
        return this.newTier;
    }

    /**
     * Set the newTier value.
     *
     * @param newTier the newTier value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withNewTier(TierType newTier) {
        this.newTier = newTier;
        return this;
    }

    /**
     * Get the currentTier value.
     *
     * @return the currentTier value
     */
    public TierType currentTier() {
        return this.currentTier;
    }

    /**
     * Get the firewallAllowAzureIps value.
     *
     * @return the firewallAllowAzureIps value
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }

    /**
     * Set the firewallAllowAzureIps value.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set
     * @return the DataLakeStoreAccount object itself.
     */
    public DataLakeStoreAccount withFirewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        return this;
    }

}
