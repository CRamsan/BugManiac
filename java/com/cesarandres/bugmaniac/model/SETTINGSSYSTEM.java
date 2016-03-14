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
    "CPU_FAST_ENABLE",
    "VOLUME_RING",
    "TIME_12_24",
    "HAPTIC_FEEDBACK_ENABLED",
    "BRIGHT_SYSTEM_MODE",
    "SCREEN_OFF_TIMEOUT",
    "HDMI_OUTPUT_MODE",
    "TEXT_SHOW_PASSWORD",
    "ROTATION_MODE_SET",
    "BOOT_FAST_ENABLE",
    "SCREEN_BRIGHTNESS_MODE",
    "POINTER_SPEED",
    "ALARM_ALERT",
    "VOLUME_BLUETOOTH_SCO",
    "HDMI_FULL_SCREEN",
    "VOLUME_SYSTEM",
    "HEARING_AID",
    "ACCELEROMETER_COORDINATE",
    "TTY_MODE",
    "HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY",
    "NOTIFICATION_LIGHT_PULSE",
    "MUTE_STREAMS_AFFECTED",
    "MEDIA_BUTTON_RECEIVER",
    "BRIGHTNESS_LIGHT_MODE",
    "ACCELEROMETER_ROTATION",
    "SOUND_EFFECTS_ENABLED",
    "DTMF_TONE_TYPE_WHEN_DIALING",
    "VOLUME_VOICE",
    "DTMF_TONE_WHEN_DIALING",
    "DATE_FORMAT",
    "VOLUME_ALARM",
    "SCREEN_BRIGHTNESS",
    "VOLUME_NOTIFICATION",
    "USER_ROTATION",
    "VIBRATE_WHEN_RINGING",
    "DISPLAY_ADAPTION_ENABLE",
    "NEXT_ALARM_FORMATTED",
    "MODE_RINGER_STREAMS_AFFECTED",
    "VOLUME_MUSIC",
    "LOCKSCREEN_SOUNDS_ENABLED"
})

@Serialize
public class SETTINGSSYSTEM implements Serializable{

	private static final long serialVersionUID = -6130098308226849665L;

	@JsonProperty("CPU_FAST_ENABLE")
    private String CPUFASTENABLE;
    @JsonProperty("VOLUME_RING")
    private String VOLUMERING;
    @JsonProperty("TIME_12_24")
    private String TIME1224;
    @JsonProperty("HAPTIC_FEEDBACK_ENABLED")
    private String HAPTICFEEDBACKENABLED;
    @JsonProperty("BRIGHT_SYSTEM_MODE")
    private String BRIGHTSYSTEMMODE;
    @JsonProperty("SCREEN_OFF_TIMEOUT")
    private String SCREENOFFTIMEOUT;
    @JsonProperty("HDMI_OUTPUT_MODE")
    private String HDMIOUTPUTMODE;
    @JsonProperty("TEXT_SHOW_PASSWORD")
    private String TEXTSHOWPASSWORD;
    @JsonProperty("ROTATION_MODE_SET")
    private String ROTATIONMODESET;
    @JsonProperty("BOOT_FAST_ENABLE")
    private String BOOTFASTENABLE;
    @JsonProperty("SCREEN_BRIGHTNESS_MODE")
    private String SCREENBRIGHTNESSMODE;
    @JsonProperty("POINTER_SPEED")
    private String POINTERSPEED;
    @JsonProperty("ALARM_ALERT")
    private String ALARMALERT;
    @JsonProperty("VOLUME_BLUETOOTH_SCO")
    private String VOLUMEBLUETOOTHSCO;
    @JsonProperty("HDMI_FULL_SCREEN")
    private String HDMIFULLSCREEN;
    @JsonProperty("VOLUME_SYSTEM")
    private String VOLUMESYSTEM;
    @JsonProperty("HEARING_AID")
    private String HEARINGAID;
    @JsonProperty("ACCELEROMETER_COORDINATE")
    private String ACCELEROMETERCOORDINATE;
    @JsonProperty("TTY_MODE")
    private String TTYMODE;
    @JsonProperty("HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY")
    private String HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY;
    @JsonProperty("NOTIFICATION_LIGHT_PULSE")
    private String NOTIFICATIONLIGHTPULSE;
    @JsonProperty("MUTE_STREAMS_AFFECTED")
    private String MUTESTREAMSAFFECTED;
    @JsonProperty("MEDIA_BUTTON_RECEIVER")
    private String MEDIABUTTONRECEIVER;
    @JsonProperty("BRIGHTNESS_LIGHT_MODE")
    private String BRIGHTNESSLIGHTMODE;
    @JsonProperty("ACCELEROMETER_ROTATION")
    private String ACCELEROMETERROTATION;
    @JsonProperty("SOUND_EFFECTS_ENABLED")
    private String SOUNDEFFECTSENABLED;
    @JsonProperty("DTMF_TONE_TYPE_WHEN_DIALING")
    private String DTMFTONETYPEWHENDIALING;
    @JsonProperty("VOLUME_VOICE")
    private String VOLUMEVOICE;
    @JsonProperty("DTMF_TONE_WHEN_DIALING")
    private String DTMFTONEWHENDIALING;
    @JsonProperty("DATE_FORMAT")
    private String DATEFORMAT;
    @JsonProperty("VOLUME_ALARM")
    private String VOLUMEALARM;
    @JsonProperty("SCREEN_BRIGHTNESS")
    private String SCREENBRIGHTNESS;
    @JsonProperty("VOLUME_NOTIFICATION")
    private String VOLUMENOTIFICATION;
    @JsonProperty("USER_ROTATION")
    private String USERROTATION;
    @JsonProperty("VIBRATE_WHEN_RINGING")
    private String VIBRATEWHENRINGING;
    @JsonProperty("DISPLAY_ADAPTION_ENABLE")
    private String DISPLAYADAPTIONENABLE;
    @JsonProperty("NEXT_ALARM_FORMATTED")
    private String NEXTALARMFORMATTED;
    @JsonProperty("MODE_RINGER_STREAMS_AFFECTED")
    private String MODERINGERSTREAMSAFFECTED;
    @JsonProperty("VOLUME_MUSIC")
    private String VOLUMEMUSIC;
    @JsonProperty("LOCKSCREEN_SOUNDS_ENABLED")
    private String LOCKSCREENSOUNDSENABLED;

