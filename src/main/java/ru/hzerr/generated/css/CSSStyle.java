package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("CSS style representation.")
public class CSSStyle {

	@Description("The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet rules) this rule came from.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("CSS properties in the style.")
	private List<CSSProperty> cssProperties;

	@Required
	@Description("Computed values for all shorthands found in the style.")
	private List<ShorthandEntry> shorthandEntries;

	@Description("Style declaration text (if available).")
	private String cssText;

	@Description("Style declaration range in the enclosing stylesheet (if available).")
	private SourceRange range;

    public CSSStyle() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public List<CSSProperty> getCssProperties() {
		return this.cssProperties;
	}
	public void setCssProperties(List<CSSProperty> cssProperties) {
		this.cssProperties = cssProperties;
	}
	public List<ShorthandEntry> getShorthandEntries() {
		return this.shorthandEntries;
	}
	public void setShorthandEntries(List<ShorthandEntry> shorthandEntries) {
		this.shorthandEntries = shorthandEntries;
	}
	public String getCssText() {
		return this.cssText;
	}
	public void setCssText(String cssText) {
		this.cssText = cssText;
	}
	public SourceRange getRange() {
		return this.range;
	}
	public void setRange(SourceRange range) {
		this.range = range;
	}
}
