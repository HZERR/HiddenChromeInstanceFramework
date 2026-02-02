package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("A descriptor of operation to mutate style declaration text.")
public class StyleDeclarationEdit {

	@Required
	@Description("The css style sheet identifier.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("The range of the style text in the enclosing stylesheet.")
	private SourceRange range;

	@Required
	@Description("New style text.")
	private String text;

    public StyleDeclarationEdit() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public SourceRange getRange() {
		return this.range;
	}
	public void setRange(SourceRange range) {
		this.range = range;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
