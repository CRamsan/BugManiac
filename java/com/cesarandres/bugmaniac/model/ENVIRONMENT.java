package com.cesarandres.bugmaniac.model;

import java.io.Serializable;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.googlecode.objectify.annotation.Serialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "getDownloadCacheDirectory",
    "getSecureDataDirectory",
    "getMediaStorageDirectory",
    "getExternalStorageState",
    "getExternalStorageDirectory",
    "getEmulatedStorageObbSource",
    "isExternalStorageRemovable",
    "getLegacyExternalStorageObbDirectory",
    "isEncryptedFilesystemEnabled",
    "getLegacyExternalStorageDirectory",
    "getSystemSecureDirectory",
    "isExternalStorageEmulated",
    "getRootDirectory",
    "getDataDirectory"
})

@Serialize
public class ENVIRONMENT implements Serializable{

	private static final long serialVersionUID = -4047737419748072004L;
	
	@JsonProperty("getDownloadCacheDirectory")
    private String getDownloadCacheDirectory;
    @JsonProperty("getSecureDataDirectory")
    private String getSecureDataDirectory;
    @JsonProperty("getMediaStorageDirectory")
    private String getMediaStorageDirectory;
    @JsonProperty("getExternalStorageState")
    private String getExternalStorageState;
    @JsonProperty("getExternalStorageDirectory")
    private String getExternalStorageDirectory;
    @JsonProperty("getEmulatedStorageObbSource")
    private String getEmulatedStorageObbSource;
    @JsonProperty("isExternalStorageRemovable")
    private Boolean isExternalStorageRemovable;
    @JsonProperty("getLegacyExternalStorageObbDirectory")
    private String getLegacyExternalStorageObbDirectory;
    @JsonProperty("isEncryptedFilesystemEnabled")
    private Boolean isEncryptedFilesystemEnabled;
    @JsonProperty("getLegacyExternalStorageDirectory")
    private String getLegacyExternalStorageDirectory;
    @JsonProperty("getSystemSecureDirectory")
    private String getSystemSecureDirectory;
    @JsonProperty("isExternalStorageEmulated")
    private Boolean isExternalStorageEmulated;
    @JsonProperty("getRootDirectory")
    private String getRootDirectory;
    @JsonProperty("getDataDirectory")
    private String getDataDirectory;

    /**
     * 
     * @return
     *     The getDownloadCacheDirectory
     */
    @JsonProperty("getDownloadCacheDirectory")
    public String getGetDownloadCacheDirectory() {
        return getDownloadCacheDirectory;
    }

    /**
     * 
     * @param getDownloadCacheDirectory
     *     The getDownloadCacheDirectory
     */
    @JsonProperty("getDownloadCacheDirectory")
    public void setGetDownloadCacheDirectory(String getDownloadCacheDirectory) {
        this.getDownloadCacheDirectory = getDownloadCacheDirectory;
    }

    /**
     * 
     * @return
     *     The getSecureDataDirectory
     */
    @JsonProperty("getSecureDataDirectory")
    public String getGetSecureDataDirectory() {
        return getSecureDataDirectory;
    }

    /**
     * 
     * @param getSecureDataDirectory
     *     The getSecureDataDirectory
     */
    @JsonProperty("getSecureDataDirectory")
    public void setGetSecureDataDirectory(String getSecureDataDirectory) {
        this.getSecureDataDirectory = getSecureDataDirectory;
    }

    /**
     * 
     * @return
     *     The getMediaStorageDirectory
     */
    @JsonProperty("getMediaStorageDirectory")
    public String getGetMediaStorageDirectory() {
        return getMediaStorageDirectory;
    }

    /**
     * 
     * @param getMediaStorageDirectory
     *     The getMediaStorageDirectory
     */
    @JsonProperty("getMediaStorageDirectory")
    public void setGetMediaStorageDirectory(String getMediaStorageDirectory) {
        this.getMediaStorageDirectory = getMediaStorageDirectory;
    }

