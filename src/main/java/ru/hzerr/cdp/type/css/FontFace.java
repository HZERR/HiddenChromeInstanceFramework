package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Properties of a web font: https://www.w3.org/TR/2008/REC-CSS2-20080411/fonts.html#font-descriptions and additional information such as platformFontFamily and fontVariationAxes.")
public class FontFace {

	@Required
	@Description("The font-family.")
	private String fontFamily;

	@Required
	@Description("The font-style.")
	private String fontStyle;

	@Required
	@Description("The font-variant.")
	private String fontVariant;

	@Required
	@Description("The font-weight.")
	private String fontWeight;

	@Required
	@Description("The font-stretch.")
	private String fontStretch;

	@Required
	@Description("The font-display.")
	private String fontDisplay;

	@Required
	@Description("The unicode-range.")
	private String unicodeRange;

	@Required
	@Description("The src.")
	private String src;

	@Required
	@Description("The resolved platform font family")
	private String platformFontFamily;

	@Description("Available variation settings (a.k.a. \"axes\").")
	private List<FontVariationAxis> fontVariationAxes;

    public FontFace() {
    }

	public String getFontFamily() {
		return this.fontFamily;
	}
	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}
	public String getFontStyle() {
		return this.fontStyle;
	}
	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}
	public String getFontVariant() {
		return this.fontVariant;
	}
	public void setFontVariant(String fontVariant) {
		this.fontVariant = fontVariant;
	}
	public String getFontWeight() {
		return this.fontWeight;
	}
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}
	public String getFontStretch() {
		return this.fontStretch;
	}
	public void setFontStretch(String fontStretch) {
		this.fontStretch = fontStretch;
	}
	public String getFontDisplay() {
		return this.fontDisplay;
	}
	public void setFontDisplay(String fontDisplay) {
		this.fontDisplay = fontDisplay;
	}
	public String getUnicodeRange() {
		return this.unicodeRange;
	}
	public void setUnicodeRange(String unicodeRange) {
		this.unicodeRange = unicodeRange;
	}
	public String getSrc() {
		return this.src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getPlatformFontFamily() {
		return this.platformFontFamily;
	}
	public void setPlatformFontFamily(String platformFontFamily) {
		this.platformFontFamily = platformFontFamily;
	}
	public List<FontVariationAxis> getFontVariationAxes() {
		return this.fontVariationAxes;
	}
	public void setFontVariationAxes(List<FontVariationAxis> fontVariationAxes) {
		this.fontVariationAxes = fontVariationAxes;
	}
}
