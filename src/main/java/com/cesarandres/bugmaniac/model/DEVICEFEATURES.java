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
    "android.hardware.location.network",
    "android.hardware.touchscreen"
})

@Serialize
public class DEVICEFEATURES implements Serializable{

	private static final long serialVersionUID = -8180588586163917713L;
	
	@JsonProperty("android.hardware.location.network")
    private Boolean androidHardwareLocationNetwork;
    @JsonProperty("android.hardware.touchscreen")
    private Boolean androidHardwareTouchscreen;

    /**
     * 
     * @return
     *     The androidHardwareLocationNetwork
     */
    @JsonProperty("android.hardware.location.network")
    public Boolean getAndroidHardwareLocationNetwork() {
        return androidHardwareLocationNetwork;
    }

    /**
     * 
     * @param androidHardwareLocationNetwork
     *     The android.hardware.location.network
     */
    @JsonProperty("android.hardware.location.network")
    public void setAndroidHardwareLocationNetwork(Boolean androidHardwareLocationNetwork) {
        this.androidHardwareLocationNetwork = androidHardwareLocationNetwork;
    }

    /**
     * 
     * @return
     *     The androidHardwareTouchscreen
     */
    @JsonProperty("android.hardware.touchscreen")
    public Boolean getAndroidHardwareTouchscreen() {
        return androidHardwareTouchscreen;
    }

    /**
     * 
     * @param androidHardwareTouchscreen
     *     The android.hardware.touchscreen
     */
    @JsonProperty("android.hardware.touchscreen")
    public void setAndroidHardwareTouchscreen(Boolean androidHardwareTouchscreen) {
        this.androidHardwareTouchscreen = androidHardwareTouchscreen;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(androidHardwareLocationNetwork).append(androidHardwareTouchscreen).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DEVICEFEATURES) == false) {
            return false;
        }
        DEVICEFEATURES rhs = ((DEVICEFEATURES) other);
        return new EqualsBuilder().append(androidHardwareLocationNetwork, rhs.androidHardwareLocationNetwork).append(androidHardwareTouchscreen, rhs.androidHardwareTouchscreen).isEquals();
    }

}
