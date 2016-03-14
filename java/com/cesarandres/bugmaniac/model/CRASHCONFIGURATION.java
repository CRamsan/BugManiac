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
    "hardKeyboardHidden",
    "orientation",
    "screenLayout",
    "keyboard",
    "mcc",
    "locale",
    "densityDpi",
    "compatSmallestScreenWidthDp",
    "compatScreenHeightDp",
    "fontScale",
    "navigationHidden",
    "screenWidthDp",
    "uiMode",
    "screenHeightDp",
    "userSetLocale",
    "smallestScreenWidthDp",
    "navigation",
    "seq",
    "keyboardHidden",
    "mnc",
    "touchscreen",
    "compatScreenWidthDp"
})

@Serialize
public class CRASHCONFIGURATION implements Serializable{

	private static final long serialVersionUID = 2519956351445249946L;

	@JsonProperty("hardKeyboardHidden")
    private String hardKeyboardHidden;
    @JsonProperty("orientation")
    private String orientation;
    @JsonProperty("screenLayout")
    private String screenLayout;
    @JsonProperty("keyboard")
    private String keyboard;
    @JsonProperty("mcc")
    private String mcc;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("densityDpi")
    private String densityDpi;
    @JsonProperty("compatSmallestScreenWidthDp")
    private String compatSmallestScreenWidthDp;
    @JsonProperty("compatScreenHeightDp")
    private String compatScreenHeightDp;
    @JsonProperty("fontScale")
    private String fontScale;
    @JsonProperty("navigationHidden")
    private String navigationHidden;
    @JsonProperty("screenWidthDp")
    private String screenWidthDp;
    @JsonProperty("uiMode")
    private String uiMode;
    @JsonProperty("screenHeightDp")
    private String screenHeightDp;
    @JsonProperty("userSetLocale")
    private Boolean userSetLocale;
    @JsonProperty("smallestScreenWidthDp")
    private String smallestScreenWidthDp;
    @JsonProperty("navigation")
    private String navigation;
    @JsonProperty("seq")
    private String seq;
    @JsonProperty("keyboardHidden")
    private String keyboardHidden;
    @JsonProperty("mnc")
    private String mnc;
    @JsonProperty("touchscreen")
    private String touchscreen;
    @JsonProperty("compatScreenWidthDp")
    private String compatScreenWidthDp;

    /**
     * 
     * @return
     *     The hardKeyboardHidden
     */
    @JsonProperty("hardKeyboardHidden")
    public String getHardKeyboardHidden() {
        return hardKeyboardHidden;
    }

    /**
     * 
     * @param hardKeyboardHidden
     *     The hardKeyboardHidden
     */
    @JsonProperty("hardKeyboardHidden")
    public void setHardKeyboardHidden(String hardKeyboardHidden) {
        this.hardKeyboardHidden = hardKeyboardHidden;
    }

    /**
     * 
     * @return
     *     The orientation
     */
    @JsonProperty("orientation")
    public String getOrientation() {
        return orientation;
    }

    /**
     * 
     * @param orientation
     *     The orientation
     */
    @JsonProperty("orientation")
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * 
     * @return
     *     The screenLayout
     */
    @JsonProperty("screenLayout")
    public String getScreenLayout() {
        return screenLayout;
    }

    /**
     * 
     * @param screenLayout
     *     The screenLayout
     */
    @JsonProperty("screenLayout")
    public void setScreenLayout(String screenLayout) {
        this.screenLayout = screenLayout;
    }

    /**
     * 
     * @return
     *     The keyboard
     */
    @JsonProperty("keyboard")
    public String getKeyboard() {
        return keyboard;
    }

    /**
     * 
     * @param keyboard
     *     The keyboard
     */
    @JsonProperty("keyboard")
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    /**
     * 
     * @return
     *     The mcc
     */
    @JsonProperty("mcc")
    public String getMcc() {
        return mcc;
    }

    /**
     * 
     * @param mcc
     *     The mcc
     */
    @JsonProperty("mcc")
    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    /**
     * 
     * @return
     *     The locale
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The locale
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The densityDpi
     */
    @JsonProperty("densityDpi")
    public String getDensityDpi() {
        return densityDpi;
    }