    /**
     * 
     * @return
     *     The CPUFASTENABLE
     */
    @JsonProperty("CPU_FAST_ENABLE")
    public String getCPUFASTENABLE() {
        return CPUFASTENABLE;
    }

    /**
     * 
     * @param CPUFASTENABLE
     *     The CPU_FAST_ENABLE
     */
    @JsonProperty("CPU_FAST_ENABLE")
    public void setCPUFASTENABLE(String CPUFASTENABLE) {
        this.CPUFASTENABLE = CPUFASTENABLE;
    }

    /**
     * 
     * @return
     *     The VOLUMERING
     */
    @JsonProperty("VOLUME_RING")
    public String getVOLUMERING() {
        return VOLUMERING;
    }

    /**
     * 
     * @param VOLUMERING
     *     The VOLUME_RING
     */
    @JsonProperty("VOLUME_RING")
    public void setVOLUMERING(String VOLUMERING) {
        this.VOLUMERING = VOLUMERING;
    }

    /**
     * 
     * @return
     *     The TIME1224
     */
    @JsonProperty("TIME_12_24")
    public String getTIME1224() {
        return TIME1224;
    }

    /**
     * 
     * @param TIME1224
     *     The TIME_12_24
     */
    @JsonProperty("TIME_12_24")
    public void setTIME1224(String TIME1224) {
        this.TIME1224 = TIME1224;
    }

    /**
     * 
     * @return
     *     The HAPTICFEEDBACKENABLED
     */
    @JsonProperty("HAPTIC_FEEDBACK_ENABLED")
    public String getHAPTICFEEDBACKENABLED() {
        return HAPTICFEEDBACKENABLED;
    }

    /**
     * 
     * @param HAPTICFEEDBACKENABLED
     *     The HAPTIC_FEEDBACK_ENABLED
     */
    @JsonProperty("HAPTIC_FEEDBACK_ENABLED")
    public void setHAPTICFEEDBACKENABLED(String HAPTICFEEDBACKENABLED) {
        this.HAPTICFEEDBACKENABLED = HAPTICFEEDBACKENABLED;
    }

    /**
     * 
     * @return
     *     The BRIGHTSYSTEMMODE
     */
    @JsonProperty("BRIGHT_SYSTEM_MODE")
    public String getBRIGHTSYSTEMMODE() {
        return BRIGHTSYSTEMMODE;
    }

