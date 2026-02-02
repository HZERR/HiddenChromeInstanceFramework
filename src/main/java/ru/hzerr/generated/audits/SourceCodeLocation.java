package ru.hzerr.generated.audits;

import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Required;

public class SourceCodeLocation {

	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	private String url;

	@Required
	private int lineNumber;

	@Required
	private int columnNumber;

    public SourceCodeLocation() {
    }

	public String getScriptId() {
		return this.scriptId;
	}
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getLineNumber() {
		return this.lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public int getColumnNumber() {
		return this.columnNumber;
	}
	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}
}
