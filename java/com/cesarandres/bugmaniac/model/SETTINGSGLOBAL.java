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
    private String SETINSTALLLOCATION;
    @JsonProperty("CAR_DOCK_SOUND")
    private String CARDOCKSOUND;
    @JsonProperty("CERT_PIN_UPDATE_CONTENT_URL")
    private String CERTPINUPDATECONTENTURL;
    @JsonProperty("BLUETOOTH_ON")
    private String BLUETOOTHON;
    @JsonProperty("DOCK_AUDIO_MEDIA_ENABLED")
    private String DOCKAUDIOMEDIAENABLED;
    @JsonProperty("CDMA_SUBSCRIPTION_MODE")
    private String CDMASUBSCRIPTIONMODE;
    @JsonProperty("USB_MASS_STORAGE_ENABLED")
    private String USBMASSSTORAGEENABLED;
    @JsonProperty("EMERGENCY_TONE")
    private String EMERGENCYTONE;
    @JsonProperty("NETWORK_PREFERENCE")
    private String NETWORKPREFERENCE;
    @JsonProperty("LOCK_SOUND")
    private String LOCKSOUND;
    @JsonProperty("ETHERNET_MODE")
    private String ETHERNETMODE;
    @JsonProperty("WIFI_SCAN_ALWAYS_AVAILABLE")
    private String WIFISCANALWAYSAVAILABLE;
    @JsonProperty("WIFI_ON")
    private String WIFION;
    @JsonProperty("DESK_UNDOCK_SOUND")
    private String DESKUNDOCKSOUND;
    @JsonProperty("DESK_DOCK_SOUND")
    private String DESKDOCKSOUND;
    @JsonProperty("WIFI_DISPLAY_ON")
    private String WIFIDISPLAYON;
    @JsonProperty("CAR_UNDOCK_SOUND")
    private String CARUNDOCKSOUND;
    @JsonProperty("WIFI_SLEEP_POLICY")
    private String WIFISLEEPPOLICY;
    @JsonProperty("WIFI_WATCHDOG_ON")
    private String WIFIWATCHDOGON;
    @JsonProperty("SEND_ACTION_APP_ERROR")
    private String SENDACTIONAPPERROR;
    @JsonProperty("SMS_SHORT_CODES_UPDATE_METADATA_URL")
    private String SMSSHORTCODESUPDATEMETADATAURL;
    @JsonProperty("PREFERRED_NETWORK_MODE")
    private String PREFERREDNETWORKMODE;
    @JsonProperty("AUTO_TIME")
    private String AUTOTIME;
    @JsonProperty("WEB_AUTOFILL_QUERY_URL")
    private String WEBAUTOFILLQUERYURL;
    @JsonProperty("AUDIO_SAFE_VOLUME_STATE")
    private String AUDIOSAFEVOLUMESTATE;
    @JsonProperty("AIRPLANE_MODE_ON")
    private String AIRPLANEMODEON;
    @JsonProperty("WIRELESS_CHARGING_STARTED_SOUND")
    private String WIRELESSCHARGINGSTARTEDSOUND;
    @JsonProperty("WIFI_MAX_DHCP_RETRY_COUNT")
    private String WIFIMAXDHCPRETRYCOUNT;
    @JsonProperty("POWER_SOUNDS_ENABLED")
    private String POWERSOUNDSENABLED;
    @JsonProperty("MODE_RINGER")
    private String MODERINGER;
    @JsonProperty("DOCK_SOUNDS_ENABLED")
    private String DOCKSOUNDSENABLED;
    @JsonProperty("ASSISTED_GPS_ENABLED")
    private String ASSISTEDGPSENABLED;
    @JsonProperty("CDMA_CELL_BROADCAST_SMS")
    private String CDMACELLBROADCASTSMS;
    @JsonProperty("AIRPLANE_MODE_ON_FAST_BOOT")
    private String AIRPLANEMODEONFASTBOOT;
    @JsonProperty("WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON")
    private String WIFINETWORKSAVAILABLENOTIFICATIONON;
    @JsonProperty("ETHERNET_ON")
    private String ETHERNETON;
    @JsonProperty("AIRPLANE_MODE_TOGGLEABLE_RADIOS")
    private String AIRPLANEMODETOGGLEABLERADIOS;
    @JsonProperty("DATA_ROAMING")
    private String DATAROAMING;
    @JsonProperty("DEVICE_PROVISIONED")
    private String DEVICEPROVISIONED;
    @JsonProperty("AIRPLANE_MODE_RADIOS")
    private String AIRPLANEMODERADIOS;
    @JsonProperty("AUTO_TIME_ZONE")
    private String AUTOTIMEZONE;
    @JsonProperty("PACKAGE_VERIFIER_ENABLE")
    private String PACKAGEVERIFIERENABLE;
    @JsonProperty("SMS_SHORT_CODES_UPDATE_CONTENT_URL")
    private String SMSSHORTCODESUPDATECONTENTURL;
    @JsonProperty("LOW_BATTERY_SOUND")
    private String LOWBATTERYSOUND;
    @JsonProperty("DEFAULT_INSTALL_LOCATION")
    private String DEFAULTINSTALLLOCATION;
    @JsonProperty("MOBILE_DATA")
    private String MOBILEDATA;
    @JsonProperty("INSTALL_NON_MARKET_APPS")
    private String INSTALLNONMARKETAPPS;
    @JsonProperty("CALL_AUTO_RETRY")
    private String CALLAUTORETRY;
    @JsonProperty("LOW_BATTERY_SOUND_TIMEOUT")
    private String LOWBATTERYSOUNDTIMEOUT;
    @JsonProperty("NETSTATS_ENABLED")
    private String NETSTATSENABLED;
    @JsonProperty("CERT_PIN_UPDATE_METADATA_URL")
    private String CERTPINUPDATEMETADATAURL;
    @JsonProperty("STAY_ON_WHILE_PLUGGED_IN")
    private String STAYONWHILEPLUGGEDIN;
    @JsonProperty("ADB_ENABLED")
    private String ADBENABLED;

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
    public String getSETINSTALLLOCATION() {
        return SETINSTALLLOCATION;
    }

    /**
     * 
     * @param SETINSTALLLOCATION
     *     The SET_INSTALL_LOCATION
     */
    @JsonProperty("SET_INSTALL_LOCATION")
    public void setSETINSTALLLOCATION(String SETINSTALLLOCATION) {
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
    public String getBLUETOOTHON() {
        return BLUETOOTHON;
    }

    /**
     * 
     * @param BLUETOOTHON
     *     The BLUETOOTH_ON
     */
    @JsonProperty("BLUETOOTH_ON")
    public void setBLUETOOTHON(String BLUETOOTHON) {
        this.BLUETOOTHON = BLUETOOTHON;
    }

    /**
     * 
     * @return
     *     The DOCKAUDIOMEDIAENABLED
     */
    @JsonProperty("DOCK_AUDIO_MEDIA_ENABLED")
    public String getDOCKAUDIOMEDIAENABLED() {
        return DOCKAUDIOMEDIAENABLED;
    }

    /**
     * 
     * @param DOCKAUDIOMEDIAENABLED
     *     The DOCK_AUDIO_MEDIA_ENABLED
     */
    @JsonProperty("DOCK_AUDIO_MEDIA_ENABLED")
    public void setDOCKAUDIOMEDIAENABLED(String DOCKAUDIOMEDIAENABLED) {
        this.DOCKAUDIOMEDIAENABLED = DOCKAUDIOMEDIAENABLED;
    }

    /**
     * 
     * @return
     *     The CDMASUBSCRIPTIONMODE
     */
    @JsonProperty("CDMA_SUBSCRIPTION_MODE")
    public String getCDMASUBSCRIPTIONMODE() {
        return CDMASUBSCRIPTIONMODE;
    }

    /**
     * 
     * @param CDMASUBSCRIPTIONMODE
     *     The CDMA_SUBSCRIPTION_MODE
     */
    @JsonProperty("CDMA_SUBSCRIPTION_MODE")
    public void setCDMASUBSCRIPTIONMODE(String CDMASUBSCRIPTIONMODE) {
        this.CDMASUBSCRIPTIONMODE = CDMASUBSCRIPTIONMODE;
    }

    /**
     * 
     * @return
     *     The USBMASSSTORAGEENABLED
     */
    @JsonProperty("USB_MASS_STORAGE_ENABLED")
    public String getUSBMASSSTORAGEENABLED() {
        return USBMASSSTORAGEENABLED;
    }

    /**
     * 
     * @param USBMASSSTORAGEENABLED
     *     The USB_MASS_STORAGE_ENABLED
     */
    @JsonProperty("USB_MASS_STORAGE_ENABLED")
    public void setUSBMASSSTORAGEENABLED(String USBMASSSTORAGEENABLED) {
        this.USBMASSSTORAGEENABLED = USBMASSSTORAGEENABLED;
    }

    /**
     * 
     * @return
     *     The EMERGENCYTONE
     */
    @JsonProperty("EMERGENCY_TONE")
    public String getEMERGENCYTONE() {
        return EMERGENCYTONE;
    }

    /**
     * 
     * @param EMERGENCYTONE
     *     The EMERGENCY_TONE
     */
    @JsonProperty("EMERGENCY_TONE")
    public void setEMERGENCYTONE(String EMERGENCYTONE) {
        this.EMERGENCYTONE = EMERGENCYTONE;
    }

    /**
     * 
     * @return
     *     The NETWORKPREFERENCE
     */
    @JsonProperty("NETWORK_PREFERENCE")
    public String getNETWORKPREFERENCE() {
        return NETWORKPREFERENCE;
    }

    /**
     * 
     * @param NETWORKPREFERENCE
     *     The NETWORK_PREFERENCE
     */
    @JsonProperty("NETWORK_PREFERENCE")
    public void setNETWORKPREFERENCE(String NETWORKPREFERENCE) {
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
    public String getETHERNETMODE() {
        return ETHERNETMODE;
    }

    /**
     * 
     * @param ETHERNETMODE
     *     The ETHERNET_MODE
     */
    @JsonProperty("ETHERNET_MODE")
    public void setETHERNETMODE(String ETHERNETMODE) {
        this.ETHERNETMODE = ETHERNETMODE;
    }

    /**
     * 
     * @return
     *     The WIFISCANALWAYSAVAILABLE
     */
    @JsonProperty("WIFI_SCAN_ALWAYS_AVAILABLE")
    public String getWIFISCANALWAYSAVAILABLE() {
        return WIFISCANALWAYSAVAILABLE;
    }

    /**
     * 
     * @param WIFISCANALWAYSAVAILABLE
     *     The WIFI_SCAN_ALWAYS_AVAILABLE
     */
    @JsonProperty("WIFI_SCAN_ALWAYS_AVAILABLE")
    public void setWIFISCANALWAYSAVAILABLE(String WIFISCANALWAYSAVAILABLE) {
        this.WIFISCANALWAYSAVAILABLE = WIFISCANALWAYSAVAILABLE;
    }

    /**
     * 
     * @return
     *     The WIFION
     */
    @JsonProperty("WIFI_ON")
    public String getWIFION() {
        return WIFION;
    }

    /**
     * 
     * @param WIFION
     *     The WIFI_ON
     */
    @JsonProperty("WIFI_ON")
    public void setWIFION(String WIFION) {
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
    public String getWIFIDISPLAYON() {
        return WIFIDISPLAYON;
    }

    /**
     * 
     * @param WIFIDISPLAYON
     *     The WIFI_DISPLAY_ON
     */
    @JsonProperty("WIFI_DISPLAY_ON")
    public void setWIFIDISPLAYON(String WIFIDISPLAYON) {
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
    public String getWIFISLEEPPOLICY() {
        return WIFISLEEPPOLICY;
    }

    /**
     * 
     * @param WIFISLEEPPOLICY
     *     The WIFI_SLEEP_POLICY
     */
    @JsonProperty("WIFI_SLEEP_POLICY")
    public void setWIFISLEEPPOLICY(String WIFISLEEPPOLICY) {
        this.WIFISLEEPPOLICY = WIFISLEEPPOLICY;
    }

    /**
     * 
     * @return
     *     The WIFIWATCHDOGON
     */
    @JsonProperty("WIFI_WATCHDOG_ON")
    public String getWIFIWATCHDOGON() {
        return WIFIWATCHDOGON;
    }

    /**
     * 
     * @param WIFIWATCHDOGON
     *     The WIFI_WATCHDOG_ON
     */
    @JsonProperty("WIFI_WATCHDOG_ON")
    public void setWIFIWATCHDOGON(String WIFIWATCHDOGON) {
        this.WIFIWATCHDOGON = WIFIWATCHDOGON;
    }

    /**
     * 
     * @return
     *     The SENDACTIONAPPERROR
     */
    @JsonProperty("SEND_ACTION_APP_ERROR")
    public String getSENDACTIONAPPERROR() {
        return SENDACTIONAPPERROR;
    }

    /**
     * 
     * @param SENDACTIONAPPERROR
     *     The SEND_ACTION_APP_ERROR
     */
    @JsonProperty("SEND_ACTION_APP_ERROR")
    public void setSENDACTIONAPPERROR(String SENDACTIONAPPERROR) {
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
    public String getPREFERREDNETWORKMODE() {
        return PREFERREDNETWORKMODE;
    }

    /**
     * 
     * @param PREFERREDNETWORKMODE
     *     The PREFERRED_NETWORK_MODE
     */
    @JsonProperty("PREFERRED_NETWORK_MODE")
    public void setPREFERREDNETWORKMODE(String PREFERREDNETWORKMODE) {
        this.PREFERREDNETWORKMODE = PREFERREDNETWORKMODE;
    }

    /**
     * 
     * @return
     *     The AUTOTIME
     */
    @JsonProperty("AUTO_TIME")
    public String getAUTOTIME() {
        return AUTOTIME;
    }

    /**
     * 
     * @param AUTOTIME
     *     The AUTO_TIME
     */
    @JsonProperty("AUTO_TIME")
    public void setAUTOTIME(String AUTOTIME) {
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
    public String getAUDIOSAFEVOLUMESTATE() {
        return AUDIOSAFEVOLUMESTATE;
    }

    /**
     * 
     * @param AUDIOSAFEVOLUMESTATE
     *     The AUDIO_SAFE_VOLUME_STATE
     */
    @JsonProperty("AUDIO_SAFE_VOLUME_STATE")
    public void setAUDIOSAFEVOLUMESTATE(String AUDIOSAFEVOLUMESTATE) {
        this.AUDIOSAFEVOLUMESTATE = AUDIOSAFEVOLUMESTATE;
    }

    /**
     * 
     * @return
     *     The AIRPLANEMODEON
     */
    @JsonProperty("AIRPLANE_MODE_ON")
    public String getAIRPLANEMODEON() {
        return AIRPLANEMODEON;
    }

    /**
     * 
     * @param AIRPLANEMODEON
     *     The AIRPLANE_MODE_ON
     */
    @JsonProperty("AIRPLANE_MODE_ON")
    public void setAIRPLANEMODEON(String AIRPLANEMODEON) {
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
    public String getWIFIMAXDHCPRETRYCOUNT() {
        return WIFIMAXDHCPRETRYCOUNT;
    }

    /**
     * 
     * @param WIFIMAXDHCPRETRYCOUNT
     *     The WIFI_MAX_DHCP_RETRY_COUNT
     */
    @JsonProperty("WIFI_MAX_DHCP_RETRY_COUNT")
    public void setWIFIMAXDHCPRETRYCOUNT(String WIFIMAXDHCPRETRYCOUNT) {
        this.WIFIMAXDHCPRETRYCOUNT = WIFIMAXDHCPRETRYCOUNT;
    }

    /**
     * 
     * @return
     *     The POWERSOUNDSENABLED
     */
    @JsonProperty("POWER_SOUNDS_ENABLED")
    public String getPOWERSOUNDSENABLED() {
        return POWERSOUNDSENABLED;
    }

    /**
     * 
     * @param POWERSOUNDSENABLED
     *     The POWER_SOUNDS_ENABLED
     */
    @JsonProperty("POWER_SOUNDS_ENABLED")
    public void setPOWERSOUNDSENABLED(String POWERSOUNDSENABLED) {
        this.POWERSOUNDSENABLED = POWERSOUNDSENABLED;
    }

    /**
     * 
     * @return
     *     The MODERINGER
     */
    @JsonProperty("MODE_RINGER")
    public String getMODERINGER() {
        return MODERINGER;
    }

    /**
     * 
     * @param MODERINGER
     *     The MODE_RINGER
     */
    @JsonProperty("MODE_RINGER")
    public void setMODERINGER(String MODERINGER) {
        this.MODERINGER = MODERINGER;
    }

    /**
     * 
     * @return
     *     The DOCKSOUNDSENABLED
     */
    @JsonProperty("DOCK_SOUNDS_ENABLED")
    public String getDOCKSOUNDSENABLED() {
        return DOCKSOUNDSENABLED;
    }

    /**
     * 
     * @param DOCKSOUNDSENABLED
     *     The DOCK_SOUNDS_ENABLED
     */
    @JsonProperty("DOCK_SOUNDS_ENABLED")
    public void setDOCKSOUNDSENABLED(String DOCKSOUNDSENABLED) {
        this.DOCKSOUNDSENABLED = DOCKSOUNDSENABLED;
    }

    /**
     * 
     * @return
     *     The ASSISTEDGPSENABLED
     */
    @JsonProperty("ASSISTED_GPS_ENABLED")
    public String getASSISTEDGPSENABLED() {
        return ASSISTEDGPSENABLED;
    }

    /**
     * 
     * @param ASSISTEDGPSENABLED
     *     The ASSISTED_GPS_ENABLED
     */
    @JsonProperty("ASSISTED_GPS_ENABLED")
    public void setASSISTEDGPSENABLED(String ASSISTEDGPSENABLED) {
        this.ASSISTEDGPSENABLED = ASSISTEDGPSENABLED;
    }

    /**
     * 
     * @return
     *     The CDMACELLBROADCASTSMS
     */
    @JsonProperty("CDMA_CELL_BROADCAST_SMS")
    public String getCDMACELLBROADCASTSMS() {
        return CDMACELLBROADCASTSMS;
    }

    /**
     * 
     * @param CDMACELLBROADCASTSMS
     *     The CDMA_CELL_BROADCAST_SMS
     */
    @JsonProperty("CDMA_CELL_BROADCAST_SMS")
    public void setCDMACELLBROADCASTSMS(String CDMACELLBROADCASTSMS) {
        this.CDMACELLBROADCASTSMS = CDMACELLBROADCASTSMS;
    }

    /**
     * 
     * @return
     *     The AIRPLANEMODEONFASTBOOT
     */
    @JsonProperty("AIRPLANE_MODE_ON_FAST_BOOT")
    public String getAIRPLANEMODEONFASTBOOT() {
        return AIRPLANEMODEONFASTBOOT;
    }

    /**
     * 
     * @param AIRPLANEMODEONFASTBOOT
     *     The AIRPLANE_MODE_ON_FAST_BOOT
     */
    @JsonProperty("AIRPLANE_MODE_ON_FAST_BOOT")
    public void setAIRPLANEMODEONFASTBOOT(String AIRPLANEMODEONFASTBOOT) {
        this.AIRPLANEMODEONFASTBOOT = AIRPLANEMODEONFASTBOOT;
    }

    /**
     * 
     * @return
     *     The WIFINETWORKSAVAILABLENOTIFICATIONON
     */
    @JsonProperty("WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON")
    public String getWIFINETWORKSAVAILABLENOTIFICATIONON() {
        return WIFINETWORKSAVAILABLENOTIFICATIONON;
    }

    /**
     * 
     * @param WIFINETWORKSAVAILABLENOTIFICATIONON
     *     The WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON
     */
    @JsonProperty("WIFI_NETWORKS_AVAILABLE_NOTIFICATION_ON")
    public void setWIFINETWORKSAVAILABLENOTIFICATIONON(String WIFINETWORKSAVAILABLENOTIFICATIONON) {
        this.WIFINETWORKSAVAILABLENOTIFICATIONON = WIFINETWORKSAVAILABLENOTIFICATIONON;
    }

    /**
     * 
     * @return
     *     The ETHERNETON
     */
    @JsonProperty("ETHERNET_ON")
    public String getETHERNETON() {
        return ETHERNETON;
    }

    /**
     * 
     * @param ETHERNETON
     *     The ETHERNET_ON
     */
    @JsonProperty("ETHERNET_ON")
    public void setETHERNETON(String ETHERNETON) {
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
    public String getDATAROAMING() {
        return DATAROAMING;
    }

    /**
     * 
     * @param DATAROAMING
     *     The DATA_ROAMING
     */
    @JsonProperty("DATA_ROAMING")
    public void setDATAROAMING(String DATAROAMING) {
        this.DATAROAMING = DATAROAMING;
    }

    /**
     * 
     * @return
     *     The DEVICEPROVISIONED
     */
    @JsonProperty("DEVICE_PROVISIONED")
    public String getDEVICEPROVISIONED() {
        return DEVICEPROVISIONED;
    }

    /**
     * 
     * @param DEVICEPROVISIONED
     *     The DEVICE_PROVISIONED
     */
    @JsonProperty("DEVICE_PROVISIONED")
    public void setDEVICEPROVISIONED(String DEVICEPROVISIONED) {
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
    public String getAUTOTIMEZONE() {
        return AUTOTIMEZONE;
    }

    /**
     * 
     * @param AUTOTIMEZONE
     *     The AUTO_TIME_ZONE
     */
    @JsonProperty("AUTO_TIME_ZONE")
    public void setAUTOTIMEZONE(String AUTOTIMEZONE) {
        this.AUTOTIMEZONE = AUTOTIMEZONE;
    }

    /**
     * 
     * @return
     *     The PACKAGEVERIFIERENABLE
     */
    @JsonProperty("PACKAGE_VERIFIER_ENABLE")
    public String getPACKAGEVERIFIERENABLE() {
        return PACKAGEVERIFIERENABLE;
    }

    /**
     * 
     * @param PACKAGEVERIFIERENABLE
     *     The PACKAGE_VERIFIER_ENABLE
     */
    @JsonProperty("PACKAGE_VERIFIER_ENABLE")
    public void setPACKAGEVERIFIERENABLE(String PACKAGEVERIFIERENABLE) {
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
    public String getDEFAULTINSTALLLOCATION() {
        return DEFAULTINSTALLLOCATION;
    }

    /**
     * 
     * @param DEFAULTINSTALLLOCATION
     *     The DEFAULT_INSTALL_LOCATION
     */
    @JsonProperty("DEFAULT_INSTALL_LOCATION")
    public void setDEFAULTINSTALLLOCATION(String DEFAULTINSTALLLOCATION) {
        this.DEFAULTINSTALLLOCATION = DEFAULTINSTALLLOCATION;
    }

    /**
     * 
     * @return
     *     The MOBILEDATA
     */
    @JsonProperty("MOBILE_DATA")
    public String getMOBILEDATA() {
        return MOBILEDATA;
    }

    /**
     * 
     * @param MOBILEDATA
     *     The MOBILE_DATA
     */
    @JsonProperty("MOBILE_DATA")
    public void setMOBILEDATA(String MOBILEDATA) {
        this.MOBILEDATA = MOBILEDATA;
    }

    /**
     * 
     * @return
     *     The INSTALLNONMARKETAPPS
     */
    @JsonProperty("INSTALL_NON_MARKET_APPS")
    public String getINSTALLNONMARKETAPPS() {
        return INSTALLNONMARKETAPPS;
    }

    /**
     * 
     * @param INSTALLNONMARKETAPPS
     *     The INSTALL_NON_MARKET_APPS
     */
    @JsonProperty("INSTALL_NON_MARKET_APPS")
    public void setINSTALLNONMARKETAPPS(String INSTALLNONMARKETAPPS) {
        this.INSTALLNONMARKETAPPS = INSTALLNONMARKETAPPS;
    }

    /**
     * 
     * @return
     *     The CALLAUTORETRY
     */
    @JsonProperty("CALL_AUTO_RETRY")
    public String getCALLAUTORETRY() {
        return CALLAUTORETRY;
    }

    /**
     * 
     * @param CALLAUTORETRY
     *     The CALL_AUTO_RETRY
     */
    @JsonProperty("CALL_AUTO_RETRY")
    public void setCALLAUTORETRY(String CALLAUTORETRY) {
        this.CALLAUTORETRY = CALLAUTORETRY;
    }

    /**
     * 
     * @return
     *     The LOWBATTERYSOUNDTIMEOUT
     */
    @JsonProperty("LOW_BATTERY_SOUND_TIMEOUT")
    public String getLOWBATTERYSOUNDTIMEOUT() {
        return LOWBATTERYSOUNDTIMEOUT;
    }

    /**
     * 
     * @param LOWBATTERYSOUNDTIMEOUT
     *     The LOW_BATTERY_SOUND_TIMEOUT
     */
    @JsonProperty("LOW_BATTERY_SOUND_TIMEOUT")
    public void setLOWBATTERYSOUNDTIMEOUT(String LOWBATTERYSOUNDTIMEOUT) {
        this.LOWBATTERYSOUNDTIMEOUT = LOWBATTERYSOUNDTIMEOUT;
    }

    /**
     * 
     * @return
     *     The NETSTATSENABLED
     */
    @JsonProperty("NETSTATS_ENABLED")
    public String getNETSTATSENABLED() {
        return NETSTATSENABLED;
    }

    /**
     * 
     * @param NETSTATSENABLED
     *     The NETSTATS_ENABLED
     */
    @JsonProperty("NETSTATS_ENABLED")
    public void setNETSTATSENABLED(String NETSTATSENABLED) {
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
    public String getSTAYONWHILEPLUGGEDIN() {
        return STAYONWHILEPLUGGEDIN;
    }

    /**
     * 
     * @param STAYONWHILEPLUGGEDIN
     *     The STAY_ON_WHILE_PLUGGED_IN
     */
    @JsonProperty("STAY_ON_WHILE_PLUGGED_IN")
    public void setSTAYONWHILEPLUGGEDIN(String STAYONWHILEPLUGGEDIN) {
        this.STAYONWHILEPLUGGEDIN = STAYONWHILEPLUGGEDIN;
    }

    /**
     * 
     * @return
     *     The ADBENABLED
     */
    @JsonProperty("ADB_ENABLED")
    public String getADBENABLED() {
        return ADBENABLED;
    }

    /**
     * 
     * @param ADBENABLED
     *     The ADB_ENABLED
     */
    @JsonProperty("ADB_ENABLED")
    public void setADBENABLED(String ADBENABLED) {
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
