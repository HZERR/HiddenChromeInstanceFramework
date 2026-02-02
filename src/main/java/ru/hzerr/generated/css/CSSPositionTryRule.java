package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("CSS @position-try rule representation.")
public class CSSPositionTryRule {

	@Required
	@Description("The prelude dashed-ident name")
	private Value name;

	@Description("The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet rules) this rule came from.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("Parent stylesheet's origin.")
	@TypeDescription("Stylesheet type: \"injected\" for stylesheets injected via extension, \"user-agent\" for user-agent stylesheets, \"inspector\" for stylesheets created by the inspector (i.e. those holding the \"via inspector\" rules), \"regular\" for regular stylesheets.")
	private String origin;

	@Required
	@Description("Associated style declaration.")
	private CSSStyle style;

	@Required
	private boolean active;

    public CSSPositionTryRule() {
    }

	public Value getName() {
		return this.name;
	}
	public void setName(Value name) {
		this.name = name;
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
	public CSSStyle getStyle() {
		return this.style;
	}
	public void setStyle(CSSStyle style) {
		this.style = style;
	}
	public boolean getActive() {
		return this.active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
