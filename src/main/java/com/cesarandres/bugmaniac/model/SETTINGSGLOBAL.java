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
    "UNLOCK_SOUND",
    "SET_INSTALL_LOCATION",
    "CAR_DOCK_SOUND",
    "CERT_PIN_UPDATE_CONTENT_URL",
    "BLUETOOTH_ON",
    "DOCK_AUDIO_MEDIA_ENABLED",
    "CDMA_SUBSCRIPTION_MODE",
    "USB_MASS_STORAGE_ENABLED",
    "EMERGENCY_TONE",
    "NETWORK_PREFERENCE",
    "LOCK_SOUND",
    "ETHERNET_MODE",
    "WIFI_SCAN_ALWAYS_AVAILABLE",
    "WIFI_ON",
    "DESK_UNDOCK_SOUND",
    "DESK_DOCK_SOUND",
    "WIFI_DISPLAY_ON",
    "CAR_UNDOCK_SOUND",
    "WIFI_SLEEP_POLICY",
    "WIFI_WATCHDOG_ON",
    "SEND_ACTION_APP_ERROR",
    "SMS_SHORT_CODES_UPDATE_METADATA_URL",
    "PREFERRED_NETWORK_MODE",
    "AUTO_TIME",
    "WEB_AUTOFILL_QUERY_URL",
    "AUDIO_SAFE_VOLUME_STATE",
    "AIRPLANE_MODE_ON",
    "WIRELESS_CHARGING_STARTED_SOUND",
    "WIFI_MAX_DHCP_RETRY_COUNT",
    "POWER_SOUNDS_ENABLED",
    "MODE_RINGER",
    "DOCK_SOUNDS_ENABLED",
    "ASSISTED_GPS_ENABLED",
    "CDMA_CELL_BROADCAST_SMS",
    "AIRPLANE_MODE_ON_FAST_BOOT",
    "WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON",
    "ETHERNET_ON",
    "AIRPLANE_MODE_TOGGLEABLE_RADIOS",
    "DATA_ROAMING",
    "DEVICE_PROVISIONED",
    "AIRPLANE_MODE_RADIOS",
    "AUTO_TIME_ZONE",
    "PACKAGE_VERIFIER_ENABLE",
    "SMS_SHORT_CODES_UPDATE_CONTENT_URL",
    "LOW_BATTERY_SOUND",
    "DEFAULT_INSTALL_LOCATION",
    "MOBILE_DATA",
    "INSTALL_NON_MARKET_APPS",
    "CALL_AUTO_RETRY",
    "LOW_BATTERY_SOUND_TIMEOUT",
    "NETSTATS_ENABLED",
    "CERT_PIN_UPDATE_METADATA_URL",
    "STAY_ON_WHILE_PLUGGED_IN",
    "ADB_ENABLED"
})

@Serialize
public class SETTINGSGLOBAL implements Serializable{

	private static final long serialVersionUID = -6373207288622853552L;

	@JsonProperty("UNLOCK_SOUND")
    private String UNLOCKSOUND;
    @JsonProperty("SET_INSTALL_LOCATION")
    private Long SETINSTALLLOCATION;
    @JsonProperty("CAR_DOCK_SOUND")
    private String CARDOCKSOUND;
    @JsonProperty("CERT_PIN_UPDATE_CONTENT_URL")
    private String CERTPINUPDATECONTENTURL;
    @JsonProperty("BLUETOOTH_ON")
    private Long BLUETOOTHON;
    @JsonProperty("DOCK_AUDIO_MEDIA_ENABLED")
    private Long DOCKAUDIOMEDIAENABLED;
    @JsonProperty("CDMA_SUBSCRIPTION_MODE")
    private Long CDMASUBSCRIPTIONMODE;
    @JsonProperty("USB_MASS_STORAGE_ENABLED")
    private Long USBMASSSTORAGEENABLED;
    @JsonProperty("EMERGENCY_TONE")
    private Long EMERGENCYTONE;
    @JsonProperty("NETWORK_PREFERENCE")
    private Long NETWORKPREFERENCE;
    @JsonProperty("LOCK_SOUND")
    private String LOCKSOUND;
    @JsonProperty("ETHERNET_MODE")
    private Long ETHERNETMODE;
    @JsonProperty("WIFI_SCAN_ALWAYS_AVAILABLE")
    private Long WIFISCANALWAYSAVAILABLE;
    @JsonProperty("WIFI_ON")
    private Long WIFION;
    @JsonProperty("DESK_UNDOCK_SOUND")
    private String DESKUNDOCKSOUND;
    @JsonProperty("DESK_DOCK_SOUND")
    private String DESKDOCKSOUND;
    @JsonProperty("WIFI_DISPLAY_ON")
    private Long WIFIDISPLAYON;
    @JsonProperty("CAR_UNDOCK_SOUND")
    private String CARUNDOCKSOUND;
    @JsonProperty("WIFI_SLEEP_POLICY")
    private Long WIFISLEEPPOLICY;
    @JsonProperty("WIFI_WATCHDOG_ON")
    private Long WIFIWATCHDOGON;
    @JsonProperty("SEND_ACTION_APP_ERROR")
    private Long SENDACTIONAPPERROR;
    @JsonProperty("SMS_SHORT_CODES_UPDATE_METADATA_URL")
    private String SMSSHORTCODESUPDATEMETADATAURL;
    @JsonProperty("PREFERRED_NETWORK_MODE")
    private Long PREFERREDNETWORKMODE;
    @JsonProperty("AUTO_TIME")
    private Long AUTOTIME;
    @JsonProperty("WEB_AUTOFILL_QUERY_URL")
    private String WEBAUTOFILLQUERYURL;
    @JsonProperty("AUDIO_SAFE_VOLUME_STATE")
    private Long AUDIOSAFEVOLUMESTATE;
    @JsonProperty("AIRPLANE_MODE_ON")
    private Long AIRPLANEMODEON;
    @JsonProperty("WIRELESS_CHARGING_STARTED_SOUND")
    private String WIRELESSCHARGINGSTARTEDSOUND;
    @JsonProperty("WIFI_MAX_DHCP_RETRY_COUNT")
    private Long WIFIMAXDHCPRETRYCOUNT;
    @JsonProperty("POWER_SOUNDS_ENABLED")
    private Long POWERSOUNDSENABLED;
    @JsonProperty("MODE_RINGER")
    private Long MODERINGER;
    @JsonProperty("DOCK_SOUNDS_ENABLED")
    private Long DOCKSOUNDSENABLED;
    @JsonProperty("ASSISTED_GPS_ENABLED")
    private Long ASSISTEDGPSENABLED;
    @JsonProperty("CDMA_CELL_BROADCAST_SMS")
    private Long CDMACELLBROADCASTSMS;
    @JsonProperty("AIRPLANE_MODE_ON_FAST_BOOT")
    private Long AIRPLANEMODEONFASTBOOT;
    @JsonProperty("WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON")
    private Long WIFINETWORKSAVAILABLENOTIFICATIONON;
    @JsonProperty("ETHERNET_ON")
    private Long ETHERNETON;
    @JsonProperty("AIRPLANE_MODE_TOGGLEABLE_RADIOS")
    private String AIRPLANEMODETOGGLEABLERADIOS;
    @JsonProperty("DATA_ROAMING")
    private Long DATAROAMING;
    @JsonProperty("DEVICE_PROVISIONED")
    private Long DEVICEPROVISIONED;
    @JsonProperty("AIRPLANE_MODE_RADIOS")
    private String AIRPLANEMODERADIOS;
    @JsonProperty("AUTO_TIME_ZONE")
    private Long AUTOTIMEZONE;
    @JsonProperty("PACKAGE_VERIFIER_ENABLE")
    private Long PACKAGEVERIFIERENABLE;
    @JsonProperty("SMS_SHORT_CODES_UPDATE_CONTENT_URL")
    private String SMSSHORTCODESUPDATECONTENTURL;
    @JsonProperty("LOW_BATTERY_SOUND")
    private String LOWBATTERYSOUND;
    @JsonProperty("DEFAULT_INSTALL_LOCATION")
    private Long DEFAULTINSTALLLOCATION;
    @JsonProperty("MOBILE_DATA")
    private Long MOBILEDATA;
    @JsonProperty("INSTALL_NON_MARKET_APPS")
    private Long INSTALLNONMARKETAPPS;
    @JsonProperty("CALL_AUTO_RETRY")
    private Long CALLAUTORETRY;
    @JsonProperty("LOW_BATTERY_SOUND_TIMEOUT")
    private Long LOWBATTERYSOUNDTIMEOUT;
    @JsonProperty("NETSTATS_ENABLED")
    private Long NETSTATSENABLED;
    @JsonProperty("CERT_PIN_UPDATE_METADATA_URL")
    private String CERTPINUPDATEMETADATAURL;
    @JsonProperty("STAY_ON_WHILE_PLUGGED_IN")
    private Long STAYONWHILEPLUGGEDIN;
    @JsonProperty("ADB_ENABLED")
    private Long ADBENABLED;