    /**
     * 
     * @return
     *     The getExternalStorageState
     */
    @JsonProperty("getExternalStorageState")
    public String getGetExternalStorageState() {
        return getExternalStorageState;
    }

    /**
     * 
     * @param getExternalStorageState
     *     The getExternalStorageState
     */
    @JsonProperty("getExternalStorageState")
    public void setGetExternalStorageState(String getExternalStorageState) {
        this.getExternalStorageState = getExternalStorageState;
    }

    /**
     * 
     * @return
     *     The getExternalStorageDirectory
     */
    @JsonProperty("getExternalStorageDirectory")
    public String getGetExternalStorageDirectory() {
        return getExternalStorageDirectory;
    }

    /**
     * 
     * @param getExternalStorageDirectory
     *     The getExternalStorageDirectory
     */
    @JsonProperty("getExternalStorageDirectory")
    public void setGetExternalStorageDirectory(String getExternalStorageDirectory) {
        this.getExternalStorageDirectory = getExternalStorageDirectory;
    }

    /**
     * 
     * @return
     *     The getEmulatedStorageObbSource
     */
    @JsonProperty("getEmulatedStorageObbSource")
    public String getGetEmulatedStorageObbSource() {
        return getEmulatedStorageObbSource;
    }

    /**
     * 
     * @param getEmulatedStorageObbSource
     *     The getEmulatedStorageObbSource
     */
    @JsonProperty("getEmulatedStorageObbSource")
    public void setGetEmulatedStorageObbSource(String getEmulatedStorageObbSource) {
        this.getEmulatedStorageObbSource = getEmulatedStorageObbSource;
    }

    /**
     * 
     * @return
     *     The isExternalStorageRemovable
     */
    @JsonProperty("isExternalStorageRemovable")
    public Boolean getIsExternalStorageRemovable() {
        return isExternalStorageRemovable;
    }

    /**
     * 
     * @param isExternalStorageRemovable
     *     The isExternalStorageRemovable
     */
    @JsonProperty("isExternalStorageRemovable")
    public void setIsExternalStorageRemovable(Boolean isExternalStorageRemovable) {
        this.isExternalStorageRemovable = isExternalStorageRemovable;
    }

    /**
     * 
     * @return
     *     The getLegacyExternalStorageObbDirectory
     */
    @JsonProperty("getLegacyExternalStorageObbDirectory")
    public String getGetLegacyExternalStorageObbDirectory() {
        return getLegacyExternalStorageObbDirectory;
    }

    /**
     * 
     * @param getLegacyExternalStorageObbDirectory
     *     The getLegacyExternalStorageObbDirectory
     */
    @JsonProperty("getLegacyExternalStorageObbDirectory")
    public void setGetLegacyExternalStorageObbDirectory(String getLegacyExternalStorageObbDirectory) {
        this.getLegacyExternalStorageObbDirectory = getLegacyExternalStorageObbDirectory;
    }

    /**
     * 
     * @return
     *     The isEncryptedFilesystemEnabled
     */
    @JsonProperty("isEncryptedFilesystemEnabled")
    public Boolean getIsEncryptedFilesystemEnabled() {
        return isEncryptedFilesystemEnabled;
    }

    /**
     * 
     * @param isEncryptedFilesystemEnabled
     *     The isEncryptedFilesystemEnabled
     */
    @JsonProperty("isEncryptedFilesystemEnabled")
    public void setIsEncryptedFilesystemEnabled(Boolean isEncryptedFilesystemEnabled) {
        this.isEncryptedFilesystemEnabled = isEncryptedFilesystemEnabled;
    }

    /**
     * 
     * @return
     *     The getLegacyExternalStorageDirectory
     */
    @JsonProperty("getLegacyExternalStorageDirectory")
    public String getGetLegacyExternalStorageDirectory() {
        return getLegacyExternalStorageDirectory;
    }

