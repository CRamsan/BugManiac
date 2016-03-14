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
    "TIME",
    "FINGERPRINT",
    "HARDWARE",
    "UNKNOWN",
    "RADIO",
    "BOARD",
    "PRODUCT",
    "DISPLAY",
    "USER",
    "HOST",
    "DEVICE",
    "TAGS",
    "MODEL",
    "BOOTLOADER",
    "VERSION",
    "CPU_ABI",
    "CPU_ABI2",
    "IS_DEBUGGABLE",
    "ID",
    "FIRMWARE",
    "SERIAL",
    "MANUFACTURER",
    "BRAND",
    "TYPE"
})

@Serialize
public class BUILD implements Serializable{

	private static final long serialVersionUID = 8837405431618324965L;
	
	@JsonProperty("TIME")
    private Long TIME;
    @JsonProperty("FINGERPRINT")
    private String FINGERPRINT;
    @JsonProperty("HARDWARE")
    private String HARDWARE;
    @JsonProperty("UNKNOWN")
    private String UNKNOWN;
    @JsonProperty("RADIO")
    private String RADIO;
    @JsonProperty("BOARD")
    private String BOARD;
    @JsonProperty("PRODUCT")
    private String PRODUCT;
    @JsonProperty("DISPLAY")
    private String DISPLAY;
    @JsonProperty("USER")
    private String USER;
    @JsonProperty("HOST")
    private String HOST;
    @JsonProperty("DEVICE")
    private String DEVICE;
    @JsonProperty("TAGS")
    private String TAGS;
    @JsonProperty("MODEL")
    private String MODEL;
    @JsonProperty("BOOTLOADER")
    private String BOOTLOADER;
    @JsonProperty("VERSION")
    private VERSION VERSION;
    @JsonProperty("CPU_ABI")
    private String CPUABI;
    @JsonProperty("CPU_ABI2")
    private String CPUABI2;
    @JsonProperty("IS_DEBUGGABLE")
    private Boolean ISDEBUGGABLE;
    @JsonProperty("ID")
    private String ID;
    @JsonProperty("FIRMWARE")
    private String FIRMWARE;
    @JsonProperty("SERIAL")
    private String SERIAL;
    @JsonProperty("MANUFACTURER")
    private String MANUFACTURER;
    @JsonProperty("BRAND")
    private String BRAND;
    @JsonProperty("TYPE")
    private String TYPE;

    /**
     * 
     * @return
     *     The TIME
     */
    @JsonProperty("TIME")
    public Long getTIME() {
        return TIME;
    }

    /**
     * 
     * @param TIME
     *     The TIME
     */
    @JsonProperty("TIME")
    public void setTIME(Long TIME) {
        this.TIME = TIME;
    }

    /**
     * 
     * @return
     *     The FINGERPRINT
     */
    @JsonProperty("FINGERPRINT")
    public String getFINGERPRINT() {
        return FINGERPRINT;
    }

    /**
     * 
     * @param FINGERPRINT
     *     The FINGERPRINT
     */
    @JsonProperty("FINGERPRINT")
    public void setFINGERPRINT(String FINGERPRINT) {
        this.FINGERPRINT = FINGERPRINT;
    }

    /**
     * 
     * @return
     *     The HARDWARE
     */
    @JsonProperty("HARDWARE")
    public String getHARDWARE() {
        return HARDWARE;
    }

    /**
     * 
     * @param HARDWARE
     *     The HARDWARE
     */
    @JsonProperty("HARDWARE")
    public void setHARDWARE(String HARDWARE) {
        this.HARDWARE = HARDWARE;
    }

    /**
     * 
     * @return
     *     The UNKNOWN
     */
    @JsonProperty("UNKNOWN")
    public String getUNKNOWN() {
        return UNKNOWN;
    }

    /**
     * 
     * @param UNKNOWN
     *     The UNKNOWN
     */
    @JsonProperty("UNKNOWN")
    public void setUNKNOWN(String UNKNOWN) {
        this.UNKNOWN = UNKNOWN;
    }

    /**
     * 
     * @return
     *     The RADIO
     */
    @JsonProperty("RADIO")
    public String getRADIO() {
        return RADIO;
    }

    /**
     * 
     * @param RADIO
     *     The RADIO
     */
    @JsonProperty("RADIO")
    public void setRADIO(String RADIO) {
        this.RADIO = RADIO;
    }