    /**
     * 
     * @return
     *     The UNLOCKSOUND
     */
    @JsonProperty("UNLOCK_SOUND")
    public String getUNLOCKSOUND() {
        return UNLOCKSOUND;
    }

    /**
     * 
     * @param UNLOCKSOUND
     *     The UNLOCK_SOUND
     */
    @JsonProperty("UNLOCK_SOUND")
    public void setUNLOCKSOUND(String UNLOCKSOUND) {
        this.UNLOCKSOUND = UNLOCKSOUND;
    }

    /**
     * 
     * @return
     *     The SETINSTALLLOCATION
     */
    @JsonProperty("SET_INSTALL_LOCATION")
    public Long getSETINSTALLLOCATION() {
        return SETINSTALLLOCATION;
    }

    /**
     * 
     * @param SETINSTALLLOCATION
     *     The SET_INSTALL_LOCATION
     */
    @JsonProperty("SET_INSTALL_LOCATION")
    public void setSETINSTALLLOCATION(Long SETINSTALLLOCATION) {
        this.SETINSTALLLOCATION = SETINSTALLLOCATION;
    }

    /**
     * 
     * @return
     *     The CARDOCKSOUND
     */
    @JsonProperty("CAR_DOCK_SOUND")
    public String getCARDOCKSOUND() {
        return CARDOCKSOUND;
    }

    /**
     * 
     * @param CARDOCKSOUND
     *     The CAR_DOCK_SOUND
     */
    @JsonProperty("CAR_DOCK_SOUND")
    public void setCARDOCKSOUND(String CARDOCKSOUND) {
        this.CARDOCKSOUND = CARDOCKSOUND;
    }

    /**
     * 
     * @return
     *     The CERTPINUPDATECONTENTURL
     */
    @JsonProperty("CERT_PIN_UPDATE_CONTENT_URL")
    public String getCERTPINUPDATECONTENTURL() {
        return CERTPINUPDATECONTENTURL;
    }

    /**
     * 
     * @param CERTPINUPDATECONTENTURL
     *     The CERT_PIN_UPDATE_CONTENT_URL
     */
    @JsonProperty("CERT_PIN_UPDATE_CONTENT_URL")
    public void setCERTPINUPDATECONTENTURL(String CERTPINUPDATECONTENTURL) {
        this.CERTPINUPDATECONTENTURL = CERTPINUPDATECONTENTURL;
    }

    /**
     * 
     * @return
     *     The BLUETOOTHON
     */
    @JsonProperty("BLUETOOTH_ON")
    public Long getBLUETOOTHON() {
        return BLUETOOTHON;
    }

    /**
     * 
     * @param BLUETOOTHON
     *     The BLUETOOTH_ON
     */
    @JsonProperty("BLUETOOTH_ON")
    public void setBLUETOOTHON(Long BLUETOOTHON) {
        this.BLUETOOTHON = BLUETOOTHON;
    }

    /**
     * 
     * @return
     *     The DOCKAUDIOMEDIAENABLED
     */
    @JsonProperty("DOCK_AUDIO_MEDIA_ENABLED")
    public Long getDOCKAUDIOMEDIAENABLED() {
        return DOCKAUDIOMEDIAENABLED;
    }

    /**
     * 
     * @param DOCKAUDIOMEDIAENABLED
     *     The DOCK_AUDIO_MEDIA_ENABLED
     */
    @JsonProperty("DOCK_AUDIO_MEDIA_ENABLED")
    public void setDOCKAUDIOMEDIAENABLED(Long DOCKAUDIOMEDIAENABLED) {
        this.DOCKAUDIOMEDIAENABLED = DOCKAUDIOMEDIAENABLED;
    }