    /**
     * 
     * @param densityDpi
     *     The densityDpi
     */
    @JsonProperty("densityDpi")
    public void setDensityDpi(String densityDpi) {
        this.densityDpi = densityDpi;
    }

    /**
     * 
     * @return
     *     The compatSmallestScreenWidthDp
     */
    @JsonProperty("compatSmallestScreenWidthDp")
    public String getCompatSmallestScreenWidthDp() {
        return compatSmallestScreenWidthDp;
    }

    /**
     * 
     * @param compatSmallestScreenWidthDp
     *     The compatSmallestScreenWidthDp
     */
    @JsonProperty("compatSmallestScreenWidthDp")
    public void setCompatSmallestScreenWidthDp(String compatSmallestScreenWidthDp) {
        this.compatSmallestScreenWidthDp = compatSmallestScreenWidthDp;
    }

    /**
     * 
     * @return
     *     The compatScreenHeightDp
     */
    @JsonProperty("compatScreenHeightDp")
    public String getCompatScreenHeightDp() {
        return compatScreenHeightDp;
    }

    /**
     * 
     * @param compatScreenHeightDp
     *     The compatScreenHeightDp
     */
    @JsonProperty("compatScreenHeightDp")
    public void setCompatScreenHeightDp(String compatScreenHeightDp) {
        this.compatScreenHeightDp = compatScreenHeightDp;
    }

    /**
     * 
     * @return
     *     The fontScale
     */
    @JsonProperty("fontScale")
    public String getFontScale() {
        return fontScale;
    }

    /**
     * 
     * @param fontScale
     *     The fontScale
     */
    @JsonProperty("fontScale")
    public void setFontScale(String fontScale) {
        this.fontScale = fontScale;
    }

    /**
     * 
     * @return
     *     The navigationHidden
     */
    @JsonProperty("navigationHidden")
    public String getNavigationHidden() {
        return navigationHidden;
    }

    /**
     * 
     * @param navigationHidden
     *     The navigationHidden
     */
    @JsonProperty("navigationHidden")
    public void setNavigationHidden(String navigationHidden) {
        this.navigationHidden = navigationHidden;
    }

    /**
     * 
     * @return
     *     The screenWidthDp
     */
    @JsonProperty("screenWidthDp")
    public String getScreenWidthDp() {
        return screenWidthDp;
    }

    /**
     * 
     * @param screenWidthDp
     *     The screenWidthDp
     */
    @JsonProperty("screenWidthDp")
    public void setScreenWidthDp(String screenWidthDp) {
        this.screenWidthDp = screenWidthDp;
    }

    /**
     * 
     * @return
     *     The uiMode
     */
    @JsonProperty("uiMode")
    public String getUiMode() {
        return uiMode;
    }

    /**
     * 
     * @param uiMode
     *     The uiMode
     */
    @JsonProperty("uiMode")
    public void setUiMode(String uiMode) {
        this.uiMode = uiMode;
    }

    /**
     * 
     * @return
     *     The screenHeightDp
     */
    @JsonProperty("screenHeightDp")
    public String getScreenHeightDp() {
        return screenHeightDp;
    }

    /**
     * 
     * @param screenHeightDp
     *     The screenHeightDp
     */
    @JsonProperty("screenHeightDp")
    public void setScreenHeightDp(String screenHeightDp) {
        this.screenHeightDp = screenHeightDp;
    }

    /**
     * 
     * @return
     *     The userSetLocale
     */
    @JsonProperty("userSetLocale")
    public Boolean getUserSetLocale() {
        return userSetLocale;
    }

    /**
     * 
     * @param userSetLocale
     *     The userSetLocale
     */
    @JsonProperty("userSetLocale")
    public void setUserSetLocale(Boolean userSetLocale) {
        this.userSetLocale = userSetLocale;
    }

    /**
     * 
     * @return
     *     The smallestScreenWidthDp
     */
    @JsonProperty("smallestScreenWidthDp")
    public String getSmallestScreenWidthDp() {
        return smallestScreenWidthDp;
    }

