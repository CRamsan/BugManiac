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
    "pixelFormat",
    "orientation",
    "height",
    "flags",
    "rotation",
    "width",
    "name",
    "rectSize",
    "currentSizeRange",
    "isValid",
    "getSize",
    "getRealSize",
    "refreshRate"
})

@Serialize
public class SCREEN implements Serializable{

	private static final long serialVersionUID = 1271650189121018286L;

	@JsonProperty("pixelFormat")
    private Long pixelFormat;
    @JsonProperty("orientation")
    private Long orientation;
    @JsonProperty("height")
    private Long height;
    @JsonProperty("flags")
    private String flags;
    @JsonProperty("rotation")
    private String rotation;
    @JsonProperty("width")
    private Long width;
    @JsonProperty("name")
    private String name;
    @JsonProperty("rectSize")
    private String rectSize;
    @JsonProperty("currentSizeRange")
    private CurrentSizeRange currentSizeRange;
    @JsonProperty("isValid")
    private Boolean isValid;
    @JsonProperty("getSize")
    private String getSize;
    @JsonProperty("getRealSize")
    private String getRealSize;
    @JsonProperty("refreshRate")
    private Double refreshRate;

    /**
     * 
     * @return
     *     The pixelFormat
     */
    @JsonProperty("pixelFormat")
    public Long getPixelFormat() {
        return pixelFormat;
    }

    /**
     * 
     * @param pixelFormat
     *     The pixelFormat
     */
    @JsonProperty("pixelFormat")
    public void setPixelFormat(Long pixelFormat) {
        this.pixelFormat = pixelFormat;
    }

    /**
     * 
     * @return
     *     The orientation
     */
    @JsonProperty("orientation")
    public Long getOrientation() {
        return orientation;
    }

    /**
     * 
     * @param orientation
     *     The orientation
     */
    @JsonProperty("orientation")
    public void setOrientation(Long orientation) {
        this.orientation = orientation;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Long getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The flags
     */
    @JsonProperty("flags")
    public String getFlags() {
        return flags;
    }

    /**
     * 
     * @param flags
     *     The flags
     */
    @JsonProperty("flags")
    public void setFlags(String flags) {
        this.flags = flags;
    }

    /**
     * 
     * @return
     *     The rotation
     */
    @JsonProperty("rotation")
    public String getRotation() {
        return rotation;
    }

    /**
     * 
     * @param rotation
     *     The rotation
     */
    @JsonProperty("rotation")
    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public Long getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(Long width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The rectSize
     */
    @JsonProperty("rectSize")
    public String getRectSize() {
        return rectSize;
    }

    /**
     * 
     * @param rectSize
     *     The rectSize
     */
    @JsonProperty("rectSize")
    public void setRectSize(String rectSize) {
        this.rectSize = rectSize;
    }

    /**
     * 
     * @return
     *     The currentSizeRange
     */
    @JsonProperty("currentSizeRange")
    public CurrentSizeRange getCurrentSizeRange() {
        return currentSizeRange;
    }

    /**
     * 
     * @param currentSizeRange
     *     The currentSizeRange
     */
    @JsonProperty("currentSizeRange")
    public void setCurrentSizeRange(CurrentSizeRange currentSizeRange) {
        this.currentSizeRange = currentSizeRange;
    }

    /**
     * 
     * @return
     *     The isValid
     */
    @JsonProperty("isValid")
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * 
     * @param isValid
     *     The isValid
     */
    @JsonProperty("isValid")
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * 
     * @return
     *     The getSize
     */
    @JsonProperty("getSize")
    public String getGetSize() {
        return getSize;
    }

    /**
     * 
     * @param getSize
     *     The getSize
     */
    @JsonProperty("getSize")
    public void setGetSize(String getSize) {
        this.getSize = getSize;
    }

    /**
     * 
     * @return
     *     The getRealSize
     */
    @JsonProperty("getRealSize")
    public String getGetRealSize() {
        return getRealSize;
    }

    /**
     * 
     * @param getRealSize
     *     The getRealSize
     */
    @JsonProperty("getRealSize")
    public void setGetRealSize(String getRealSize) {
        this.getRealSize = getRealSize;
    }

    /**
     * 
     * @return
     *     The refreshRate
     */
    @JsonProperty("refreshRate")
    public Double getRefreshRate() {
        return refreshRate;
    }

    /**
     * 
     * @param refreshRate
     *     The refreshRate
     */
    @JsonProperty("refreshRate")
    public void setRefreshRate(Double refreshRate) {
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pixelFormat).append(orientation).append(height).append(flags).append(rotation).append(width).append(name).append(rectSize).append(currentSizeRange).append(isValid).append(getSize).append(getRealSize).append(refreshRate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SCREEN) == false) {
            return false;
        }
        SCREEN rhs = ((SCREEN) other);
        return new EqualsBuilder().append(pixelFormat, rhs.pixelFormat).append(orientation, rhs.orientation).append(height, rhs.height).append(flags, rhs.flags).append(rotation, rhs.rotation).append(width, rhs.width).append(name, rhs.name).append(rectSize, rhs.rectSize).append(currentSizeRange, rhs.currentSizeRange).append(isValid, rhs.isValid).append(getSize, rhs.getSize).append(getRealSize, rhs.getRealSize).append(refreshRate, rhs.refreshRate).isEquals();
    }

}