    /**
     * 
     * @return
     *     The CDMASUBSCRIPTIONMODE
     */
    @JsonProperty("CDMA_SUBSCRIPTION_MODE")
    public Long getCDMASUBSCRIPTIONMODE() {
        return CDMASUBSCRIPTIONMODE;
    }

    /**
     * 
     * @param CDMASUBSCRIPTIONMODE
     *     The CDMA_SUBSCRIPTION_MODE
     */
    @JsonProperty("CDMA_SUBSCRIPTION_MODE")
    public void setCDMASUBSCRIPTIONMODE(Long CDMASUBSCRIPTIONMODE) {
        this.CDMASUBSCRIPTIONMODE = CDMASUBSCRIPTIONMODE;
    }

    /**
     * 
     * @return
     *     The USBMASSSTORAGEENABLED
     */
    @JsonProperty("USB_MASS_STORAGE_ENABLED")
    public Long getUSBMASSSTORAGEENABLED() {
        return USBMASSSTORAGEENABLED;
    }

    /**
     * 
     * @param USBMASSSTORAGEENABLED
     *     The USB_MASS_STORAGE_ENABLED
     */
    @JsonProperty("USB_MASS_STORAGE_ENABLED")
    public void setUSBMASSSTORAGEENABLED(Long USBMASSSTORAGEENABLED) {
        this.USBMASSSTORAGEENABLED = USBMASSSTORAGEENABLED;
    }

    /**
     * 
     * @return
     *     The EMERGENCYTONE
     */
    @JsonProperty("EMERGENCY_TONE")
    public Long getEMERGENCYTONE() {
        return EMERGENCYTONE;
    }

    /**
     * 
     * @param EMERGENCYTONE
     *     The EMERGENCY_TONE
     */
    @JsonProperty("EMERGENCY_TONE")
    public void setEMERGENCYTONE(Long EMERGENCYTONE) {
        this.EMERGENCYTONE = EMERGENCYTONE;
    }

    /**
     * 
     * @return
     *     The NETWORKPREFERENCE
     */
    @JsonProperty("NETWORK_PREFERENCE")
    public Long getNETWORKPREFERENCE() {
        return NETWORKPREFERENCE;
    }

    /**
     * 
     * @param NETWORKPREFERENCE
     *     The NETWORK_PREFERENCE
     */
    @JsonProperty("NETWORK_PREFERENCE")
    public void setNETWORKPREFERENCE(Long NETWORKPREFERENCE) {
        this.NETWORKPREFERENCE = NETWORKPREFERENCE;
    }

    /**
     * 
     * @return
     *     The LOCKSOUND
     */
    @JsonProperty("LOCK_SOUND")
    public String getLOCKSOUND() {
        return LOCKSOUND;
    }

    /**
     * 
     * @param LOCKSOUND
     *     The LOCK_SOUND
     */
    @JsonProperty("LOCK_SOUND")
    public void setLOCKSOUND(String LOCKSOUND) {
        this.LOCKSOUND = LOCKSOUND;
    }

    /**
     * 
     * @return
     *     The ETHERNETMODE
     */
    @JsonProperty("ETHERNET_MODE")
    public Long getETHERNETMODE() {
        return ETHERNETMODE;
    }

    /**
     * 
     * @param ETHERNETMODE
     *     The ETHERNET_MODE
     */
    @JsonProperty("ETHERNET_MODE")
    public void setETHERNETMODE(Long ETHERNETMODE) {
        this.ETHERNETMODE = ETHERNETMODE;
    }

    /**
     * 
     * @return
     *     The WIFISCANALWAYSAVAILABLE
     */
    @JsonProperty("WIFI_SCAN_ALWAYS_AVAILABLE")
    public Long getWIFISCANALWAYSAVAILABLE() {
        return WIFISCANALWAYSAVAILABLE;
    }

    /**
     * 
     * @param WIFISCANALWAYSAVAILABLE
     *     The WIFI_SCAN_ALWAYS_AVAILABLE
     */
    @JsonProperty("WIFI_SCAN_ALWAYS_AVAILABLE")
    public void setWIFISCANALWAYSAVAILABLE(Long WIFISCANALWAYSAVAILABLE) {
        this.WIFISCANALWAYSAVAILABLE = WIFISCANALWAYSAVAILABLE;
    }

    /**
     * 
     * @return
     *     The WIFION
     */
    @JsonProperty("WIFI_ON")
    public Long getWIFION() {
        return WIFION;
    }

    /**
     * 
     * @param WIFION
     *     The WIFI_ON
     */
    @JsonProperty("WIFI_ON")
    public void setWIFION(Long WIFION) {
        this.WIFION = WIFION;
    }

    /**
     * 
     * @return
     *     The DESKUNDOCKSOUND
     */
    @JsonProperty("DESK_UNDOCK_SOUND")
    public String getDESKUNDOCKSOUND() {
        return DESKUNDOCKSOUND;
    }

    /**
     * 
     * @param DESKUNDOCKSOUND
     *     The DESK_UNDOCK_SOUND
     */
    @JsonProperty("DESK_UNDOCK_SOUND")
    public void setDESKUNDOCKSOUND(String DESKUNDOCKSOUND) {
        this.DESKUNDOCKSOUND = DESKUNDOCKSOUND;
    }

    /**
     * 
     * @return
     *     The DESKDOCKSOUND
     */
    @JsonProperty("DESK_DOCK_SOUND")
    public String getDESKDOCKSOUND() {
        return DESKDOCKSOUND;
    }

    /**
     * 
     * @param DESKDOCKSOUND
     *     The DESK_DOCK_SOUND
     */
    @JsonProperty("DESK_DOCK_SOUND")
    public void setDESKDOCKSOUND(String DESKDOCKSOUND) {
        this.DESKDOCKSOUND = DESKDOCKSOUND;
    }

    /**
     * 
     * @return
     *     The WIFIDISPLAYON
     */
    @JsonProperty("WIFI_DISPLAY_ON")
    public Long getWIFIDISPLAYON() {
        return WIFIDISPLAYON;
    }

