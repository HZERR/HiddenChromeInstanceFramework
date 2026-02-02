package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Information about amount of glyphs that were rendered with given font.")
public class PlatformFontUsage {

	@Required
	@Description("Font's family name reported by platform.")
	private String familyName;

	@Required
	@Description("Font's PostScript name reported by platform.")
	private String postScriptName;

	@Required
	@Description("Indicates if the font was downloaded or resolved locally.")
	private boolean isCustomFont;

	@Required
	@Description("Amount of glyphs that were rendered with this font.")
	private Number glyphCount;

    public PlatformFontUsage() {
    }

	public String getFamilyName() {
		return this.familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getPostScriptName() {
		return this.postScriptName;
	}
	public void setPostScriptName(String postScriptName) {
		this.postScriptName = postScriptName;
	}
	public boolean getIsCustomFont() {
		return this.isCustomFont;
	}
	public void setIsCustomFont(boolean isCustomFont) {
		this.isCustomFont = isCustomFont;
	}
	public Number getGlyphCount() {
		return this.glyphCount;
	}
	public void setGlyphCount(Number glyphCount) {
		this.glyphCount = glyphCount;
	}
}