    /**
     * 
     * @param BRIGHTSYSTEMMODE
     *     The BRIGHT_SYSTEM_MODE
     */
    @JsonProperty("BRIGHT_SYSTEM_MODE")
    public void setBRIGHTSYSTEMMODE(String BRIGHTSYSTEMMODE) {
        this.BRIGHTSYSTEMMODE = BRIGHTSYSTEMMODE;
    }

    /**
     * 
     * @return
     *     The SCREENOFFTIMEOUT
     */
    @JsonProperty("SCREEN_OFF_TIMEOUT")
    public String getSCREENOFFTIMEOUT() {
        return SCREENOFFTIMEOUT;
    }

    /**
     * 
     * @param SCREENOFFTIMEOUT
     *     The SCREEN_OFF_TIMEOUT
     */
    @JsonProperty("SCREEN_OFF_TIMEOUT")
    public void setSCREENOFFTIMEOUT(String SCREENOFFTIMEOUT) {
        this.SCREENOFFTIMEOUT = SCREENOFFTIMEOUT;
    }

    /**
     * 
     * @return
     *     The HDMIOUTPUTMODE
     */
    @JsonProperty("HDMI_OUTPUT_MODE")
    public String getHDMIOUTPUTMODE() {
        return HDMIOUTPUTMODE;
    }

    /**
     * 
     * @param HDMIOUTPUTMODE
     *     The HDMI_OUTPUT_MODE
     */
    @JsonProperty("HDMI_OUTPUT_MODE")
    public void setHDMIOUTPUTMODE(String HDMIOUTPUTMODE) {
        this.HDMIOUTPUTMODE = HDMIOUTPUTMODE;
    }

    /**
     * 
     * @return
     *     The TEXTSHOWPASSWORD
     */
    @JsonProperty("TEXT_SHOW_PASSWORD")
    public String getTEXTSHOWPASSWORD() {
        return TEXTSHOWPASSWORD;
    }

    /**
     * 
     * @param TEXTSHOWPASSWORD
     *     The TEXT_SHOW_PASSWORD
     */
    @JsonProperty("TEXT_SHOW_PASSWORD")
    public void setTEXTSHOWPASSWORD(String TEXTSHOWPASSWORD) {
        this.TEXTSHOWPASSWORD = TEXTSHOWPASSWORD;
    }

    /**
     * 
     * @return
     *     The ROTATIONMODESET
     */
    @JsonProperty("ROTATION_MODE_SET")
    public String getROTATIONMODESET() {
        return ROTATIONMODESET;
    }

    /**
     * 
     * @param ROTATIONMODESET
     *     The ROTATION_MODE_SET
     */
    @JsonProperty("ROTATION_MODE_SET")
    public void setROTATIONMODESET(String ROTATIONMODESET) {
        this.ROTATIONMODESET = ROTATIONMODESET;
    }

    /**
     * 
     * @return
     *     The BOOTFASTENABLE
     */
    @JsonProperty("BOOT_FAST_ENABLE")
    public String getBOOTFASTENABLE() {
        return BOOTFASTENABLE;
    }

    /**
     * 
     * @param BOOTFASTENABLE
     *     The BOOT_FAST_ENABLE
     */
    @JsonProperty("BOOT_FAST_ENABLE")
    public void setBOOTFASTENABLE(String BOOTFASTENABLE) {
        this.BOOTFASTENABLE = BOOTFASTENABLE;
    }

    /**
     * 
     * @return
     *     The SCREENBRIGHTNESSMODE
     */
    @JsonProperty("SCREEN_BRIGHTNESS_MODE")
    public String getSCREENBRIGHTNESSMODE() {
        return SCREENBRIGHTNESSMODE;
    }

    /**
     * 
     * @param SCREENBRIGHTNESSMODE
     *     The SCREEN_BRIGHTNESS_MODE
     */
    @JsonProperty("SCREEN_BRIGHTNESS_MODE")
    public void setSCREENBRIGHTNESSMODE(String SCREENBRIGHTNESSMODE) {
        this.SCREENBRIGHTNESSMODE = SCREENBRIGHTNESSMODE;
    }

    /**
     * 
     * @return
     *     The POINTERSPEED
     */
    @JsonProperty("POINTER_SPEED")
    public String getPOINTERSPEED() {
        return POINTERSPEED;
    }

    /**
     * 
     * @param POINTERSPEED
     *     The POINTER_SPEED
     */
    @JsonProperty("POINTER_SPEED")
    public void setPOINTERSPEED(String POINTERSPEED) {
        this.POINTERSPEED = POINTERSPEED;
    }

