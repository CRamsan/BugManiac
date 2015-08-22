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
    "0"
})

@Serialize
public class DISPLAY implements Serializable{
	
	private static final long serialVersionUID = 8389442381723084452L;

	@JsonProperty("0")
    private SCREEN _0;

    /**
     * 
     * @return
     *     The _0
     */
    @JsonProperty("0")
    public SCREEN get0() {
        return _0;
    }

    /**
     * 
     * @param _0
     *     The 0
     */
    @JsonProperty("0")
    public void set0(SCREEN _0) {
        this._0 = _0;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_0).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DISPLAY) == false) {
            return false;
        }
        DISPLAY rhs = ((DISPLAY) other);
        return new EqualsBuilder().append(_0, rhs._0).isEquals();
    }

}
