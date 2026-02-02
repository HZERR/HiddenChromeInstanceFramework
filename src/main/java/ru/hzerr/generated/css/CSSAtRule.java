package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import ru.hzerr.annotation.TypeDescription;

@Description("CSS generic @rule representation.")
public class CSSAtRule {

	@Required
	@Description("Type of at-rule.")
	@Enum({"font-face", "font-feature-values", "font-palette-values"})
	private String type;

	@Description("Subsection of font-feature-values, if this is a subsection.")
	@Enum({"swash", "annotation", "ornaments", "stylistic", "styleset", "character-variant"})
	private String subsection;

	@Description("LINT.ThenChange(//third_party/blink/renderer/core/inspector/inspector_style_sheet.cc:FontVariantAlternatesFeatureType,//third_party/blink/renderer/core/inspector/inspector_css_agent.cc:FontVariantAlternatesFeatureType) Associated name, if applicable.")
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

    public CSSAtRule() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubsection() {
		return this.subsection;
	}
	public void setSubsection(String subsection) {
		this.subsection = subsection;
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
}