    /**
     * 
     * @return
     *     The ALARMALERT
     */
    @JsonProperty("ALARM_ALERT")
    public String getALARMALERT() {
        return ALARMALERT;
    }

    /**
     * 
     * @param ALARMALERT
     *     The ALARM_ALERT
     */
    @JsonProperty("ALARM_ALERT")
    public void setALARMALERT(String ALARMALERT) {
        this.ALARMALERT = ALARMALERT;
    }

    /**
     * 
     * @return
     *     The VOLUMEBLUETOOTHSCO
     */
    @JsonProperty("VOLUME_BLUETOOTH_SCO")
    public String getVOLUMEBLUETOOTHSCO() {
        return VOLUMEBLUETOOTHSCO;
    }

    /**
     * 
     * @param VOLUMEBLUETOOTHSCO
     *     The VOLUME_BLUETOOTH_SCO
     */
    @JsonProperty("VOLUME_BLUETOOTH_SCO")
    public void setVOLUMEBLUETOOTHSCO(String VOLUMEBLUETOOTHSCO) {
        this.VOLUMEBLUETOOTHSCO = VOLUMEBLUETOOTHSCO;
    }

    /**
     * 
     * @return
     *     The HDMIFULLSCREEN
     */
    @JsonProperty("HDMI_FULL_SCREEN")
    public String getHDMIFULLSCREEN() {
        return HDMIFULLSCREEN;
    }

    /**
     * 
     * @param HDMIFULLSCREEN
     *     The HDMI_FULL_SCREEN
     */
    @JsonProperty("HDMI_FULL_SCREEN")
    public void setHDMIFULLSCREEN(String HDMIFULLSCREEN) {
        this.HDMIFULLSCREEN = HDMIFULLSCREEN;
    }

    /**
     * 
     * @return
     *     The VOLUMESYSTEM
     */
    @JsonProperty("VOLUME_SYSTEM")
    public String getVOLUMESYSTEM() {
        return VOLUMESYSTEM;
    }

    /**
     * 
     * @param VOLUMESYSTEM
     *     The VOLUME_SYSTEM
     */
    @JsonProperty("VOLUME_SYSTEM")
    public void setVOLUMESYSTEM(String VOLUMESYSTEM) {
        this.VOLUMESYSTEM = VOLUMESYSTEM;
    }

    /**
     * 
     * @return
     *     The HEARINGAID
     */
    @JsonProperty("HEARING_AID")
    public String getHEARINGAID() {
        return HEARINGAID;
    }

    /**
     * 
     * @param HEARINGAID
     *     The HEARING_AID
     */
    @JsonProperty("HEARING_AID")
    public void setHEARINGAID(String HEARINGAID) {
        this.HEARINGAID = HEARINGAID;
    }

    /**
     * 
     * @return
     *     The ACCELEROMETERCOORDINATE
     */
    @JsonProperty("ACCELEROMETER_COORDINATE")
    public String getACCELEROMETERCOORDINATE() {
        return ACCELEROMETERCOORDINATE;
    }

    /**
     * 
     * @param ACCELEROMETERCOORDINATE
     *     The ACCELEROMETER_COORDINATE
     */
    @JsonProperty("ACCELEROMETER_COORDINATE")
    public void setACCELEROMETERCOORDINATE(String ACCELEROMETERCOORDINATE) {
        this.ACCELEROMETERCOORDINATE = ACCELEROMETERCOORDINATE;
    }

    /**
     * 
     * @return
     *     The TTYMODE
     */
    @JsonProperty("TTY_MODE")
    public String getTTYMODE() {
        return TTYMODE;
    }

    /**
     * 
     * @param TTYMODE
     *     The TTY_MODE
     */
    @JsonProperty("TTY_MODE")
    public void setTTYMODE(String TTYMODE) {
        this.TTYMODE = TTYMODE;
    }

    /**
     * 
     * @return
     *     The HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY
     */
    @JsonProperty("HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY")
    public String getHIDEROTATIONLOCKTOGGLEFORACCESSIBILITY() {
        return HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY;
    }

    /**
     * 
     * @param HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY
     *     The HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY
     */
    @JsonProperty("HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY")
    public void setHIDEROTATIONLOCKTOGGLEFORACCESSIBILITY(String HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY) {
        this.HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY = HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY;
    }

