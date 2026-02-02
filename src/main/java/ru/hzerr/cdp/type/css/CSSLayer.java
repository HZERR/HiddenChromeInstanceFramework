package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("CSS Layer at-rule descriptor.")
public class CSSLayer {

	@Required
	@Description("Layer name.")
	private String text;

	@Description("The associated rule header range in the enclosing stylesheet (if available).")
	private SourceRange range;

	@Description("Identifier of the stylesheet containing this object (if exists).")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

    public CSSLayer() {
    }

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
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
