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
    private Long CPUFASTENABLE;
    @JsonProperty("VOLUME_RING")
    private Long VOLUMERING;
    @JsonProperty("TIME_12_24")
    private Long TIME1224;
    @JsonProperty("HAPTIC_FEEDBACK_ENABLED")
    private Long HAPTICFEEDBACKENABLED;
    @JsonProperty("BRIGHT_SYSTEM_MODE")
    private Long BRIGHTSYSTEMMODE;
    @JsonProperty("SCREEN_OFF_TIMEOUT")
    private Long SCREENOFFTIMEOUT;
    @JsonProperty("HDMI_OUTPUT_MODE")
    private Long HDMIOUTPUTMODE;
    @JsonProperty("TEXT_SHOW_PASSWORD")
    private Long TEXTSHOWPASSWORD;
    @JsonProperty("ROTATION_MODE_SET")
    private Long ROTATIONMODESET;
    @JsonProperty("BOOT_FAST_ENABLE")
    private Long BOOTFASTENABLE;
    @JsonProperty("SCREEN_BRIGHTNESS_MODE")
    private Long SCREENBRIGHTNESSMODE;
    @JsonProperty("POINTER_SPEED")
    private Long POINTERSPEED;
    @JsonProperty("ALARM_ALERT")
    private String ALARMALERT;
    @JsonProperty("VOLUME_BLUETOOTH_SCO")
    private Long VOLUMEBLUETOOTHSCO;
    @JsonProperty("HDMI_FULL_SCREEN")
    private Long HDMIFULLSCREEN;
    @JsonProperty("VOLUME_SYSTEM")
    private Long VOLUMESYSTEM;
    @JsonProperty("HEARING_AID")
    private Long HEARINGAID;
    @JsonProperty("ACCELEROMETER_COORDINATE")
    private String ACCELEROMETERCOORDINATE;
    @JsonProperty("TTY_MODE")
    private Long TTYMODE;
    @JsonProperty("HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY")
    private Long HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY;
    @JsonProperty("NOTIFICATION_LIGHT_PULSE")
    private Long NOTIFICATIONLIGHTPULSE;
    @JsonProperty("MUTE_STREAMS_AFFECTED")
    private Long MUTESTREAMSAFFECTED;
    @JsonProperty("MEDIA_BUTTON_RECEIVER")
    private String MEDIABUTTONRECEIVER;
    @JsonProperty("BRIGHTNESS_LIGHT_MODE")
    private Long BRIGHTNESSLIGHTMODE;
    @JsonProperty("ACCELEROMETER_ROTATION")
    private Long ACCELEROMETERROTATION;
    @JsonProperty("SOUND_EFFECTS_ENABLED")
    private Long SOUNDEFFECTSENABLED;
    @JsonProperty("DTMF_TONE_TYPE_WHEN_DIALING")
    private Long DTMFTONETYPEWHENDIALING;
    @JsonProperty("VOLUME_VOICE")
    private Long VOLUMEVOICE;
    @JsonProperty("DTMF_TONE_WHEN_DIALING")
    private Long DTMFTONEWHENDIALING;
    @JsonProperty("DATE_FORMAT")
    private String DATEFORMAT;
    @JsonProperty("VOLUME_ALARM")
    private Long VOLUMEALARM;
    @JsonProperty("SCREEN_BRIGHTNESS")
    private Long SCREENBRIGHTNESS;
    @JsonProperty("VOLUME_NOTIFICATION")
    private Long VOLUMENOTIFICATION;
    @JsonProperty("USER_ROTATION")
    private Long USERROTATION;
    @JsonProperty("VIBRATE_WHEN_RINGING")
    private Long VIBRATEWHENRINGING;
    @JsonProperty("DISPLAY_ADAPTION_ENABLE")
    private Long DISPLAYADAPTIONENABLE;
    @JsonProperty("NEXT_ALARM_FORMATTED")
    private String NEXTALARMFORMATTED;
    @JsonProperty("MODE_RINGER_STREAMS_AFFECTED")
    private Long MODERINGERSTREAMSAFFECTED;
    @JsonProperty("VOLUME_MUSIC")
    private Long VOLUMEMUSIC;
    @JsonProperty("LOCKSCREEN_SOUNDS_ENABLED")
    private Long LOCKSCREENSOUNDSENABLED;

    /**
     * 
     * @return
     *     The CPUFASTENABLE
     */
    @JsonProperty("CPU_FAST_ENABLE")
    public Long getCPUFASTENABLE() {
        return CPUFASTENABLE;
    }

    /**
     * 
     * @param CPUFASTENABLE
     *     The CPU_FAST_ENABLE
     */
    @JsonProperty("CPU_FAST_ENABLE")
    public void setCPUFASTENABLE(Long CPUFASTENABLE) {
        this.CPUFASTENABLE = CPUFASTENABLE;
    }

    /**
     * 
     * @return
     *     The VOLUMERING
     */
    @JsonProperty("VOLUME_RING")
    public Long getVOLUMERING() {
        return VOLUMERING;
    }

    /**
     * 
     * @param VOLUMERING
     *     The VOLUME_RING
     */
    @JsonProperty("VOLUME_RING")
    public void setVOLUMERING(Long VOLUMERING) {
        this.VOLUMERING = VOLUMERING;
    }

    /**
     * 
     * @return
     *     The TIME1224
     */
    @JsonProperty("TIME_12_24")
    public Long getTIME1224() {
        return TIME1224;
    }

    /**
     * 
     * @param TIME1224
     *     The TIME_12_24
     */
    @JsonProperty("TIME_12_24")
    public void setTIME1224(Long TIME1224) {
        this.TIME1224 = TIME1224;
    }

    /**
     * 
     * @return
     *     The HAPTICFEEDBACKENABLED
     */
    @JsonProperty("HAPTIC_FEEDBACK_ENABLED")
    public Long getHAPTICFEEDBACKENABLED() {
        return HAPTICFEEDBACKENABLED;
    }

    /**
     * 
     * @param HAPTICFEEDBACKENABLED
     *     The HAPTIC_FEEDBACK_ENABLED
     */
    @JsonProperty("HAPTIC_FEEDBACK_ENABLED")
    public void setHAPTICFEEDBACKENABLED(Long HAPTICFEEDBACKENABLED) {
        this.HAPTICFEEDBACKENABLED = HAPTICFEEDBACKENABLED;
    }

    /**
     * 
     * @return
     *     The BRIGHTSYSTEMMODE
     */
    @JsonProperty("BRIGHT_SYSTEM_MODE")
    public Long getBRIGHTSYSTEMMODE() {
        return BRIGHTSYSTEMMODE;
    }

    /**
     * 
     * @param BRIGHTSYSTEMMODE
     *     The BRIGHT_SYSTEM_MODE
     */
    @JsonProperty("BRIGHT_SYSTEM_MODE")
    public void setBRIGHTSYSTEMMODE(Long BRIGHTSYSTEMMODE) {
        this.BRIGHTSYSTEMMODE = BRIGHTSYSTEMMODE;
    }

    /**
     * 
     * @return
     *     The SCREENOFFTIMEOUT
     */
    @JsonProperty("SCREEN_OFF_TIMEOUT")
    public Long getSCREENOFFTIMEOUT() {
        return SCREENOFFTIMEOUT;
    }

    /**
     * 
     * @param SCREENOFFTIMEOUT
     *     The SCREEN_OFF_TIMEOUT
     */
    @JsonProperty("SCREEN_OFF_TIMEOUT")
    public void setSCREENOFFTIMEOUT(Long SCREENOFFTIMEOUT) {
        this.SCREENOFFTIMEOUT = SCREENOFFTIMEOUT;
    }

    /**
     * 
     * @return
     *     The HDMIOUTPUTMODE
     */
    @JsonProperty("HDMI_OUTPUT_MODE")
    public Long getHDMIOUTPUTMODE() {
        return HDMIOUTPUTMODE;
    }

    /**
     * 
     * @param HDMIOUTPUTMODE
     *     The HDMI_OUTPUT_MODE
     */
    @JsonProperty("HDMI_OUTPUT_MODE")
    public void setHDMIOUTPUTMODE(Long HDMIOUTPUTMODE) {
        this.HDMIOUTPUTMODE = HDMIOUTPUTMODE;
    }

    /**
     * 
     * @return
     *     The TEXTSHOWPASSWORD
     */
    @JsonProperty("TEXT_SHOW_PASSWORD")
    public Long getTEXTSHOWPASSWORD() {
        return TEXTSHOWPASSWORD;
    }

    /**
     * 
     * @param TEXTSHOWPASSWORD
     *     The TEXT_SHOW_PASSWORD
     */
    @JsonProperty("TEXT_SHOW_PASSWORD")
    public void setTEXTSHOWPASSWORD(Long TEXTSHOWPASSWORD) {
        this.TEXTSHOWPASSWORD = TEXTSHOWPASSWORD;
    }

    /**
     * 
     * @return
     *     The ROTATIONMODESET
     */
    @JsonProperty("ROTATION_MODE_SET")
    public Long getROTATIONMODESET() {
        return ROTATIONMODESET;
    }

    /**
     * 
     * @param ROTATIONMODESET
     *     The ROTATION_MODE_SET
     */
    @JsonProperty("ROTATION_MODE_SET")
    public void setROTATIONMODESET(Long ROTATIONMODESET) {
        this.ROTATIONMODESET = ROTATIONMODESET;
    }

    /**
     * 
     * @return
     *     The BOOTFASTENABLE
     */
    @JsonProperty("BOOT_FAST_ENABLE")
    public Long getBOOTFASTENABLE() {
        return BOOTFASTENABLE;
    }

    /**
     * 
     * @param BOOTFASTENABLE
     *     The BOOT_FAST_ENABLE
     */
    @JsonProperty("BOOT_FAST_ENABLE")
    public void setBOOTFASTENABLE(Long BOOTFASTENABLE) {
        this.BOOTFASTENABLE = BOOTFASTENABLE;
    }

    /**
     * 
     * @return
     *     The SCREENBRIGHTNESSMODE
     */
    @JsonProperty("SCREEN_BRIGHTNESS_MODE")
    public Long getSCREENBRIGHTNESSMODE() {
        return SCREENBRIGHTNESSMODE;
    }

    /**
     * 
     * @param SCREENBRIGHTNESSMODE
     *     The SCREEN_BRIGHTNESS_MODE
     */
    @JsonProperty("SCREEN_BRIGHTNESS_MODE")
    public void setSCREENBRIGHTNESSMODE(Long SCREENBRIGHTNESSMODE) {
        this.SCREENBRIGHTNESSMODE = SCREENBRIGHTNESSMODE;
    }

    /**
     * 
     * @return
     *     The POINTERSPEED
     */
    @JsonProperty("POINTER_SPEED")
    public Long getPOINTERSPEED() {
        return POINTERSPEED;
    }

    /**
     * 
     * @param POINTERSPEED
     *     The POINTER_SPEED
     */
    @JsonProperty("POINTER_SPEED")
    public void setPOINTERSPEED(Long POINTERSPEED) {
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
    public Long getVOLUMEBLUETOOTHSCO() {
        return VOLUMEBLUETOOTHSCO;
    }

    /**
     * 
     * @param VOLUMEBLUETOOTHSCO
     *     The VOLUME_BLUETOOTH_SCO
     */
    @JsonProperty("VOLUME_BLUETOOTH_SCO")
    public void setVOLUMEBLUETOOTHSCO(Long VOLUMEBLUETOOTHSCO) {
        this.VOLUMEBLUETOOTHSCO = VOLUMEBLUETOOTHSCO;
    }

    /**
     * 
     * @return
     *     The HDMIFULLSCREEN
     */
    @JsonProperty("HDMI_FULL_SCREEN")
    public Long getHDMIFULLSCREEN() {
        return HDMIFULLSCREEN;
    }

    /**
     * 
     * @param HDMIFULLSCREEN
     *     The HDMI_FULL_SCREEN
     */
    @JsonProperty("HDMI_FULL_SCREEN")
    public void setHDMIFULLSCREEN(Long HDMIFULLSCREEN) {
        this.HDMIFULLSCREEN = HDMIFULLSCREEN;
    }

    /**
     * 
     * @return
     *     The VOLUMESYSTEM
     */
    @JsonProperty("VOLUME_SYSTEM")
    public Long getVOLUMESYSTEM() {
        return VOLUMESYSTEM;
    }

    /**
     * 
     * @param VOLUMESYSTEM
     *     The VOLUME_SYSTEM
     */
    @JsonProperty("VOLUME_SYSTEM")
    public void setVOLUMESYSTEM(Long VOLUMESYSTEM) {
        this.VOLUMESYSTEM = VOLUMESYSTEM;
    }

    /**
     * 
     * @return
     *     The HEARINGAID
     */
    @JsonProperty("HEARING_AID")
    public Long getHEARINGAID() {
        return HEARINGAID;
    }

    /**
     * 
     * @param HEARINGAID
     *     The HEARING_AID
     */
    @JsonProperty("HEARING_AID")
    public void setHEARINGAID(Long HEARINGAID) {
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
    public Long getTTYMODE() {
        return TTYMODE;
    }

    /**
     * 
     * @param TTYMODE
     *     The TTY_MODE
     */
    @JsonProperty("TTY_MODE")
    public void setTTYMODE(Long TTYMODE) {
        this.TTYMODE = TTYMODE;
    }

    /**
     * 
     * @return
     *     The HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY
     */
    @JsonProperty("HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY")
    public Long getHIDEROTATIONLOCKTOGGLEFORACCESSIBILITY() {
        return HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY;
    }

    /**
     * 
     * @param HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY
     *     The HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY
     */
    @JsonProperty("HIDE_ROTATION_LOCK_TOGGLE_FOR_ACCESSIBILITY")
    public void setHIDEROTATIONLOCKTOGGLEFORACCESSIBILITY(Long HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY) {
        this.HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY = HIDEROTATIONLOCKTOGGLEFORACCESSIBILITY;
    }

    /**
     * 
     * @return
     *     The NOTIFICATIONLIGHTPULSE
     */
    @JsonProperty("NOTIFICATION_LIGHT_PULSE")
    public Long getNOTIFICATIONLIGHTPULSE() {
        return NOTIFICATIONLIGHTPULSE;
    }

    /**
     * 
     * @param NOTIFICATIONLIGHTPULSE
     *     The NOTIFICATION_LIGHT_PULSE
     */
    @JsonProperty("NOTIFICATION_LIGHT_PULSE")
    public void setNOTIFICATIONLIGHTPULSE(Long NOTIFICATIONLIGHTPULSE) {
        this.NOTIFICATIONLIGHTPULSE = NOTIFICATIONLIGHTPULSE;
    }

    /**
     * 
     * @return
     *     The MUTESTREAMSAFFECTED
     */
    @JsonProperty("MUTE_STREAMS_AFFECTED")
    public Long getMUTESTREAMSAFFECTED() {
        return MUTESTREAMSAFFECTED;
    }

    /**
     * 
     * @param MUTESTREAMSAFFECTED
     *     The MUTE_STREAMS_AFFECTED
     */
    @JsonProperty("MUTE_STREAMS_AFFECTED")
    public void setMUTESTREAMSAFFECTED(Long MUTESTREAMSAFFECTED) {
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
    public Long getBRIGHTNESSLIGHTMODE() {
        return BRIGHTNESSLIGHTMODE;
    }

    /**
     * 
     * @param BRIGHTNESSLIGHTMODE
     *     The BRIGHTNESS_LIGHT_MODE
     */
    @JsonProperty("BRIGHTNESS_LIGHT_MODE")
    public void setBRIGHTNESSLIGHTMODE(Long BRIGHTNESSLIGHTMODE) {
        this.BRIGHTNESSLIGHTMODE = BRIGHTNESSLIGHTMODE;
    }

    /**
     * 
     * @return
     *     The ACCELEROMETERROTATION
     */
    @JsonProperty("ACCELEROMETER_ROTATION")
    public Long getACCELEROMETERROTATION() {
        return ACCELEROMETERROTATION;
    }

    /**
     * 
     * @param ACCELEROMETERROTATION
     *     The ACCELEROMETER_ROTATION
     */
    @JsonProperty("ACCELEROMETER_ROTATION")
    public void setACCELEROMETERROTATION(Long ACCELEROMETERROTATION) {
        this.ACCELEROMETERROTATION = ACCELEROMETERROTATION;
    }

    /**
     * 
     * @return
     *     The SOUNDEFFECTSENABLED
     */
    @JsonProperty("SOUND_EFFECTS_ENABLED")
    public Long getSOUNDEFFECTSENABLED() {
        return SOUNDEFFECTSENABLED;
    }

    /**
     * 
     * @param SOUNDEFFECTSENABLED
     *     The SOUND_EFFECTS_ENABLED
     */
    @JsonProperty("SOUND_EFFECTS_ENABLED")
    public void setSOUNDEFFECTSENABLED(Long SOUNDEFFECTSENABLED) {
        this.SOUNDEFFECTSENABLED = SOUNDEFFECTSENABLED;
    }

    /**
     * 
     * @return
     *     The DTMFTONETYPEWHENDIALING
     */
    @JsonProperty("DTMF_TONE_TYPE_WHEN_DIALING")
    public Long getDTMFTONETYPEWHENDIALING() {
        return DTMFTONETYPEWHENDIALING;
    }

    /**
     * 
     * @param DTMFTONETYPEWHENDIALING
     *     The DTMF_TONE_TYPE_WHEN_DIALING
     */
    @JsonProperty("DTMF_TONE_TYPE_WHEN_DIALING")
    public void setDTMFTONETYPEWHENDIALING(Long DTMFTONETYPEWHENDIALING) {
        this.DTMFTONETYPEWHENDIALING = DTMFTONETYPEWHENDIALING;
    }

    /**
     * 
     * @return
     *     The VOLUMEVOICE
     */
    @JsonProperty("VOLUME_VOICE")
    public Long getVOLUMEVOICE() {
        return VOLUMEVOICE;
    }

    /**
     * 
     * @param VOLUMEVOICE
     *     The VOLUME_VOICE
     */
    @JsonProperty("VOLUME_VOICE")
    public void setVOLUMEVOICE(Long VOLUMEVOICE) {
        this.VOLUMEVOICE = VOLUMEVOICE;
    }

    /**
     * 
     * @return
     *     The DTMFTONEWHENDIALING
     */
    @JsonProperty("DTMF_TONE_WHEN_DIALING")
    public Long getDTMFTONEWHENDIALING() {
        return DTMFTONEWHENDIALING;
    }

    /**
     * 
     * @param DTMFTONEWHENDIALING
     *     The DTMF_TONE_WHEN_DIALING
     */
    @JsonProperty("DTMF_TONE_WHEN_DIALING")
    public void setDTMFTONEWHENDIALING(Long DTMFTONEWHENDIALING) {
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
    public Long getVOLUMEALARM() {
        return VOLUMEALARM;
    }

    /**
     * 
     * @param VOLUMEALARM
     *     The VOLUME_ALARM
     */
    @JsonProperty("VOLUME_ALARM")
    public void setVOLUMEALARM(Long VOLUMEALARM) {
        this.VOLUMEALARM = VOLUMEALARM;
    }

    /**
     * 
     * @return
     *     The SCREENBRIGHTNESS
     */
    @JsonProperty("SCREEN_BRIGHTNESS")
    public Long getSCREENBRIGHTNESS() {
        return SCREENBRIGHTNESS;
    }

    /**
     * 
     * @param SCREENBRIGHTNESS
     *     The SCREEN_BRIGHTNESS
     */
    @JsonProperty("SCREEN_BRIGHTNESS")
    public void setSCREENBRIGHTNESS(Long SCREENBRIGHTNESS) {
        this.SCREENBRIGHTNESS = SCREENBRIGHTNESS;
    }

    /**
     * 
     * @return
     *     The VOLUMENOTIFICATION
     */
    @JsonProperty("VOLUME_NOTIFICATION")
    public Long getVOLUMENOTIFICATION() {
        return VOLUMENOTIFICATION;
    }

    /**
     * 
     * @param VOLUMENOTIFICATION
     *     The VOLUME_NOTIFICATION
     */
    @JsonProperty("VOLUME_NOTIFICATION")
    public void setVOLUMENOTIFICATION(Long VOLUMENOTIFICATION) {
        this.VOLUMENOTIFICATION = VOLUMENOTIFICATION;
    }

    /**
     * 
     * @return
     *     The USERROTATION
     */
    @JsonProperty("USER_ROTATION")
    public Long getUSERROTATION() {
        return USERROTATION;
    }

    /**
     * 
     * @param USERROTATION
     *     The USER_ROTATION
     */
    @JsonProperty("USER_ROTATION")
    public void setUSERROTATION(Long USERROTATION) {
        this.USERROTATION = USERROTATION;
    }

    /**
     * 
     * @return
     *     The VIBRATEWHENRINGING
     */
    @JsonProperty("VIBRATE_WHEN_RINGING")
    public Long getVIBRATEWHENRINGING() {
        return VIBRATEWHENRINGING;
    }

    /**
     * 
     * @param VIBRATEWHENRINGING
     *     The VIBRATE_WHEN_RINGING
     */
    @JsonProperty("VIBRATE_WHEN_RINGING")
    public void setVIBRATEWHENRINGING(Long VIBRATEWHENRINGING) {
        this.VIBRATEWHENRINGING = VIBRATEWHENRINGING;
    }

    /**
     * 
     * @return
     *     The DISPLAYADAPTIONENABLE
     */
    @JsonProperty("DISPLAY_ADAPTION_ENABLE")
    public Long getDISPLAYADAPTIONENABLE() {
        return DISPLAYADAPTIONENABLE;
    }

    /**
     * 
     * @param DISPLAYADAPTIONENABLE
     *     The DISPLAY_ADAPTION_ENABLE
     */
    @JsonProperty("DISPLAY_ADAPTION_ENABLE")
    public void setDISPLAYADAPTIONENABLE(Long DISPLAYADAPTIONENABLE) {
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
    public Long getMODERINGERSTREAMSAFFECTED() {
        return MODERINGERSTREAMSAFFECTED;
    }

    /**
     * 
     * @param MODERINGERSTREAMSAFFECTED
     *     The MODE_RINGER_STREAMS_AFFECTED
     */
    @JsonProperty("MODE_RINGER_STREAMS_AFFECTED")
    public void setMODERINGERSTREAMSAFFECTED(Long MODERINGERSTREAMSAFFECTED) {
        this.MODERINGERSTREAMSAFFECTED = MODERINGERSTREAMSAFFECTED;
    }

    /**
     * 
     * @return
     *     The VOLUMEMUSIC
     */
    @JsonProperty("VOLUME_MUSIC")
    public Long getVOLUMEMUSIC() {
        return VOLUMEMUSIC;
    }

    /**
     * 
     * @param VOLUMEMUSIC
     *     The VOLUME_MUSIC
     */
    @JsonProperty("VOLUME_MUSIC")
    public void setVOLUMEMUSIC(Long VOLUMEMUSIC) {
        this.VOLUMEMUSIC = VOLUMEMUSIC;
    }

    /**
     * 
     * @return
     *     The LOCKSCREENSOUNDSENABLED
     */
    @JsonProperty("LOCKSCREEN_SOUNDS_ENABLED")
    public Long getLOCKSCREENSOUNDSENABLED() {
        return LOCKSCREENSOUNDSENABLED;
    }

    /**
     * 
     * @param LOCKSCREENSOUNDSENABLED
     *     The LOCKSCREEN_SOUNDS_ENABLED
     */
    @JsonProperty("LOCKSCREEN_SOUNDS_ENABLED")
    public void setLOCKSCREENSOUNDSENABLED(Long LOCKSCREENSOUNDSENABLED) {
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