    /**
     * 
     * @return
     *     The NOTIFICATIONLIGHTPULSE
     */
    @JsonProperty("NOTIFICATION_LIGHT_PULSE")
    public String getNOTIFICATIONLIGHTPULSE() {
        return NOTIFICATIONLIGHTPULSE;
    }

    /**
     * 
     * @param NOTIFICATIONLIGHTPULSE
     *     The NOTIFICATION_LIGHT_PULSE
     */
    @JsonProperty("NOTIFICATION_LIGHT_PULSE")
    public void setNOTIFICATIONLIGHTPULSE(String NOTIFICATIONLIGHTPULSE) {
        this.NOTIFICATIONLIGHTPULSE = NOTIFICATIONLIGHTPULSE;
    }

    /**
     * 
     * @return
     *     The MUTESTREAMSAFFECTED
     */
    @JsonProperty("MUTE_STREAMS_AFFECTED")
    public String getMUTESTREAMSAFFECTED() {
        return MUTESTREAMSAFFECTED;
    }

    /**
     * 
     * @param MUTESTREAMSAFFECTED
     *     The MUTE_STREAMS_AFFECTED
     */
    @JsonProperty("MUTE_STREAMS_AFFECTED")
    public void setMUTESTREAMSAFFECTED(String MUTESTREAMSAFFECTED) {
        this.MUTESTREAMSAFFECTED = MUTESTREAMSAFFECTED;
    }

    /**
     * 
     * @return
     *     The MEDIABUTTONRECEIVER
     */
    @JsonProperty("MEDIA_BUTTON_RECEIVER")
    public String getMEDIABUTTONRECEIVER() {
        return MEDIABUTTONRECEIVER;
    }

    /**
     * 
     * @param MEDIABUTTONRECEIVER
     *     The MEDIA_BUTTON_RECEIVER
     */
    @JsonProperty("MEDIA_BUTTON_RECEIVER")
    public void setMEDIABUTTONRECEIVER(String MEDIABUTTONRECEIVER) {
        this.MEDIABUTTONRECEIVER = MEDIABUTTONRECEIVER;
    }

    /**
     * 
     * @return
     *     The BRIGHTNESSLIGHTMODE
     */
    @JsonProperty("BRIGHTNESS_LIGHT_MODE")
    public String getBRIGHTNESSLIGHTMODE() {
        return BRIGHTNESSLIGHTMODE;
    }

    /**
     * 
     * @param BRIGHTNESSLIGHTMODE
     *     The BRIGHTNESS_LIGHT_MODE
     */
    @JsonProperty("BRIGHTNESS_LIGHT_MODE")
    public void setBRIGHTNESSLIGHTMODE(String BRIGHTNESSLIGHTMODE) {
        this.BRIGHTNESSLIGHTMODE = BRIGHTNESSLIGHTMODE;
    }

    /**
     * 
     * @return
     *     The ACCELEROMETERROTATION
     */
    @JsonProperty("ACCELEROMETER_ROTATION")
    public String getACCELEROMETERROTATION() {
        return ACCELEROMETERROTATION;
    }

    /**
     * 
     * @param ACCELEROMETERROTATION
     *     The ACCELEROMETER_ROTATION
     */
    @JsonProperty("ACCELEROMETER_ROTATION")
    public void setACCELEROMETERROTATION(String ACCELEROMETERROTATION) {
        this.ACCELEROMETERROTATION = ACCELEROMETERROTATION;
    }

    /**
     * 
     * @return
     *     The SOUNDEFFECTSENABLED
     */
    @JsonProperty("SOUND_EFFECTS_ENABLED")
    public String getSOUNDEFFECTSENABLED() {
        return SOUNDEFFECTSENABLED;
    }

    /**
     * 
     * @param SOUNDEFFECTSENABLED
     *     The SOUND_EFFECTS_ENABLED
     */
    @JsonProperty("SOUND_EFFECTS_ENABLED")
    public void setSOUNDEFFECTSENABLED(String SOUNDEFFECTSENABLED) {
        this.SOUNDEFFECTSENABLED = SOUNDEFFECTSENABLED;
    }

    /**
     * 
     * @return
     *     The DTMFTONETYPEWHENDIALING
     */
    @JsonProperty("DTMF_TONE_TYPE_WHEN_DIALING")
    public String getDTMFTONETYPEWHENDIALING() {
        return DTMFTONETYPEWHENDIALING;
    }

