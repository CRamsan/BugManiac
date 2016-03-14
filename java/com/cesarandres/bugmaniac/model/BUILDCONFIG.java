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
    "DEBUG"
})

@Serialize
public class BUILDCONFIG implements Serializable{

	private static final long serialVersionUID = -5170753676946942938L;

	@JsonProperty("DEBUG")
    private Boolean DEBUG;

    /**
     * 
     * @return
     *     The DEBUG
     */
    @JsonProperty("DEBUG")
    public Boolean getDEBUG() {
        return DEBUG;
    }

    /**
     * 
     * @param DEBUG
     *     The DEBUG
     */
    @JsonProperty("DEBUG")
    public void setDEBUG(Boolean DEBUG) {
        this.DEBUG = DEBUG;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(DEBUG).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BUILDCONFIG) == false) {
            return false;
        }
        BUILDCONFIG rhs = ((BUILDCONFIG) other);
        return new EqualsBuilder().append(DEBUG, rhs.DEBUG).isEquals();
    }

}