    /**
     * 
     * @param smallestScreenWidthDp
     *     The smallestScreenWidthDp
     */
    @JsonProperty("smallestScreenWidthDp")
    public void setSmallestScreenWidthDp(String smallestScreenWidthDp) {
        this.smallestScreenWidthDp = smallestScreenWidthDp;
    }

    /**
     * 
     * @return
     *     The navigation
     */
    @JsonProperty("navigation")
    public String getNavigation() {
        return navigation;
    }

    /**
     * 
     * @param navigation
     *     The navigation
     */
    @JsonProperty("navigation")
    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    /**
     * 
     * @return
     *     The seq
     */
    @JsonProperty("seq")
    public String getSeq() {
        return seq;
    }

    /**
     * 
     * @param seq
     *     The seq
     */
    @JsonProperty("seq")
    public void setSeq(String seq) {
        this.seq = seq;
    }

    /**
     * 
     * @return
     *     The keyboardHidden
     */
    @JsonProperty("keyboardHidden")
    public String getKeyboardHidden() {
        return keyboardHidden;
    }

    /**
     * 
     * @param keyboardHidden
     *     The keyboardHidden
     */
    @JsonProperty("keyboardHidden")
    public void setKeyboardHidden(String keyboardHidden) {
        this.keyboardHidden = keyboardHidden;
    }

    /**
     * 
     * @return
     *     The mnc
     */
    @JsonProperty("mnc")
    public String getMnc() {
        return mnc;
    }

    /**
     * 
     * @param mnc
     *     The mnc
     */
    @JsonProperty("mnc")
    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    /**
     * 
     * @return
     *     The touchscreen
     */
    @JsonProperty("touchscreen")
    public String getTouchscreen() {
        return touchscreen;
    }

    /**
     * 
     * @param touchscreen
     *     The touchscreen
     */
    @JsonProperty("touchscreen")
    public void setTouchscreen(String touchscreen) {
        this.touchscreen = touchscreen;
    }

    /**
     * 
     * @return
     *     The compatScreenWidthDp
     */
    @JsonProperty("compatScreenWidthDp")
    public String getCompatScreenWidthDp() {
        return compatScreenWidthDp;
    }

    /**
     * 
     * @param compatScreenWidthDp
     *     The compatScreenWidthDp
     */
    @JsonProperty("compatScreenWidthDp")
    public void setCompatScreenWidthDp(String compatScreenWidthDp) {
        this.compatScreenWidthDp = compatScreenWidthDp;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hardKeyboardHidden).append(orientation).append(screenLayout).append(keyboard).append(mcc).append(locale).append(densityDpi).append(compatSmallestScreenWidthDp).append(compatScreenHeightDp).append(fontScale).append(navigationHidden).append(screenWidthDp).append(uiMode).append(screenHeightDp).append(userSetLocale).append(smallestScreenWidthDp).append(navigation).append(seq).append(keyboardHidden).append(mnc).append(touchscreen).append(compatScreenWidthDp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CRASHCONFIGURATION) == false) {
            return false;
        }
        CRASHCONFIGURATION rhs = ((CRASHCONFIGURATION) other);
        return new EqualsBuilder().append(hardKeyboardHidden, rhs.hardKeyboardHidden).append(orientation, rhs.orientation).append(screenLayout, rhs.screenLayout).append(keyboard, rhs.keyboard).append(mcc, rhs.mcc).append(locale, rhs.locale).append(densityDpi, rhs.densityDpi).append(compatSmallestScreenWidthDp, rhs.compatSmallestScreenWidthDp).append(compatScreenHeightDp, rhs.compatScreenHeightDp).append(fontScale, rhs.fontScale).append(navigationHidden, rhs.navigationHidden).append(screenWidthDp, rhs.screenWidthDp).append(uiMode, rhs.uiMode).append(screenHeightDp, rhs.screenHeightDp).append(userSetLocale, rhs.userSetLocale).append(smallestScreenWidthDp, rhs.smallestScreenWidthDp).append(navigation, rhs.navigation).append(seq, rhs.seq).append(keyboardHidden, rhs.keyboardHidden).append(mnc, rhs.mnc).append(touchscreen, rhs.touchscreen).append(compatScreenWidthDp, rhs.compatScreenWidthDp).isEquals();
    }

}