    /**
     * 
     * @param WIFIDISPLAYON
     *     The WIFI_DISPLAY_ON
     */
    @JsonProperty("WIFI_DISPLAY_ON")
    public void setWIFIDISPLAYON(Long WIFIDISPLAYON) {
        this.WIFIDISPLAYON = WIFIDISPLAYON;
    }

    /**
     * 
     * @return
     *     The CARUNDOCKSOUND
     */
    @JsonProperty("CAR_UNDOCK_SOUND")
    public String getCARUNDOCKSOUND() {
        return CARUNDOCKSOUND;
    }

    /**
     * 
     * @param CARUNDOCKSOUND
     *     The CAR_UNDOCK_SOUND
     */
    @JsonProperty("CAR_UNDOCK_SOUND")
    public void setCARUNDOCKSOUND(String CARUNDOCKSOUND) {
        this.CARUNDOCKSOUND = CARUNDOCKSOUND;
    }

    /**
     * 
     * @return
     *     The WIFISLEEPPOLICY
     */
    @JsonProperty("WIFI_SLEEP_POLICY")
    public Long getWIFISLEEPPOLICY() {
        return WIFISLEEPPOLICY;
    }

    /**
     * 
     * @param WIFISLEEPPOLICY
     *     The WIFI_SLEEP_POLICY
     */
    @JsonProperty("WIFI_SLEEP_POLICY")
    public void setWIFISLEEPPOLICY(Long WIFISLEEPPOLICY) {
        this.WIFISLEEPPOLICY = WIFISLEEPPOLICY;
    }

    /**
     * 
     * @return
     *     The WIFIWATCHDOGON
     */
    @JsonProperty("WIFI_WATCHDOG_ON")
    public Long getWIFIWATCHDOGON() {
        return WIFIWATCHDOGON;
    }

    /**
     * 
     * @param WIFIWATCHDOGON
     *     The WIFI_WATCHDOG_ON
     */
    @JsonProperty("WIFI_WATCHDOG_ON")
    public void setWIFIWATCHDOGON(Long WIFIWATCHDOGON) {
        this.WIFIWATCHDOGON = WIFIWATCHDOGON;
    }

    /**
     * 
     * @return
     *     The SENDACTIONAPPERROR
     */
    @JsonProperty("SEND_ACTION_APP_ERROR")
    public Long getSENDACTIONAPPERROR() {
        return SENDACTIONAPPERROR;
    }

    /**
     * 
     * @param SENDACTIONAPPERROR
     *     The SEND_ACTION_APP_ERROR
     */
    @JsonProperty("SEND_ACTION_APP_ERROR")
    public void setSENDACTIONAPPERROR(Long SENDACTIONAPPERROR) {
        this.SENDACTIONAPPERROR = SENDACTIONAPPERROR;
    }

    /**
     * 
     * @return
     *     The SMSSHORTCODESUPDATEMETADATAURL
     */
    @JsonProperty("SMS_SHORT_CODES_UPDATE_METADATA_URL")
    public String getSMSSHORTCODESUPDATEMETADATAURL() {
        return SMSSHORTCODESUPDATEMETADATAURL;
    }

    /**
     * 
     * @param SMSSHORTCODESUPDATEMETADATAURL
     *     The SMS_SHORT_CODES_UPDATE_METADATA_URL
     */
    @JsonProperty("SMS_SHORT_CODES_UPDATE_METADATA_URL")
    public void setSMSSHORTCODESUPDATEMETADATAURL(String SMSSHORTCODESUPDATEMETADATAURL) {
        this.SMSSHORTCODESUPDATEMETADATAURL = SMSSHORTCODESUPDATEMETADATAURL;
    }

    /**
     * 
     * @return
     *     The PREFERREDNETWORKMODE
     */
    @JsonProperty("PREFERRED_NETWORK_MODE")
    public Long getPREFERREDNETWORKMODE() {
        return PREFERREDNETWORKMODE;
    }

    /**
     * 
     * @param PREFERREDNETWORKMODE
     *     The PREFERRED_NETWORK_MODE
     */
    @JsonProperty("PREFERRED_NETWORK_MODE")
    public void setPREFERREDNETWORKMODE(Long PREFERREDNETWORKMODE) {
        this.PREFERREDNETWORKMODE = PREFERREDNETWORKMODE;
    }

    /**
     * 
     * @return
     *     The AUTOTIME
     */
    @JsonProperty("AUTO_TIME")
    public Long getAUTOTIME() {
        return AUTOTIME;
    }

    /**
     * 
     * @param AUTOTIME
     *     The AUTO_TIME
     */
    @JsonProperty("AUTO_TIME")
    public void setAUTOTIME(Long AUTOTIME) {
        this.AUTOTIME = AUTOTIME;
    }

    /**
     * 
     * @return
     *     The WEBAUTOFILLQUERYURL
     */
    @JsonProperty("WEB_AUTOFILL_QUERY_URL")
    public String getWEBAUTOFILLQUERYURL() {
        return WEBAUTOFILLQUERYURL;
    }

    /**
     * 
     * @param WEBAUTOFILLQUERYURL
     *     The WEB_AUTOFILL_QUERY_URL
     */
    @JsonProperty("WEB_AUTOFILL_QUERY_URL")
    public void setWEBAUTOFILLQUERYURL(String WEBAUTOFILLQUERYURL) {
        this.WEBAUTOFILLQUERYURL = WEBAUTOFILLQUERYURL;
    }

    /**
     * 
     * @return
     *     The AUDIOSAFEVOLUMESTATE
     */
    @JsonProperty("AUDIO_SAFE_VOLUME_STATE")
    public Long getAUDIOSAFEVOLUMESTATE() {
        return AUDIOSAFEVOLUMESTATE;
    }

    /**
     * 
     * @param AUDIOSAFEVOLUMESTATE
     *     The AUDIO_SAFE_VOLUME_STATE
     */
    @JsonProperty("AUDIO_SAFE_VOLUME_STATE")
    public void setAUDIOSAFEVOLUMESTATE(Long AUDIOSAFEVOLUMESTATE) {
        this.AUDIOSAFEVOLUMESTATE = AUDIOSAFEVOLUMESTATE;
    }

    /**
     * 
     * @return
     *     The AIRPLANEMODEON
     */
    @JsonProperty("AIRPLANE_MODE_ON")
    public Long getAIRPLANEMODEON() {
        return AIRPLANEMODEON;
    }

