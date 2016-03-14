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
    "CODENAME",
    "RELEASE",
    "INCREMENTAL",
    "SDK_INT",
    "RESOURCES_SDK_INT",
    "SDK"
})

@Serialize
public class VERSION implements Serializable{

	private static final long serialVersionUID = -1314764277584802188L;

	@JsonProperty("CODENAME")
    private String CODENAME;
    @JsonProperty("RELEASE")
    private String RELEASE;
    @JsonProperty("INCREMENTAL")
    private String INCREMENTAL;
    @JsonProperty("SDK_INT")
    private String SDKINT;
    @JsonProperty("RESOURCES_SDK_INT")
    private String RESOURCESSDKINT;
    @JsonProperty("SDK")
    private String SDK;

    /**
     * 
     * @return
     *     The CODENAME
     */
    @JsonProperty("CODENAME")
    public String getCODENAME() {
        return CODENAME;
    }

    /**
     * 
     * @param CODENAME
     *     The CODENAME
     */
    @JsonProperty("CODENAME")
    public void setCODENAME(String CODENAME) {
        this.CODENAME = CODENAME;
    }

    /**
     * 
     * @return
     *     The RELEASE
     */
    @JsonProperty("RELEASE")
    public String getRELEASE() {
        return RELEASE;
    }

    /**
     * 
     * @param RELEASE
     *     The RELEASE
     */
    @JsonProperty("RELEASE")
    public void setRELEASE(String RELEASE) {
        this.RELEASE = RELEASE;
    }

    /**
     * 
     * @return
     *     The INCREMENTAL
     */
    @JsonProperty("INCREMENTAL")
    public String getINCREMENTAL() {
        return INCREMENTAL;
    }

    /**
     * 
     * @param INCREMENTAL
     *     The INCREMENTAL
     */
    @JsonProperty("INCREMENTAL")
    public void setINCREMENTAL(String INCREMENTAL) {
        this.INCREMENTAL = INCREMENTAL;
    }

    /**
     * 
     * @return
     *     The SDKINT
     */
    @JsonProperty("SDK_INT")
    public String getSDKINT() {
        return SDKINT;
    }

    /**
     * 
     * @param SDKINT
     *     The SDK_INT
     */
    @JsonProperty("SDK_INT")
    public void setSDKINT(String SDKINT) {
        this.SDKINT = SDKINT;
    }

    /**
     * 
     * @return
     *     The RESOURCESSDKINT
     */
    @JsonProperty("RESOURCES_SDK_INT")
    public String getRESOURCESSDKINT() {
        return RESOURCESSDKINT;
    }

    /**
     * 
     * @param RESOURCESSDKINT
     *     The RESOURCES_SDK_INT
     */
    @JsonProperty("RESOURCES_SDK_INT")
    public void setRESOURCESSDKINT(String RESOURCESSDKINT) {
        this.RESOURCESSDKINT = RESOURCESSDKINT;
    }

    /**
     * 
     * @return
     *     The SDK
     */
    @JsonProperty("SDK")
    public String getSDK() {
        return SDK;
    }

    /**
     * 
     * @param SDK
     *     The SDK
     */
    @JsonProperty("SDK")
    public void setSDK(String SDK) {
        this.SDK = SDK;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(CODENAME).append(RELEASE).append(INCREMENTAL).append(SDKINT).append(RESOURCESSDKINT).append(SDK).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VERSION) == false) {
            return false;
        }
        VERSION rhs = ((VERSION) other);
        return new EqualsBuilder().append(CODENAME, rhs.CODENAME).append(RELEASE, rhs.RELEASE).append(INCREMENTAL, rhs.INCREMENTAL).append(SDKINT, rhs.SDKINT).append(RESOURCESSDKINT, rhs.RESOURCESSDKINT).append(SDK, rhs.SDK).isEquals();
    }

}
