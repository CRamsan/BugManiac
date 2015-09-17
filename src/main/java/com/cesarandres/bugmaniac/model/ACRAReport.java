package com.cesarandres.bugmaniac.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "USER_EMAIL",
    "SETTINGS_GLOBAL",
    "DEVICE_FEATURES",
    "PHONE_MODEL",
    "INSTALLATION_ID",
    "SETTINGS_SYSTEM",
    "ANDROID_VERSION",
    "PACKAGE_NAME",
    "APP_VERSION_CODE",
    "CRASH_CONFIGURATION",
    "USER_CRASH_DATE",
    "DUMPSYS_MEMINFO",
    "BUILD",
    "BUILD_CONFIG",
    "STACK_TRACE",
    "PRODUCT",
    "DISPLAY",
    "LOGCAT",
    "APP_VERSION_NAME",
    "AVAILABLE_MEM_SIZE",
    "USER_APP_START_DATE",
    "CUSTOM_DATA",
    "BRAND",
    "TOTAL_MEM_SIZE",
    "FILE_PATH",
    "ENVIRONMENT",
    "REPORT_ID",
    "SIGNATURE"
})

@Entity
public class ACRAReport {
	@Index 
    @JsonProperty("USER_EMAIL")
    private String USEREMAIL;
    @JsonProperty("SETTINGS_GLOBAL")
    private SETTINGSGLOBAL SETTINGSGLOBAL;
    @JsonProperty("DEVICE_FEATURES")
    private DEVICEFEATURES DEVICEFEATURES;
    @Index
    @JsonProperty("PHONE_MODEL")
    private String PHONEMODEL;
    @JsonProperty("INSTALLATION_ID")
    private String INSTALLATIONID;
    @JsonProperty("SETTINGS_SYSTEM")
    private SETTINGSSYSTEM SETTINGSSYSTEM;
    @Index
    @JsonProperty("ANDROID_VERSION")
    private String ANDROIDVERSION;
    @Index
    @JsonProperty("PACKAGE_NAME")
    private String PACKAGENAME;
    @Index
    @JsonProperty("APP_VERSION_CODE")
    private Long APPVERSIONCODE;
    @JsonProperty("CRASH_CONFIGURATION")
    private CRASHCONFIGURATION CRASHCONFIGURATION;
    @Index
    @JsonProperty("USER_CRASH_DATE")
    private String USERCRASHDATE;
    @JsonProperty("DUMPSYS_MEMINFO")
    private String DUMPSYSMEMINFO;
    @JsonProperty("BUILD")
    private BUILD BUILD;
    @JsonProperty("BUILD_CONFIG")
    private BUILDCONFIG BUILDCONFIG;
    @JsonProperty("STACK_TRACE")
    private String STACKTRACE;
    @Index
    @JsonProperty("PRODUCT")
    private String PRODUCT;
    @JsonProperty("DISPLAY")
    private DISPLAY DISPLAY;
    @JsonProperty("LOGCAT")
    private String LOGCAT;
    @Index
    @JsonProperty("APP_VERSION_NAME")
    private String APPVERSIONNAME;
    @JsonProperty("AVAILABLE_MEM_SIZE")
    private Long AVAILABLEMEMSIZE;
    @Index
    @JsonProperty("USER_APP_START_DATE")
    private String USERAPPSTARTDATE;
    @JsonProperty("CUSTOM_DATA")
    private CUSTOMDATA CUSTOMDATA;
    @Index
    @JsonProperty("BRAND")
    private String BRAND;
    @JsonProperty("TOTAL_MEM_SIZE")
    private Long TOTALMEMSIZE;
    @JsonProperty("FILE_PATH")
    private String FILEPATH;
    @JsonProperty("ENVIRONMENT")
    private ENVIRONMENT ENVIRONMENT;
    
    @JsonProperty("REPORT_ID")
    @Id private String REPORTID;
    
    @JsonProperty("SIGNATURE")
    @Index
    private String SIGNATURE;

    @JsonProperty("SIGNATURE")
    public String getSignature() {
		return SIGNATURE;
	}
    
