package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("CSS coverage information.")
public class RuleUsage {

	@Required
	@Description("The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet rules) this rule came from.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("Offset of the start of the rule (including selector) from the beginning of the stylesheet.")
	private Number startOffset;

	@Required
	@Description("Offset of the end of the rule body from the beginning of the stylesheet.")
	private Number endOffset;

	@Required
	@Description("Indicates whether the rule was actually used by some element in the page.")
	private boolean used;

    public RuleUsage() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public Number getStartOffset() {
		return this.startOffset;
	}
	public void setStartOffset(Number startOffset) {
		this.startOffset = startOffset;
	}
	public Number getEndOffset() {
		return this.endOffset;
	}
	public void setEndOffset(Number endOffset) {
		this.endOffset = endOffset;
	}
	public boolean getUsed() {
		return this.used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
}
