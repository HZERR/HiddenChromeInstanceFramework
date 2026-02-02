package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Font families collection for a script.")
public class ScriptFontFamilies {

	@Required
	@Description("Name of the script which these font families are defined for.")
	private String script;

	@Required
	@Description("Generic font families collection for the script.")
	private FontFamilies fontFamilies;

    public ScriptFontFamilies() {
    }

	public String getScript() {
		return this.script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public FontFamilies getFontFamilies() {
		return this.fontFamilies;
	}
	public void setFontFamilies(FontFamilies fontFamilies) {
		this.fontFamilies = fontFamilies;
	}
}
