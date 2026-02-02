package ru.hzerr.cdp.type.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Stack entry for runtime errors and assertions.")
public class CallFrame {

	@Required
	@Description("JavaScript function name.")
	private String functionName;

	@Required
	@Description("JavaScript script id.")
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	@Description("JavaScript script name or url.")
	private String url;

	@Required
	@Description("JavaScript script line number (0-based).")
	private int lineNumber;

	@Required
	@Description("JavaScript script column number (0-based).")
	private int columnNumber;

    public CallFrame() {
    }

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
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