    /**
     * 
     * @param DTMFTONETYPEWHENDIALING
     *     The DTMF_TONE_TYPE_WHEN_DIALING
     */
    @JsonProperty("DTMF_TONE_TYPE_WHEN_DIALING")
    public void setDTMFTONETYPEWHENDIALING(String DTMFTONETYPEWHENDIALING) {
        this.DTMFTONETYPEWHENDIALING = DTMFTONETYPEWHENDIALING;
    }

    /**
     * 
     * @return
     *     The VOLUMEVOICE
     */
    @JsonProperty("VOLUME_VOICE")
    public String getVOLUMEVOICE() {
        return VOLUMEVOICE;
    }

    /**
     * 
     * @param VOLUMEVOICE
     *     The VOLUME_VOICE
     */
    @JsonProperty("VOLUME_VOICE")
    public void setVOLUMEVOICE(String VOLUMEVOICE) {
        this.VOLUMEVOICE = VOLUMEVOICE;
    }

    /**
     * 
     * @return
     *     The DTMFTONEWHENDIALING
     */
    @JsonProperty("DTMF_TONE_WHEN_DIALING")
    public String getDTMFTONEWHENDIALING() {
        return DTMFTONEWHENDIALING;
    }

    /**
     * 
     * @param DTMFTONEWHENDIALING
     *     The DTMF_TONE_WHEN_DIALING
     */
    @JsonProperty("DTMF_TONE_WHEN_DIALING")
    public void setDTMFTONEWHENDIALING(String DTMFTONEWHENDIALING) {
        this.DTMFTONEWHENDIALING = DTMFTONEWHENDIALING;
    }

    /**
     * 
     * @return
     *     The DATEFORMAT
     */
    @JsonProperty("DATE_FORMAT")
    public String getDATEFORMAT() {
        return DATEFORMAT;
    }

    /**
     * 
     * @param DATEFORMAT
     *     The DATE_FORMAT
     */
    @JsonProperty("DATE_FORMAT")
    public void setDATEFORMAT(String DATEFORMAT) {
        this.DATEFORMAT = DATEFORMAT;
    }

    /**
     * 
     * @return
     *     The VOLUMEALARM
     */
    @JsonProperty("VOLUME_ALARM")
    public String getVOLUMEALARM() {
        return VOLUMEALARM;
    }

    /**
     * 
     * @param VOLUMEALARM
     *     The VOLUME_ALARM
     */
    @JsonProperty("VOLUME_ALARM")
    public void setVOLUMEALARM(String VOLUMEALARM) {
        this.VOLUMEALARM = VOLUMEALARM;
    }

    /**
     * 
     * @return
     *     The SCREENBRIGHTNESS
     */
    @JsonProperty("SCREEN_BRIGHTNESS")
    public String getSCREENBRIGHTNESS() {
        return SCREENBRIGHTNESS;
    }

    /**
     * 
     * @param SCREENBRIGHTNESS
     *     The SCREEN_BRIGHTNESS
     */
    @JsonProperty("SCREEN_BRIGHTNESS")
    public void setSCREENBRIGHTNESS(String SCREENBRIGHTNESS) {
        this.SCREENBRIGHTNESS = SCREENBRIGHTNESS;
    }

    /**
     * 
     * @return
     *     The VOLUMENOTIFICATION
     */
    @JsonProperty("VOLUME_NOTIFICATION")
    public String getVOLUMENOTIFICATION() {
        return VOLUMENOTIFICATION;
    }

    /**
     * 
     * @param VOLUMENOTIFICATION
     *     The VOLUME_NOTIFICATION
     */
    @JsonProperty("VOLUME_NOTIFICATION")
    public void setVOLUMENOTIFICATION(String VOLUMENOTIFICATION) {
        this.VOLUMENOTIFICATION = VOLUMENOTIFICATION;
    }

    /**
     * 
     * @return
     *     The USERROTATION
     */
    @JsonProperty("USER_ROTATION")
    public String getUSERROTATION() {
        return USERROTATION;
    }

    /**
     * 
     * @param USERROTATION
     *     The USER_ROTATION
     */
    @JsonProperty("USER_ROTATION")
    public void setUSERROTATION(String USERROTATION) {
        this.USERROTATION = USERROTATION;
    }

    /**
     * 
     * @return
     *     The VIBRATEWHENRINGING
     */
    @JsonProperty("VIBRATE_WHEN_RINGING")
    public String getVIBRATEWHENRINGING() {
        return VIBRATEWHENRINGING;
    }