    @JsonProperty("SIGNATURE")
	public void setSignature(String SIGNATURE) {
		this.SIGNATURE = SIGNATURE;
	}

	/**
     * 
     * @return
     *     The USEREMAIL
     */
    @JsonProperty("USER_EMAIL")
    public String getUSEREMAIL() {
        return USEREMAIL;
    }

    /**
     * 
     * @param USEREMAIL
     *     The USER_EMAIL
     */
    @JsonProperty("USER_EMAIL")
    public void setUSEREMAIL(String USEREMAIL) {
        this.USEREMAIL = USEREMAIL;
    }

    /**
     * 
     * @return
     *     The SETTINGSGLOBAL
     */
    @JsonProperty("SETTINGS_GLOBAL")
    public SETTINGSGLOBAL getSETTINGSGLOBAL() {
        return SETTINGSGLOBAL;
    }

    /**
     * 
     * @param SETTINGSGLOBAL
     *     The SETTINGS_GLOBAL
     */
    @JsonProperty("SETTINGS_GLOBAL")
    public void setSETTINGSGLOBAL(SETTINGSGLOBAL SETTINGSGLOBAL) {
        this.SETTINGSGLOBAL = SETTINGSGLOBAL;
    }

    /**
     * 
     * @return
     *     The DEVICEFEATURES
     */
    @JsonProperty("DEVICE_FEATURES")
    public DEVICEFEATURES getDEVICEFEATURES() {
        return DEVICEFEATURES;
    }

    /**
     * 
     * @param DEVICEFEATURES
     *     The DEVICE_FEATURES
     */
    @JsonProperty("DEVICE_FEATURES")
    public void setDEVICEFEATURES(DEVICEFEATURES DEVICEFEATURES) {
        this.DEVICEFEATURES = DEVICEFEATURES;
    }

    /**
     * 
     * @return
     *     The PHONEMODEL
     */
    @JsonProperty("PHONE_MODEL")
    public String getPHONEMODEL() {
        return PHONEMODEL;
    }

    /**
     * 
     * @param PHONEMODEL
     *     The PHONE_MODEL
     */
    @JsonProperty("PHONE_MODEL")
    public void setPHONEMODEL(String PHONEMODEL) {
        this.PHONEMODEL = PHONEMODEL;
    }

    /**
     * 
     * @return
     *     The INSTALLATIONID
     */
    @JsonProperty("INSTALLATION_ID")
    public String getINSTALLATIONID() {
        return INSTALLATIONID;
    }

    /**
     * 
     * @param INSTALLATIONID
     *     The INSTALLATION_ID
     */
    @JsonProperty("INSTALLATION_ID")
    public void setINSTALLATIONID(String INSTALLATIONID) {
        this.INSTALLATIONID = INSTALLATIONID;
    }

    /**
     * 
     * @return
     *     The SETTINGSSYSTEM
     */
    @JsonProperty("SETTINGS_SYSTEM")
    public SETTINGSSYSTEM getSETTINGSSYSTEM() {
        return SETTINGSSYSTEM;
    }

    /**
     * 
     * @param SETTINGSSYSTEM
     *     The SETTINGS_SYSTEM
     */
    @JsonProperty("SETTINGS_SYSTEM")
    public void setSETTINGSSYSTEM(SETTINGSSYSTEM SETTINGSSYSTEM) {
        this.SETTINGSSYSTEM = SETTINGSSYSTEM;
    }

    /**
     * 
     * @return
     *     The ANDROIDVERSION
     */
    @JsonProperty("ANDROID_VERSION")
    public String getANDROIDVERSION() {
        return ANDROIDVERSION;
    }

    /**
     * 
     * @param ANDROIDVERSION
     *     The ANDROID_VERSION
     */
    @JsonProperty("ANDROID_VERSION")
    public void setANDROIDVERSION(String ANDROIDVERSION) {
        this.ANDROIDVERSION = ANDROIDVERSION;
    }

    /**
     * 
     * @return
     *     The PACKAGENAME
     */
    @JsonProperty("PACKAGE_NAME")
    public String getPACKAGENAME() {
        return PACKAGENAME;
    }

