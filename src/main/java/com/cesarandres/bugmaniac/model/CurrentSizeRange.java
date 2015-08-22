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
    "largest",
    "smallest"
})

@Serialize
public class CurrentSizeRange implements Serializable{

	private static final long serialVersionUID = -5355796274381998273L;

	@JsonProperty("largest")
    private String largest;
    @JsonProperty("smallest")
    private String smallest;

    /**
     * 
     * @return
     *     The largest
     */
    @JsonProperty("largest")
    public String getLargest() {
        return largest;
    }

    /**
     * 
     * @param largest
     *     The largest
     */
    @JsonProperty("largest")
    public void setLargest(String largest) {
        this.largest = largest;
    }

    /**
     * 
     * @return
     *     The smallest
     */
    @JsonProperty("smallest")
    public String getSmallest() {
        return smallest;
    }

    /**
     * 
     * @param smallest
     *     The smallest
     */
    @JsonProperty("smallest")
    public void setSmallest(String smallest) {
        this.smallest = smallest;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(largest).append(smallest).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrentSizeRange) == false) {
            return false;
        }
        CurrentSizeRange rhs = ((CurrentSizeRange) other);
        return new EqualsBuilder().append(largest, rhs.largest).append(smallest, rhs.smallest).isEquals();
    }

}