    /**
     * 
     * @param VIBRATEWHENRINGING
     *     The VIBRATE_WHEN_RINGING
     */
    @JsonProperty("VIBRATE_WHEN_RINGING")
    public void setVIBRATEWHENRINGING(String VIBRATEWHENRINGING) {
        this.VIBRATEWHENRINGING = VIBRATEWHENRINGING;
    }

    /**
     * 
     * @return
     *     The DISPLAYADAPTIONENABLE
     */
    @JsonProperty("DISPLAY_ADAPTION_ENABLE")
    public String getDISPLAYADAPTIONENABLE() {
        return DISPLAYADAPTIONENABLE;
    }

    /**
     * 
     * @param DISPLAYADAPTIONENABLE
     *     The DISPLAY_ADAPTION_ENABLE
     */
    @JsonProperty("DISPLAY_ADAPTION_ENABLE")
    public void setDISPLAYADAPTIONENABLE(String DISPLAYADAPTIONENABLE) {
        this.DISPLAYADAPTIONENABLE = DISPLAYADAPTIONENABLE;
    }

    /**
     * 
     * @return
     *     The NEXTALARMFORMATTED
     */
    @JsonProperty("NEXT_ALARM_FORMATTED")
    public String getNEXTALARMFORMATTED() {
        return NEXTALARMFORMATTED;
    }

    /**
     * 
     * @param NEXTALARMFORMATTED
     *     The NEXT_ALARM_FORMATTED
     */
    @JsonProperty("NEXT_ALARM_FORMATTED")
    public void setNEXTALARMFORMATTED(String NEXTALARMFORMATTED) {
        this.NEXTALARMFORMATTED = NEXTALARMFORMATTED;
    }

    /**
     * 
     * @return
     *     The MODERINGERSTREAMSAFFECTED
     */
    @JsonProperty("MODE_RINGER_STREAMS_AFFECTED")
    public String getMODERINGERSTREAMSAFFECTED() {
        return MODERINGERSTREAMSAFFECTED;
    }

    /**
     * 
     * @param MODERINGERSTREAMSAFFECTED
     *     The MODE_RINGER_STREAMS_AFFECTED
     */
    @JsonProperty("MODE_RINGER_STREAMS_AFFECTED")
    public void setMODERINGERSTREAMSAFFECTED(String MODERINGERSTREAMSAFFECTED) {
        this.MODERINGERSTREAMSAFFECTED = MODERINGERSTREAMSAFFECTED;
    }

    /**
     * 
     * @return
     *     The VOLUMEMUSIC
     */
    @JsonProperty("VOLUME_MUSIC")
    public String getVOLUMEMUSIC() {
        return VOLUMEMUSIC;
    }

    /**
     * 
     * @param VOLUMEMUSIC
     *     The VOLUME_MUSIC
     */
    @JsonProperty("VOLUME_MUSIC")
    public void setVOLUMEMUSIC(String VOLUMEMUSIC) {
        this.VOLUMEMUSIC = VOLUMEMUSIC;
    }

    /**
     * 
     * @return
     *     The LOCKSCREENSOUNDSENABLED
     */
    @JsonProperty("LOCKSCREEN_SOUNDS_ENABLED")
    public String getLOCKSCREENSOUNDSENABLED() {
        return LOCKSCREENSOUNDSENABLED;
    }

