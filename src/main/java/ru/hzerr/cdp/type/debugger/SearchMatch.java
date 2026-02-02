package ru.hzerr.cdp.type.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Search match for resource.")
public class SearchMatch {

	@Required
	@Description("Line number in resource content.")
	private Number lineNumber;

	@Required
	@Description("Line with match content.")
	private String lineContent;

    public SearchMatch() {
    }

	public Number getLineNumber() {
		return this.lineNumber;
	}
	public void setLineNumber(Number lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getLineContent() {
		return this.lineContent;
	}
	public void setLineContent(String lineContent) {
		this.lineContent = lineContent;
	}
}