    /**
     * 
     * @return
     *     The BOARD
     */
    @JsonProperty("BOARD")
    public String getBOARD() {
        return BOARD;
    }

    /**
     * 
     * @param BOARD
     *     The BOARD
     */
    @JsonProperty("BOARD")
    public void setBOARD(String BOARD) {
        this.BOARD = BOARD;
    }

    /**
     * 
     * @return
     *     The PRODUCT
     */
    @JsonProperty("PRODUCT")
    public String getPRODUCT() {
        return PRODUCT;
    }

    /**
     * 
     * @param PRODUCT
     *     The PRODUCT
     */
    @JsonProperty("PRODUCT")
    public void setPRODUCT(String PRODUCT) {
        this.PRODUCT = PRODUCT;
    }

    /**
     * 
     * @return
     *     The DISPLAY
     */
    @JsonProperty("DISPLAY")
    public String getDISPLAY() {
        return DISPLAY;
    }

    /**
     * 
     * @param DISPLAY
     *     The DISPLAY
     */
    @JsonProperty("DISPLAY")
    public void setDISPLAY(String DISPLAY) {
        this.DISPLAY = DISPLAY;
    }

    /**
     * 
     * @return
     *     The USER
     */
    @JsonProperty("USER")
    public String getUSER() {
        return USER;
    }

    /**
     * 
     * @param USER
     *     The USER
     */
    @JsonProperty("USER")
    public void setUSER(String USER) {
        this.USER = USER;
    }

    /**
     * 
     * @return
     *     The HOST
     */
    @JsonProperty("HOST")
    public String getHOST() {
        return HOST;
    }

    /**
     * 
     * @param HOST
     *     The HOST
     */
    @JsonProperty("HOST")
    public void setHOST(String HOST) {
        this.HOST = HOST;
    }

    /**
     * 
     * @return
     *     The DEVICE
     */
    @JsonProperty("DEVICE")
    public String getDEVICE() {
        return DEVICE;
    }

    /**
     * 
     * @param DEVICE
     *     The DEVICE
     */
    @JsonProperty("DEVICE")
    public void setDEVICE(String DEVICE) {
        this.DEVICE = DEVICE;
    }

    /**
     * 
     * @return
     *     The TAGS
     */
    @JsonProperty("TAGS")
    public String getTAGS() {
        return TAGS;
    }

    /**
     * 
     * @param TAGS
     *     The TAGS
     */
    @JsonProperty("TAGS")
    public void setTAGS(String TAGS) {
        this.TAGS = TAGS;
    }

    /**
     * 
     * @return
     *     The MODEL
     */
    @JsonProperty("MODEL")
    public String getMODEL() {
        return MODEL;
    }

    /**
     * 
     * @param MODEL
     *     The MODEL
     */
    @JsonProperty("MODEL")
    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    /**
     * 
     * @return
     *     The BOOTLOADER
     */
    @JsonProperty("BOOTLOADER")
    public String getBOOTLOADER() {
        return BOOTLOADER;
    }

    /**
     * 
     * @param BOOTLOADER
     *     The BOOTLOADER
     */
    @JsonProperty("BOOTLOADER")
    public void setBOOTLOADER(String BOOTLOADER) {
        this.BOOTLOADER = BOOTLOADER;
    }

    /**
     * 
     * @return
     *     The VERSION
     */
    @JsonProperty("VERSION")
    public VERSION getVERSION() {
        return VERSION;
    }

    /**
     * 
     * @param VERSION
     *     The VERSION
     */
    @JsonProperty("VERSION")
    public void setVERSION(VERSION VERSION) {
        this.VERSION = VERSION;
    }

    /**
     * 
     * @return
     *     The CPUABI
     */
    @JsonProperty("CPU_ABI")
    public String getCPUABI() {
        return CPUABI;
    }

    /**
     * 
     * @param CPUABI
     *     The CPU_ABI
     */
    @JsonProperty("CPU_ABI")
    public void setCPUABI(String CPUABI) {
        this.CPUABI = CPUABI;
    }

    /**
     * 
     * @return
     *     The CPUABI2
     */
    @JsonProperty("CPU_ABI2")
    public String getCPUABI2() {
        return CPUABI2;
    }