    /**
     * 
     * @param AIRPLANEMODEON
     *     The AIRPLANE_MODE_ON
     */
    @JsonProperty("AIRPLANE_MODE_ON")
    public void setAIRPLANEMODEON(Long AIRPLANEMODEON) {
        this.AIRPLANEMODEON = AIRPLANEMODEON;
    }

    /**
     * 
     * @return
     *     The WIRELESSCHARGINGSTARTEDSOUND
     */
    @JsonProperty("WIRELESS_CHARGING_STARTED_SOUND")
    public String getWIRELESSCHARGINGSTARTEDSOUND() {
        return WIRELESSCHARGINGSTARTEDSOUND;
    }

    /**
     * 
     * @param WIRELESSCHARGINGSTARTEDSOUND
     *     The WIRELESS_CHARGING_STARTED_SOUND
     */
    @JsonProperty("WIRELESS_CHARGING_STARTED_SOUND")
    public void setWIRELESSCHARGINGSTARTEDSOUND(String WIRELESSCHARGINGSTARTEDSOUND) {
        this.WIRELESSCHARGINGSTARTEDSOUND = WIRELESSCHARGINGSTARTEDSOUND;
    }

    /**
     * 
     * @return
     *     The WIFIMAXDHCPRETRYCOUNT
     */
    @JsonProperty("WIFI_MAX_DHCP_RETRY_COUNT")
    public Long getWIFIMAXDHCPRETRYCOUNT() {
        return WIFIMAXDHCPRETRYCOUNT;
    }

    /**
     * 
     * @param WIFIMAXDHCPRETRYCOUNT
     *     The WIFI_MAX_DHCP_RETRY_COUNT
     */
    @JsonProperty("WIFI_MAX_DHCP_RETRY_COUNT")
    public void setWIFIMAXDHCPRETRYCOUNT(Long WIFIMAXDHCPRETRYCOUNT) {
        this.WIFIMAXDHCPRETRYCOUNT = WIFIMAXDHCPRETRYCOUNT;
    }

    /**
     * 
     * @return
     *     The POWERSOUNDSENABLED
     */
    @JsonProperty("POWER_SOUNDS_ENABLED")
    public Long getPOWERSOUNDSENABLED() {
        return POWERSOUNDSENABLED;
    }

    /**
     * 
     * @param POWERSOUNDSENABLED
     *     The POWER_SOUNDS_ENABLED
     */
    @JsonProperty("POWER_SOUNDS_ENABLED")
    public void setPOWERSOUNDSENABLED(Long POWERSOUNDSENABLED) {
        this.POWERSOUNDSENABLED = POWERSOUNDSENABLED;
    }

    /**
     * 
     * @return
     *     The MODERINGER
     */
    @JsonProperty("MODE_RINGER")
    public Long getMODERINGER() {
        return MODERINGER;
    }

    /**
     * 
     * @param MODERINGER
     *     The MODE_RINGER
     */
    @JsonProperty("MODE_RINGER")
    public void setMODERINGER(Long MODERINGER) {
        this.MODERINGER = MODERINGER;
    }

    /**
     * 
     * @return
     *     The DOCKSOUNDSENABLED
     */
    @JsonProperty("DOCK_SOUNDS_ENABLED")
    public Long getDOCKSOUNDSENABLED() {
        return DOCKSOUNDSENABLED;
    }

    /**
     * 
     * @param DOCKSOUNDSENABLED
     *     The DOCK_SOUNDS_ENABLED
     */
    @JsonProperty("DOCK_SOUNDS_ENABLED")
    public void setDOCKSOUNDSENABLED(Long DOCKSOUNDSENABLED) {
        this.DOCKSOUNDSENABLED = DOCKSOUNDSENABLED;
    }

    /**
     * 
     * @return
     *     The ASSISTEDGPSENABLED
     */
    @JsonProperty("ASSISTED_GPS_ENABLED")
    public Long getASSISTEDGPSENABLED() {
        return ASSISTEDGPSENABLED;
    }

    /**
     * 
     * @param ASSISTEDGPSENABLED
     *     The ASSISTED_GPS_ENABLED
     */
    @JsonProperty("ASSISTED_GPS_ENABLED")
    public void setASSISTEDGPSENABLED(Long ASSISTEDGPSENABLED) {
        this.ASSISTEDGPSENABLED = ASSISTEDGPSENABLED;
    }

    /**
     * 
     * @return
     *     The CDMACELLBROADCASTSMS
     */
    @JsonProperty("CDMA_CELL_BROADCAST_SMS")
    public Long getCDMACELLBROADCASTSMS() {
        return CDMACELLBROADCASTSMS;
    }

    /**
     * 
     * @param CDMACELLBROADCASTSMS
     *     The CDMA_CELL_BROADCAST_SMS
     */
    @JsonProperty("CDMA_CELL_BROADCAST_SMS")
    public void setCDMACELLBROADCASTSMS(Long CDMACELLBROADCASTSMS) {
        this.CDMACELLBROADCASTSMS = CDMACELLBROADCASTSMS;
    }

    /**
     * 
     * @return
     *     The AIRPLANEMODEONFASTBOOT
     */
    @JsonProperty("AIRPLANE_MODE_ON_FAST_BOOT")
    public Long getAIRPLANEMODEONFASTBOOT() {
        return AIRPLANEMODEONFASTBOOT;
    }

    /**
     * 
     * @param AIRPLANEMODEONFASTBOOT
     *     The AIRPLANE_MODE_ON_FAST_BOOT
     */
    @JsonProperty("AIRPLANE_MODE_ON_FAST_BOOT")
    public void setAIRPLANEMODEONFASTBOOT(Long AIRPLANEMODEONFASTBOOT) {
        this.AIRPLANEMODEONFASTBOOT = AIRPLANEMODEONFASTBOOT;
    }

    /**
     * 
     * @return
     *     The WIFINETWORKSAVAILABLENOTIFICATIONON
     */
    @JsonProperty("WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON")
    public Long getWIFINETWORKSAVAILABLENOTIFICATIONON() {
        return WIFINETWORKSAVAILABLENOTIFICATIONON;
    }

