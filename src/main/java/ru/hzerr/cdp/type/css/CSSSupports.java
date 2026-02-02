package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("CSS Supports at-rule descriptor.")
public class CSSSupports {

	@Required
	@Description("Supports rule text.")
	private String text;

	@Required
	@Description("Whether the supports condition is satisfied.")
	private boolean active;

	@Description("The associated rule header range in the enclosing stylesheet (if available).")
	private SourceRange range;

	@Description("Identifier of the stylesheet containing this object (if exists).")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

    public CSSSupports() {
    }

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean getActive() {
		return this.active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
