package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Required;

@Description("CSS keyframe rule representation.")
public class CSSKeyframeRule {

	@Description("The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet rules) this rule came from.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("Parent stylesheet's origin.")
	@TypeDescription("Stylesheet type: \"injected\" for stylesheets injected via extension, \"user-agent\" for user-agent stylesheets, \"inspector\" for stylesheets created by the inspector (i.e. those holding the \"via inspector\" rules), \"regular\" for regular stylesheets.")
	private String origin;

	@Required
	@Description("Associated key text.")
	private Value keyText;

	@Required
	@Description("Associated style declaration.")
	private CSSStyle style;

    public CSSKeyframeRule() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Value getKeyText() {
		return this.keyText;
	}
	public void setKeyText(Value keyText) {
		this.keyText = keyText;
	}
	public CSSStyle getStyle() {
		return this.style;
	}
	public void setStyle(CSSStyle style) {
		this.style = style;
	}
}
