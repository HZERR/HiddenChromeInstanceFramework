package ru.hzerr.generated.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("CSS Starting Style at-rule descriptor.")
public class CSSStartingStyle {

	@Description("The associated rule header range in the enclosing stylesheet (if available).")
	private SourceRange range;

	@Description("Identifier of the stylesheet containing this object (if exists).")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

    public CSSStartingStyle() {
    }

	public SourceRange getRange() {
		return this.range;
	}
	public void setRange(SourceRange range) {
		this.range = range;
	}
	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
}