    /**
     * 
     * @param LOCKSCREENSOUNDSENABLED
     *     The LOCKSCREEN_SOUNDS_ENABLED
     */
    @JsonProperty("LOCKSCREEN_SOUNDS_ENABLED")
    public void setLOCKSCREENSOUNDSENABLED(String LOCKSCREENSOUNDSENABLED) {
        this.LOCKSCREENSOUNDSENABLED = LOCKSCREENSOUNDSENABLED;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(CPUFASTENABLE).append(VOLUMERING).append(TIME1224).append(HAPTICFEEDBACKENABLED).append(BRIGHTSYSTEMMODE).append(SCREENOFFTIMEOUT).append(HDMIOUTPUTMODE).append(TEXTSHOWPASSWORD).append(ROTATIONMODESET).append(BOOTFASTENABLE).append(SCREENBRIGHTNESSMODE).append(POINTERSPEED).append(ALARMALERT).append(VOLUMEBLUETOOTHSCO).append(HDMIFULLSCREEN).append(VOLUMESYSTEM).append(HEARINGAID).append(ACCELEROMETERCOORDINATE).append(TTYMODE).append(HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY).append(NOTIFICATIONLIGHTPULSE).append(MUTESTREAMSAFFECTED).append(MEDIABUTTONRECEIVER).append(BRIGHTNESSLIGHTMODE).append(ACCELEROMETERROTATION).append(SOUNDEFFECTSENABLED).append(DTMFTONETYPEWHENDIALING).append(VOLUMEVOICE).append(DTMFTONEWHENDIALING).append(DATEFORMAT).append(VOLUMEALARM).append(SCREENBRIGHTNESS).append(VOLUMENOTIFICATION).append(USERROTATION).append(VIBRATEWHENRINGING).append(DISPLAYADAPTIONENABLE).append(NEXTALARMFORMATTED).append(MODERINGERSTREAMSAFFECTED).append(VOLUMEMUSIC).append(LOCKSCREENSOUNDSENABLED).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SETTINGSSYSTEM) == false) {
            return false;
        }
        SETTINGSSYSTEM rhs = ((SETTINGSSYSTEM) other);
        return new EqualsBuilder().append(CPUFASTENABLE, rhs.CPUFASTENABLE).append(VOLUMERING, rhs.VOLUMERING).append(TIME1224, rhs.TIME1224).append(HAPTICFEEDBACKENABLED, rhs.HAPTICFEEDBACKENABLED).append(BRIGHTSYSTEMMODE, rhs.BRIGHTSYSTEMMODE).append(SCREENOFFTIMEOUT, rhs.SCREENOFFTIMEOUT).append(HDMIOUTPUTMODE, rhs.HDMIOUTPUTMODE).append(TEXTSHOWPASSWORD, rhs.TEXTSHOWPASSWORD).append(ROTATIONMODESET, rhs.ROTATIONMODESET).append(BOOTFASTENABLE, rhs.BOOTFASTENABLE).append(SCREENBRIGHTNESSMODE, rhs.SCREENBRIGHTNESSMODE).append(POINTERSPEED, rhs.POINTERSPEED).append(ALARMALERT, rhs.ALARMALERT).append(VOLUMEBLUETOOTHSCO, rhs.VOLUMEBLUETOOTHSCO).append(HDMIFULLSCREEN, rhs.HDMIFULLSCREEN).append(VOLUMESYSTEM, rhs.VOLUMESYSTEM).append(HEARINGAID, rhs.HEARINGAID).append(ACCELEROMETERCOORDINATE, rhs.ACCELEROMETERCOORDINATE).append(TTYMODE, rhs.TTYMODE).append(HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY, rhs.HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY).append(NOTIFICATIONLIGHTPULSE, rhs.NOTIFICATIONLIGHTPULSE).append(MUTESTREAMSAFFECTED, rhs.MUTESTREAMSAFFECTED).append(MEDIABUTTONRECEIVER, rhs.MEDIABUTTONRECEIVER).append(BRIGHTNESSLIGHTMODE, rhs.BRIGHTNESSLIGHTMODE).append(ACCELEROMETERROTATION, rhs.ACCELEROMETERROTATION).append(SOUNDEFFECTSENABLED, rhs.SOUNDEFFECTSENABLED).append(DTMFTONETYPEWHENDIALING, rhs.DTMFTONETYPEWHENDIALING).append(VOLUMEVOICE, rhs.VOLUMEVOICE).append(DTMFTONEWHENDIALING, rhs.DTMFTONEWHENDIALING).append(DATEFORMAT, rhs.DATEFORMAT).append(VOLUMEALARM, rhs.VOLUMEALARM).append(SCREENBRIGHTNESS, rhs.SCREENBRIGHTNESS).append(VOLUMENOTIFICATION, rhs.VOLUMENOTIFICATION).append(USERROTATION, rhs.USERROTATION).append(VIBRATEWHENRINGING, rhs.VIBRATEWHENRINGING).append(DISPLAYADAPTIONENABLE, rhs.DISPLAYADAPTIONENABLE).append(NEXTALARMFORMATTED, rhs.NEXTALARMFORMATTED).append(MODERINGERSTREAMSAFFECTED, rhs.MODERINGERSTREAMSAFFECTED).append(VOLUMEMUSIC, rhs.VOLUMEMUSIC).append(LOCKSCREENSOUNDSENABLED, rhs.LOCKSCREENSOUNDSENABLED).isEquals();
    }

}
