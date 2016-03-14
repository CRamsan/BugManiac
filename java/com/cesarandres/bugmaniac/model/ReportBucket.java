package com.cesarandres.bugmaniac.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@JsonPropertyOrder({
    "CRASH_SIGNATURE",
})

@Entity
public class ReportBucket {

	@Id
	@Index 
    @JsonProperty("CRASH_SIGNATURE")
	private String CRASHSIGNATURE;
	
	@Index 
    @JsonProperty("CRASH_HEADER")
	private String CRASHHEADER;
	
	@Index 
    @JsonProperty("CRASH_COUNT")
	private int CRASHCOUNT;

	/**
     * 
     * @return
     *     The CRASHHEADER
     */
    @JsonProperty("CRASH_HEADER")
	public String getCRASHHEADER() {
		return CRASHHEADER;
	}

    /**
     * 
     * @param CRASHHEADER
     *     The CRASH_HEADER
     */
    @JsonProperty("CRASH_HEADER")
	public void setCRASHHEADER(String CRASHHEADER) {
		this.CRASHHEADER = CRASHHEADER;
	}

	/**
     * 
     * @return
     *     The CRASHSIGNATURE
     */
    @JsonProperty("CRASH_SIGNATURE")
    public String getCRASHSIGNATURE() {
        return CRASHSIGNATURE;
    }

    /**
     * 
     * @param CRASHSIGNATURE
     *     The CRASH_SIGNATURE
     */
    @JsonProperty("CRASH_SIGNATURE")
    public void setCRASHSIGNATURE(String CRASHSIGNATURE) {
        this.CRASHSIGNATURE = CRASHSIGNATURE;
    }
    
	/**
     * 
     * @return
     *     The CRASHCOUNT
     */
    @JsonProperty("CRASH_COUNT")
    public int getCRASHCOUNT() {
        return CRASHCOUNT;
    }

    /**
     * 
     * @param CRASHCOUNT
     *     The CRASH_COUNT
     */
    @JsonProperty("CRASH_COUNT")
    public void setCRASHCOUNT(int CRASHCOUNT) {
        this.CRASHCOUNT = CRASHCOUNT;
    }
}