    /**
     * 
     * @param PACKAGENAME
     *     The PACKAGE_NAME
     */
    @JsonProperty("PACKAGE_NAME")
    public void setPACKAGENAME(String PACKAGENAME) {
        this.PACKAGENAME = PACKAGENAME;
    }

    /**
     * 
     * @return
     *     The APPVERSIONCODE
     */
    @JsonProperty("APP_VERSION_CODE")
    public Long getAPPVERSIONCODE() {
        return APPVERSIONCODE;
    }

    /**
     * 
     * @param APPVERSIONCODE
     *     The APP_VERSION_CODE
     */
    @JsonProperty("APP_VERSION_CODE")
    public void setAPPVERSIONCODE(Long APPVERSIONCODE) {
        this.APPVERSIONCODE = APPVERSIONCODE;
    }

    /**
     * 
     * @return
     *     The CRASHCONFIGURATION
     */
    @JsonProperty("CRASH_CONFIGURATION")
    public CRASHCONFIGURATION getCRASHCONFIGURATION() {
        return CRASHCONFIGURATION;
    }

    /**
     * 
     * @param CRASHCONFIGURATION
     *     The CRASH_CONFIGURATION
     */
    @JsonProperty("CRASH_CONFIGURATION")
    public void setCRASHCONFIGURATION(CRASHCONFIGURATION CRASHCONFIGURATION) {
        this.CRASHCONFIGURATION = CRASHCONFIGURATION;
    }

    /**
     * 
     * @return
     *     The USERCRASHDATE
     */
    @JsonProperty("USER_CRASH_DATE")
    public String getUSERCRASHDATE() {
        return USERCRASHDATE;
    }

    /**
     * 
     * @param USERCRASHDATE
     *     The USER_CRASH_DATE
     */
    @JsonProperty("USER_CRASH_DATE")
    public void setUSERCRASHDATE(String USERCRASHDATE) {
        this.USERCRASHDATE = USERCRASHDATE;
    }

    /**
     * 
     * @return
     *     The DUMPSYSMEMINFO
     */
    @JsonProperty("DUMPSYS_MEMINFO")
    public String getDUMPSYSMEMINFO() {
        return DUMPSYSMEMINFO;
    }

    /**
     * 
     * @param DUMPSYSMEMINFO
     *     The DUMPSYS_MEMINFO
     */
    @JsonProperty("DUMPSYS_MEMINFO")
    public void setDUMPSYSMEMINFO(String DUMPSYSMEMINFO) {
        this.DUMPSYSMEMINFO = DUMPSYSMEMINFO;
    }

    /**
     * 
     * @return
     *     The BUILD
     */
    @JsonProperty("BUILD")
    public BUILD getBUILD() {
        return BUILD;
    }

    /**
     * 
     * @param BUILD
     *     The BUILD
     */
    @JsonProperty("BUILD")
    public void setBUILD(BUILD BUILD) {
        this.BUILD = BUILD;
    }

    /**
     * 
     * @return
     *     The BUILDCONFIG
     */
    @JsonProperty("BUILD_CONFIG")
    public BUILDCONFIG getBUILDCONFIG() {
        return BUILDCONFIG;
    }

    /**
     * 
     * @param BUILDCONFIG
     *     The BUILD_CONFIG
     */
    @JsonProperty("BUILD_CONFIG")
    public void setBUILDCONFIG(BUILDCONFIG BUILDCONFIG) {
        this.BUILDCONFIG = BUILDCONFIG;
    }

    /**
     * 
     * @return
     *     The STACKTRACE
     */
    @JsonProperty("STACK_TRACE")
    public String getSTACKTRACE() {
        return STACKTRACE;
    }