    /**
     * 
     * @param WIFINETWORKSAVAILABLENOTIFICATIONON
     *     The WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON
     */
    @JsonProperty("WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON")
    public void setWIFINETWORKSAVAILABLENOTIFICATIONON(Long WIFINETWORKSAVAILABLENOTIFICATIONON) {
        this.WIFINETWORKSAVAILABLENOTIFICATIONON = WIFINETWORKSAVAILABLENOTIFICATIONON;
    }

    /**
     * 
     * @return
     *     The ETHERNETON
     */
    @JsonProperty("ETHERNET_ON")
    public Long getETHERNETON() {
        return ETHERNETON;
    }

    /**
     * 
     * @param ETHERNETON
     *     The ETHERNET_ON
     */
    @JsonProperty("ETHERNET_ON")
    public void setETHERNETON(Long ETHERNETON) {
        this.ETHERNETON = ETHERNETON;
    }

    /**
     * 
     * @return
     *     The AIRPLANEMODETOGGLEABLERADIOS
     */
    @JsonProperty("AIRPLANE_MODE_TOGGLEABLE_RADIOS")
    public String getAIRPLANEMODETOGGLEABLERADIOS() {
        return AIRPLANEMODETOGGLEABLERADIOS;
    }

    /**
     * 
     * @param AIRPLANEMODETOGGLEABLERADIOS
     *     The AIRPLANE_MODE_TOGGLEABLE_RADIOS
     */
    @JsonProperty("AIRPLANE_MODE_TOGGLEABLE_RADIOS")
    public void setAIRPLANEMODETOGGLEABLERADIOS(String AIRPLANEMODETOGGLEABLERADIOS) {
        this.AIRPLANEMODETOGGLEABLERADIOS = AIRPLANEMODETOGGLEABLERADIOS;
    }

    /**
     * 
     * @return
     *     The DATAROAMING
     */
    @JsonProperty("DATA_ROAMING")
    public Long getDATAROAMING() {
        return DATAROAMING;
    }

    /**
     * 
     * @param DATAROAMING
     *     The DATA_ROAMING
     */
    @JsonProperty("DATA_ROAMING")
    public void setDATAROAMING(Long DATAROAMING) {
        this.DATAROAMING = DATAROAMING;
    }

    /**
     * 
     * @return
     *     The DEVICEPROVISIONED
     */
    @JsonProperty("DEVICE_PROVISIONED")
    public Long getDEVICEPROVISIONED() {
        return DEVICEPROVISIONED;
    }

    /**
     * 
     * @param DEVICEPROVISIONED
     *     The DEVICE_PROVISIONED
     */
    @JsonProperty("DEVICE_PROVISIONED")
    public void setDEVICEPROVISIONED(Long DEVICEPROVISIONED) {
        this.DEVICEPROVISIONED = DEVICEPROVISIONED;
    }

    /**
     * 
     * @return
     *     The AIRPLANEMODERADIOS
     */
    @JsonProperty("AIRPLANE_MODE_RADIOS")
    public String getAIRPLANEMODERADIOS() {
        return AIRPLANEMODERADIOS;
    }

    /**
     * 
     * @param AIRPLANEMODERADIOS
     *     The AIRPLANE_MODE_RADIOS
     */
    @JsonProperty("AIRPLANE_MODE_RADIOS")
    public void setAIRPLANEMODERADIOS(String AIRPLANEMODERADIOS) {
        this.AIRPLANEMODERADIOS = AIRPLANEMODERADIOS;
    }

    /**
     * 
     * @return
     *     The AUTOTIMEZONE
     */
    @JsonProperty("AUTO_TIME_ZONE")
    public Long getAUTOTIMEZONE() {
        return AUTOTIMEZONE;
    }

    /**
     * 
     * @param AUTOTIMEZONE
     *     The AUTO_TIME_ZONE
     */
    @JsonProperty("AUTO_TIME_ZONE")
    public void setAUTOTIMEZONE(Long AUTOTIMEZONE) {
        this.AUTOTIMEZONE = AUTOTIMEZONE;
    }

    /**
     * 
     * @return
     *     The PACKAGEVERIFIERENABLE
     */
    @JsonProperty("PACKAGE_VERIFIER_ENABLE")
    public Long getPACKAGEVERIFIERENABLE() {
        return PACKAGEVERIFIERENABLE;
    }

    /**
     * 
     * @param PACKAGEVERIFIERENABLE
     *     The PACKAGE_VERIFIER_ENABLE
     */
    @JsonProperty("PACKAGE_VERIFIER_ENABLE")
    public void setPACKAGEVERIFIERENABLE(Long PACKAGEVERIFIERENABLE) {
        this.PACKAGEVERIFIERENABLE = PACKAGEVERIFIERENABLE;
    }

    /**
     * 
     * @return
     *     The SMSSHORTCODESUPDATECONTENTURL
     */
    @JsonProperty("SMS_SHORT_CODES_UPDATE_CONTENT_URL")
    public String getSMSSHORTCODESUPDATECONTENTURL() {
        return SMSSHORTCODESUPDATECONTENTURL;
    }

    /**
     * 
     * @param SMSSHORTCODESUPDATECONTENTURL
     *     The SMS_SHORT_CODES_UPDATE_CONTENT_URL
     */
    @JsonProperty("SMS_SHORT_CODES_UPDATE_CONTENT_URL")
    public void setSMSSHORTCODESUPDATECONTENTURL(String SMSSHORTCODESUPDATECONTENTURL) {
        this.SMSSHORTCODESUPDATECONTENTURL = SMSSHORTCODESUPDATECONTENTURL;
    }

    /**
     * 
     * @return
     *     The LOWBATTERYSOUND
     */
    @JsonProperty("LOW_BATTERY_SOUND")
    public String getLOWBATTERYSOUND() {
        return LOWBATTERYSOUND;
    }

    /**
     * 
     * @param LOWBATTERYSOUND
     *     The LOW_BATTERY_SOUND
     */
    @JsonProperty("LOW_BATTERY_SOUND")
    public void setLOWBATTERYSOUND(String LOWBATTERYSOUND) {
        this.LOWBATTERYSOUND = LOWBATTERYSOUND;
    }

    /**
     * 
     * @return
     *     The DEFAULTINSTALLLOCATION
     */
    @JsonProperty("DEFAULT_INSTALL_LOCATION")
    public Long getDEFAULTINSTALLLOCATION() {
        return DEFAULTINSTALLLOCATION;
    }