    /**
     * 
     * @param getLegacyExternalStorageDirectory
     *     The getLegacyExternalStorageDirectory
     */
    @JsonProperty("getLegacyExternalStorageDirectory")
    public void setGetLegacyExternalStorageDirectory(String getLegacyExternalStorageDirectory) {
        this.getLegacyExternalStorageDirectory = getLegacyExternalStorageDirectory;
    }

    /**
     * 
     * @return
     *     The getSystemSecureDirectory
     */
    @JsonProperty("getSystemSecureDirectory")
    public String getGetSystemSecureDirectory() {
        return getSystemSecureDirectory;
    }

    /**
     * 
     * @param getSystemSecureDirectory
     *     The getSystemSecureDirectory
     */
    @JsonProperty("getSystemSecureDirectory")
    public void setGetSystemSecureDirectory(String getSystemSecureDirectory) {
        this.getSystemSecureDirectory = getSystemSecureDirectory;
    }

    /**
     * 
     * @return
     *     The isExternalStorageEmulated
     */
    @JsonProperty("isExternalStorageEmulated")
    public Boolean getIsExternalStorageEmulated() {
        return isExternalStorageEmulated;
    }

    /**
     * 
     * @param isExternalStorageEmulated
     *     The isExternalStorageEmulated
     */
    @JsonProperty("isExternalStorageEmulated")
    public void setIsExternalStorageEmulated(Boolean isExternalStorageEmulated) {
        this.isExternalStorageEmulated = isExternalStorageEmulated;
    }

    /**
     * 
     * @return
     *     The getRootDirectory
     */
    @JsonProperty("getRootDirectory")
    public String getGetRootDirectory() {
        return getRootDirectory;
    }

    /**
     * 
     * @param getRootDirectory
     *     The getRootDirectory
     */
    @JsonProperty("getRootDirectory")
    public void setGetRootDirectory(String getRootDirectory) {
        this.getRootDirectory = getRootDirectory;
    }

    /**
     * 
     * @return
     *     The getDataDirectory
     */
    @JsonProperty("getDataDirectory")
    public String getGetDataDirectory() {
        return getDataDirectory;
    }

    /**
     * 
     * @param getDataDirectory
     *     The getDataDirectory
     */
    @JsonProperty("getDataDirectory")
    public void setGetDataDirectory(String getDataDirectory) {
        this.getDataDirectory = getDataDirectory;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(getDownloadCacheDirectory).append(getSecureDataDirectory).append(getMediaStorageDirectory).append(getExternalStorageState).append(getExternalStorageDirectory).append(getEmulatedStorageObbSource).append(isExternalStorageRemovable).append(getLegacyExternalStorageObbDirectory).append(isEncryptedFilesystemEnabled).append(getLegacyExternalStorageDirectory).append(getSystemSecureDirectory).append(isExternalStorageEmulated).append(getRootDirectory).append(getDataDirectory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ENVIRONMENT) == false) {
            return false;
        }
        ENVIRONMENT rhs = ((ENVIRONMENT) other);
        return new EqualsBuilder().append(getDownloadCacheDirectory, rhs.getDownloadCacheDirectory).append(getSecureDataDirectory, rhs.getSecureDataDirectory).append(getMediaStorageDirectory, rhs.getMediaStorageDirectory).append(getExternalStorageState, rhs.getExternalStorageState).append(getExternalStorageDirectory, rhs.getExternalStorageDirectory).append(getEmulatedStorageObbSource, rhs.getEmulatedStorageObbSource).append(isExternalStorageRemovable, rhs.isExternalStorageRemovable).append(getLegacyExternalStorageObbDirectory, rhs.getLegacyExternalStorageObbDirectory).append(isEncryptedFilesystemEnabled, rhs.isEncryptedFilesystemEnabled).append(getLegacyExternalStorageDirectory, rhs.getLegacyExternalStorageDirectory).append(getSystemSecureDirectory, rhs.getSystemSecureDirectory).append(isExternalStorageEmulated, rhs.isExternalStorageEmulated).append(getRootDirectory, rhs.getRootDirectory).append(getDataDirectory, rhs.getDataDirectory).isEquals();
    }

}