    /**
     * 
     * @param STACKTRACE
     *     The STACK_TRACE
     */
    @JsonProperty("STACK_TRACE")
    public void setSTACKTRACE(String STACKTRACE) {
        this.STACKTRACE = STACKTRACE;
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
    public DISPLAY getDISPLAY() {
        return DISPLAY;
    }

    /**
     * 
     * @param DISPLAY
     *     The DISPLAY
     */
    @JsonProperty("DISPLAY")
    public void setDISPLAY(DISPLAY DISPLAY) {
        this.DISPLAY = DISPLAY;
    }

    /**
     * 
     * @return
     *     The LOGCAT
     */
    @JsonProperty("LOGCAT")
    public String getLOGCAT() {
        return LOGCAT;
    }

    /**
     * 
     * @param LOGCAT
     *     The LOGCAT
     */
    @JsonProperty("LOGCAT")
    public void setLOGCAT(String LOGCAT) {
        this.LOGCAT = LOGCAT;
    }

    /**
     * 
     * @return
     *     The APPVERSIONNAME
     */
    @JsonProperty("APP_VERSION_NAME")
    public String getAPPVERSIONNAME() {
        return APPVERSIONNAME;
    }

    /**
     * 
     * @param APPVERSIONNAME
     *     The APP_VERSION_NAME
     */
    @JsonProperty("APP_VERSION_NAME")
    public void setAPPVERSIONNAME(String APPVERSIONNAME) {
        this.APPVERSIONNAME = APPVERSIONNAME;
    }

    /**
     * 
     * @return
     *     The AVAILABLEMEMSIZE
     */
    @JsonProperty("AVAILABLE_MEM_SIZE")
    public Long getAVAILABLEMEMSIZE() {
        return AVAILABLEMEMSIZE;
    }

    /**
     * 
     * @param AVAILABLEMEMSIZE
     *     The AVAILABLE_MEM_SIZE
     */
    @JsonProperty("AVAILABLE_MEM_SIZE")
    public void setAVAILABLEMEMSIZE(Long AVAILABLEMEMSIZE) {
        this.AVAILABLEMEMSIZE = AVAILABLEMEMSIZE;
    }

    /**
     * 
     * @return
     *     The USERAPPSTARTDATE
     */
    @JsonProperty("USER_APP_START_DATE")
    public String getUSERAPPSTARTDATE() {
        return USERAPPSTARTDATE;
    }

    /**
     * 
     * @param USERAPPSTARTDATE
     *     The USER_APP_START_DATE
     */
    @JsonProperty("USER_APP_START_DATE")
    public void setUSERAPPSTARTDATE(String USERAPPSTARTDATE) {
        this.USERAPPSTARTDATE = USERAPPSTARTDATE;
    }

    /**
     * 
     * @return
     *     The CUSTOMDATA
     */
    @JsonProperty("CUSTOM_DATA")
    public CUSTOMDATA getCUSTOMDATA() {
        return CUSTOMDATA;
    }

    /**
     * 
     * @param CUSTOMDATA
     *     The CUSTOM_DATA
     */
    @JsonProperty("CUSTOM_DATA")
    public void setCUSTOMDATA(CUSTOMDATA CUSTOMDATA) {
        this.CUSTOMDATA = CUSTOMDATA;
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
     *     The TOTALMEMSIZE
     */
    @JsonProperty("TOTAL_MEM_SIZE")
    public Long getTOTALMEMSIZE() {
        return TOTALMEMSIZE;
    }

    /**
     * 
     * @param TOTALMEMSIZE
     *     The TOTAL_MEM_SIZE
     */
    @JsonProperty("TOTAL_MEM_SIZE")
    public void setTOTALMEMSIZE(Long TOTALMEMSIZE) {
        this.TOTALMEMSIZE = TOTALMEMSIZE;
    }

    /**
     * 
     * @return
     *     The FILEPATH
     */
    @JsonProperty("FILE_PATH")
    public String getFILEPATH() {
        return FILEPATH;
    }

    /**
     * 
     * @param FILEPATH
     *     The FILE_PATH
     */
    @JsonProperty("FILE_PATH")
    public void setFILEPATH(String FILEPATH) {
        this.FILEPATH = FILEPATH;
    }

    /**
     * 
     * @return
     *     The ENVIRONMENT
     */
    @JsonProperty("ENVIRONMENT")
    public ENVIRONMENT getENVIRONMENT() {
        return ENVIRONMENT;
    }

    /**
     * 
     * @param ENVIRONMENT
     *     The ENVIRONMENT
     */
    @JsonProperty("ENVIRONMENT")
    public void setENVIRONMENT(ENVIRONMENT ENVIRONMENT) {
        this.ENVIRONMENT = ENVIRONMENT;
    }

    /**
     * 
     * @return
     *     The REPORTID
     */
    @JsonProperty("REPORT_ID")
    public String getREPORTID() {
        return REPORTID;
    }

    /**
     * 
     * @param REPORTID
     *     The REPORT_ID
     */
    @JsonProperty("REPORT_ID")
    public void setREPORTID(String REPORTID) {
        this.REPORTID = REPORTID;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(USEREMAIL).append(SETTINGSGLOBAL).append(DEVICEFEATURES).append(PHONEMODEL).append(INSTALLATIONID).append(SETTINGSSYSTEM).append(ANDROIDVERSION).append(PACKAGENAME).append(APPVERSIONCODE).append(CRASHCONFIGURATION).append(USERCRASHDATE).append(DUMPSYSMEMINFO).append(BUILD).append(BUILDCONFIG).append(STACKTRACE).append(PRODUCT).append(DISPLAY).append(LOGCAT).append(APPVERSIONNAME).append(AVAILABLEMEMSIZE).append(USERAPPSTARTDATE).append(CUSTOMDATA).append(BRAND).append(TOTALMEMSIZE).append(FILEPATH).append(ENVIRONMENT).append(REPORTID).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ACRAReport) == false) {
            return false;
        }
        ACRAReport rhs = ((ACRAReport) other);
        return new EqualsBuilder().append(USEREMAIL, rhs.USEREMAIL).append(SETTINGSGLOBAL, rhs.SETTINGSGLOBAL).append(DEVICEFEATURES, rhs.DEVICEFEATURES).append(PHONEMODEL, rhs.PHONEMODEL).append(INSTALLATIONID, rhs.INSTALLATIONID).append(SETTINGSSYSTEM, rhs.SETTINGSSYSTEM).append(ANDROIDVERSION, rhs.ANDROIDVERSION).append(PACKAGENAME, rhs.PACKAGENAME).append(APPVERSIONCODE, rhs.APPVERSIONCODE).append(CRASHCONFIGURATION, rhs.CRASHCONFIGURATION).append(USERCRASHDATE, rhs.USERCRASHDATE).append(DUMPSYSMEMINFO, rhs.DUMPSYSMEMINFO).append(BUILD, rhs.BUILD).append(BUILDCONFIG, rhs.BUILDCONFIG).append(STACKTRACE, rhs.STACKTRACE).append(PRODUCT, rhs.PRODUCT).append(DISPLAY, rhs.DISPLAY).append(LOGCAT, rhs.LOGCAT).append(APPVERSIONNAME, rhs.APPVERSIONNAME).append(AVAILABLEMEMSIZE, rhs.AVAILABLEMEMSIZE).append(USERAPPSTARTDATE, rhs.USERAPPSTARTDATE).append(CUSTOMDATA, rhs.CUSTOMDATA).append(BRAND, rhs.BRAND).append(TOTALMEMSIZE, rhs.TOTALMEMSIZE).append(FILEPATH, rhs.FILEPATH).append(ENVIRONMENT, rhs.ENVIRONMENT).append(REPORTID, rhs.REPORTID).isEquals();
    }

    @JsonIgnore
	public String getCrashHeader() {
		String[] stackTrace = this.getSTACKTRACE().split("\n");
		int signatureSize = (stackTrace.length <= 2 ? stackTrace.length : 2);
		String stackTraceHeader = "";

		for (int i = 0; i < signatureSize; i++) {
			stackTraceHeader += stackTrace[i];
		}
		
		return stackTraceHeader;
	}

    @JsonIgnore
	public String generateSignature() {
		MessageDigest m;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			return "00000000O";
		}
		m.reset();
		m.update(this.getCrashHeader().getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		return hashtext;
	}
}