    /**
     * 
     * @param DEFAULTINSTALLLOCATION
     *     The DEFAULT_INSTALL_LOCATION
     */
    @JsonProperty("DEFAULT_INSTALL_LOCATION")
    public void setDEFAULTINSTALLLOCATION(Long DEFAULTINSTALLLOCATION) {
        this.DEFAULTINSTALLLOCATION = DEFAULTINSTALLLOCATION;
    }

    /**
     * 
     * @return
     *     The MOBILEDATA
     */
    @JsonProperty("MOBILE_DATA")
    public Long getMOBILEDATA() {
        return MOBILEDATA;
    }

    /**
     * 
     * @param MOBILEDATA
     *     The MOBILE_DATA
     */
    @JsonProperty("MOBILE_DATA")
    public void setMOBILEDATA(Long MOBILEDATA) {
        this.MOBILEDATA = MOBILEDATA;
    }

    /**
     * 
     * @return
     *     The INSTALLNONMARKETAPPS
     */
    @JsonProperty("INSTALL_NON_MARKET_APPS")
    public Long getINSTALLNONMARKETAPPS() {
        return INSTALLNONMARKETAPPS;
    }

    /**
     * 
     * @param INSTALLNONMARKETAPPS
     *     The INSTALL_NON_MARKET_APPS
     */
    @JsonProperty("INSTALL_NON_MARKET_APPS")
    public void setINSTALLNONMARKETAPPS(Long INSTALLNONMARKETAPPS) {
        this.INSTALLNONMARKETAPPS = INSTALLNONMARKETAPPS;
    }

    /**
     * 
     * @return
     *     The CALLAUTORETRY
     */
    @JsonProperty("CALL_AUTO_RETRY")
    public Long getCALLAUTORETRY() {
        return CALLAUTORETRY;
    }

    /**
     * 
     * @param CALLAUTORETRY
     *     The CALL_AUTO_RETRY
     */
    @JsonProperty("CALL_AUTO_RETRY")
    public void setCALLAUTORETRY(Long CALLAUTORETRY) {
        this.CALLAUTORETRY = CALLAUTORETRY;
    }

    /**
     * 
     * @return
     *     The LOWBATTERYSOUNDTIMEOUT
     */
    @JsonProperty("LOW_BATTERY_SOUND_TIMEOUT")
    public Long getLOWBATTERYSOUNDTIMEOUT() {
        return LOWBATTERYSOUNDTIMEOUT;
    }

    /**
     * 
     * @param LOWBATTERYSOUNDTIMEOUT
     *     The LOW_BATTERY_SOUND_TIMEOUT
     */
    @JsonProperty("LOW_BATTERY_SOUND_TIMEOUT")
    public void setLOWBATTERYSOUNDTIMEOUT(Long LOWBATTERYSOUNDTIMEOUT) {
        this.LOWBATTERYSOUNDTIMEOUT = LOWBATTERYSOUNDTIMEOUT;
    }

    /**
     * 
     * @return
     *     The NETSTATSENABLED
     */
    @JsonProperty("NETSTATS_ENABLED")
    public Long getNETSTATSENABLED() {
        return NETSTATSENABLED;
    }

    /**
     * 
     * @param NETSTATSENABLED
     *     The NETSTATS_ENABLED
     */
    @JsonProperty("NETSTATS_ENABLED")
    public void setNETSTATSENABLED(Long NETSTATSENABLED) {
        this.NETSTATSENABLED = NETSTATSENABLED;
    }

    /**
     * 
     * @return
     *     The CERTPINUPDATEMETADATAURL
     */
    @JsonProperty("CERT_PIN_UPDATE_METADATA_URL")
    public String getCERTPINUPDATEMETADATAURL() {
        return CERTPINUPDATEMETADATAURL;
    }

    /**
     * 
     * @param CERTPINUPDATEMETADATAURL
     *     The CERT_PIN_UPDATE_METADATA_URL
     */
    @JsonProperty("CERT_PIN_UPDATE_METADATA_URL")
    public void setCERTPINUPDATEMETADATAURL(String CERTPINUPDATEMETADATAURL) {
        this.CERTPINUPDATEMETADATAURL = CERTPINUPDATEMETADATAURL;
    }

    /**
     * 
     * @return
     *     The STAYONWHILEPLUGGEDIN
     */
    @JsonProperty("STAY_ON_WHILE_PLUGGED_IN")
    public Long getSTAYONWHILEPLUGGEDIN() {
        return STAYONWHILEPLUGGEDIN;
    }

    /**
     * 
     * @param STAYONWHILEPLUGGEDIN
     *     The STAY_ON_WHILE_PLUGGED_IN
     */
    @JsonProperty("STAY_ON_WHILE_PLUGGED_IN")
    public void setSTAYONWHILEPLUGGEDIN(Long STAYONWHILEPLUGGEDIN) {
        this.STAYONWHILEPLUGGEDIN = STAYONWHILEPLUGGEDIN;
    }

    /**
     * 
     * @return
     *     The ADBENABLED
     */
    @JsonProperty("ADB_ENABLED")
    public Long getADBENABLED() {
        return ADBENABLED;
    }