    /**
     * 
     * @param CPUABI2
     *     The CPU_ABI2
     */
    @JsonProperty("CPU_ABI2")
    public void setCPUABI2(String CPUABI2) {
        this.CPUABI2 = CPUABI2;
    }

    /**
     * 
     * @return
     *     The ISDEBUGGABLE
     */
    @JsonProperty("IS_DEBUGGABLE")
    public Boolean getISDEBUGGABLE() {
        return ISDEBUGGABLE;
    }

    /**
     * 
     * @param ISDEBUGGABLE
     *     The IS_DEBUGGABLE
     */
    @JsonProperty("IS_DEBUGGABLE")
    public void setISDEBUGGABLE(Boolean ISDEBUGGABLE) {
        this.ISDEBUGGABLE = ISDEBUGGABLE;
    }

    /**
     * 
     * @return
     *     The ID
     */
    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    /**
     * 
     * @param ID
     *     The ID
     */
    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 
     * @return
     *     The FIRMWARE
     */
    @JsonProperty("FIRMWARE")
    public String getFIRMWARE() {
        return FIRMWARE;
    }

    /**
     * 
     * @param FIRMWARE
     *     The FIRMWARE
     */
    @JsonProperty("FIRMWARE")
    public void setFIRMWARE(String FIRMWARE) {
        this.FIRMWARE = FIRMWARE;
    }

    /**
     * 
     * @return
     *     The SERIAL
     */
    @JsonProperty("SERIAL")
    public String getSERIAL() {
        return SERIAL;
    }

    /**
     * 
     * @param SERIAL
     *     The SERIAL
     */
    @JsonProperty("SERIAL")
    public void setSERIAL(String SERIAL) {
        this.SERIAL = SERIAL;
    }

    /**
     * 
     * @return
     *     The MANUFACTURER
     */
    @JsonProperty("MANUFACTURER")
    public String getMANUFACTURER() {
        return MANUFACTURER;
    }

    /**
     * 
     * @param MANUFACTURER
     *     The MANUFACTURER
     */
    @JsonProperty("MANUFACTURER")
    public void setMANUFACTURER(String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER;
    }

    /**
     * 
     * @return
     *     The BRAND
     */
    @JsonProperty("BRAND")
    public String getBRAND() {
        return BRAND;
    }

    /**
     * 
     * @param BRAND
     *     The BRAND
     */
    @JsonProperty("BRAND")
    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    /**
     * 
     * @return
     *     The TYPE
     */
    @JsonProperty("TYPE")
    public String getTYPE() {
        return TYPE;
    }

    /**
     * 
     * @param TYPE
     *     The TYPE
     */
    @JsonProperty("TYPE")
    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(TIME).append(FINGERPRINT).append(HARDWARE).append(UNKNOWN).append(RADIO).append(BOARD).append(PRODUCT).append(DISPLAY).append(USER).append(HOST).append(DEVICE).append(TAGS).append(MODEL).append(BOOTLOADER).append(VERSION).append(CPUABI).append(CPUABI2).append(ISDEBUGGABLE).append(ID).append(FIRMWARE).append(SERIAL).append(MANUFACTURER).append(BRAND).append(TYPE).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BUILD) == false) {
            return false;
        }
        BUILD rhs = ((BUILD) other);
        return new EqualsBuilder().append(TIME, rhs.TIME).append(FINGERPRINT, rhs.FINGERPRINT).append(HARDWARE, rhs.HARDWARE).append(UNKNOWN, rhs.UNKNOWN).append(RADIO, rhs.RADIO).append(BOARD, rhs.BOARD).append(PRODUCT, rhs.PRODUCT).append(DISPLAY, rhs.DISPLAY).append(USER, rhs.USER).append(HOST, rhs.HOST).append(DEVICE, rhs.DEVICE).append(TAGS, rhs.TAGS).append(MODEL, rhs.MODEL).append(BOOTLOADER, rhs.BOOTLOADER).append(VERSION, rhs.VERSION).append(CPUABI, rhs.CPUABI).append(CPUABI2, rhs.CPUABI2).append(ISDEBUGGABLE, rhs.ISDEBUGGABLE).append(ID, rhs.ID).append(FIRMWARE, rhs.FIRMWARE).append(SERIAL, rhs.SERIAL).append(MANUFACTURER, rhs.MANUFACTURER).append(BRAND, rhs.BRAND).append(TYPE, rhs.TYPE).isEquals();
    }

}