    /**
     * 
     * @param ADBENABLED
     *     The ADB_ENABLED
     */
    @JsonProperty("ADB_ENABLED")
    public void setADBENABLED(Long ADBENABLED) {
        this.ADBENABLED = ADBENABLED;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(UNLOCKSOUND).append(SETINSTALLLOCATION).append(CARDOCKSOUND).append(CERTPINUPDATECONTENTURL).append(BLUETOOTHON).append(DOCKAUDIOMEDIAENABLED).append(CDMASUBSCRIPTIONMODE).append(USBMASSSTORAGEENABLED).append(EMERGENCYTONE).append(NETWORKPREFERENCE).append(LOCKSOUND).append(ETHERNETMODE).append(WIFISCANALWAYSAVAILABLE).append(WIFION).append(DESKUNDOCKSOUND).append(DESKDOCKSOUND).append(WIFIDISPLAYON).append(CARUNDOCKSOUND).append(WIFISLEEPPOLICY).append(WIFIWATCHDOGON).append(SENDACTIONAPPERROR).append(SMSSHORTCODESUPDATEMETADATAURL).append(PREFERREDNETWORKMODE).append(AUTOTIME).append(WEBAUTOFILLQUERYURL).append(AUDIOSAFEVOLUMESTATE).append(AIRPLANEMODEON).append(WIRELESSCHARGINGSTARTEDSOUND).append(WIFIMAXDHCPRETRYCOUNT).append(POWERSOUNDSENABLED).append(MODERINGER).append(DOCKSOUNDSENABLED).append(ASSISTEDGPSENABLED).append(CDMACELLBROADCASTSMS).append(AIRPLANEMODEONFASTBOOT).append(WIFINETWORKSAVAILABLENOTIFICATIONON).append(ETHERNETON).append(AIRPLANEMODETOGGLEABLERADIOS).append(DATAROAMING).append(DEVICEPROVISIONED).append(AIRPLANEMODERADIOS).append(AUTOTIMEZONE).append(PACKAGEVERIFIERENABLE).append(SMSSHORTCODESUPDATECONTENTURL).append(LOWBATTERYSOUND).append(DEFAULTINSTALLLOCATION).append(MOBILEDATA).append(INSTALLNONMARKETAPPS).append(CALLAUTORETRY).append(LOWBATTERYSOUNDTIMEOUT).append(NETSTATSENABLED).append(CERTPINUPDATEMETADATAURL).append(STAYONWHILEPLUGGEDIN).append(ADBENABLED).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SETTINGSGLOBAL) == false) {
            return false;
        }
        SETTINGSGLOBAL rhs = ((SETTINGSGLOBAL) other);
        return new EqualsBuilder().append(UNLOCKSOUND, rhs.UNLOCKSOUND).append(SETINSTALLLOCATION, rhs.SETINSTALLLOCATION).append(CARDOCKSOUND, rhs.CARDOCKSOUND).append(CERTPINUPDATECONTENTURL, rhs.CERTPINUPDATECONTENTURL).append(BLUETOOTHON, rhs.BLUETOOTHON).append(DOCKAUDIOMEDIAENABLED, rhs.DOCKAUDIOMEDIAENABLED).append(CDMASUBSCRIPTIONMODE, rhs.CDMASUBSCRIPTIONMODE).append(USBMASSSTORAGEENABLED, rhs.USBMASSSTORAGEENABLED).append(EMERGENCYTONE, rhs.EMERGENCYTONE).append(NETWORKPREFERENCE, rhs.NETWORKPREFERENCE).append(LOCKSOUND, rhs.LOCKSOUND).append(ETHERNETMODE, rhs.ETHERNETMODE).append(WIFISCANALWAYSAVAILABLE, rhs.WIFISCANALWAYSAVAILABLE).append(WIFION, rhs.WIFION).append(DESKUNDOCKSOUND, rhs.DESKUNDOCKSOUND).append(DESKDOCKSOUND, rhs.DESKDOCKSOUND).append(WIFIDISPLAYON, rhs.WIFIDISPLAYON).append(CARUNDOCKSOUND, rhs.CARUNDOCKSOUND).append(WIFISLEEPPOLICY, rhs.WIFISLEEPPOLICY).append(WIFIWATCHDOGON, rhs.WIFIWATCHDOGON).append(SENDACTIONAPPERROR, rhs.SENDACTIONAPPERROR).append(SMSSHORTCODESUPDATEMETADATAURL, rhs.SMSSHORTCODESUPDATEMETADATAURL).append(PREFERREDNETWORKMODE, rhs.PREFERREDNETWORKMODE).append(AUTOTIME, rhs.AUTOTIME).append(WEBAUTOFILLQUERYURL, rhs.WEBAUTOFILLQUERYURL).append(AUDIOSAFEVOLUMESTATE, rhs.AUDIOSAFEVOLUMESTATE).append(AIRPLANEMODEON, rhs.AIRPLANEMODEON).append(WIRELESSCHARGINGSTARTEDSOUND, rhs.WIRELESSCHARGINGSTARTEDSOUND).append(WIFIMAXDHCPRETRYCOUNT, rhs.WIFIMAXDHCPRETRYCOUNT).append(POWERSOUNDSENABLED, rhs.POWERSOUNDSENABLED).append(MODERINGER, rhs.MODERINGER).append(DOCKSOUNDSENABLED, rhs.DOCKSOUNDSENABLED).append(ASSISTEDGPSENABLED, rhs.ASSISTEDGPSENABLED).append(CDMACELLBROADCASTSMS, rhs.CDMACELLBROADCASTSMS).append(AIRPLANEMODEONFASTBOOT, rhs.AIRPLANEMODEONFASTBOOT).append(WIFINETWORKSAVAILABLENOTIFICATIONON, rhs.WIFINETWORKSAVAILABLENOTIFICATIONON).append(ETHERNETON, rhs.ETHERNETON).append(AIRPLANEMODETOGGLEABLERADIOS, rhs.AIRPLANEMODETOGGLEABLERADIOS).append(DATAROAMING, rhs.DATAROAMING).append(DEVICEPROVISIONED, rhs.DEVICEPROVISIONED).append(AIRPLANEMODERADIOS, rhs.AIRPLANEMODERADIOS).append(AUTOTIMEZONE, rhs.AUTOTIMEZONE).append(PACKAGEVERIFIERENABLE, rhs.PACKAGEVERIFIERENABLE).append(SMSSHORTCODESUPDATECONTENTURL, rhs.SMSSHORTCODESUPDATECONTENTURL).append(LOWBATTERYSOUND, rhs.LOWBATTERYSOUND).append(DEFAULTINSTALLLOCATION, rhs.DEFAULTINSTALLLOCATION).append(MOBILEDATA, rhs.MOBILEDATA).append(INSTALLNONMARKETAPPS, rhs.INSTALLNONMARKETAPPS).append(CALLAUTORETRY, rhs.CALLAUTORETRY).append(LOWBATTERYSOUNDTIMEOUT, rhs.LOWBATTERYSOUNDTIMEOUT).append(NETSTATSENABLED, rhs.NETSTATSENABLED).append(CERTPINUPDATEMETADATAURL, rhs.CERTPINUPDATEMETADATAURL).append(STAYONWHILEPLUGGEDIN, rhs.STAYONWHILEPLUGGEDIN).append(ADBENABLED, rhs.ADBENABLED).isEquals();
    }
}
