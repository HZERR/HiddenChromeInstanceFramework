package ru.hzerr.cdp.type.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;

@Description("Detailed information about exception (or error) that was thrown during script compilation or execution.")
public class ExceptionDetails {

	@Required
	@Description("Exception id.")
	private int exceptionId;

	@Required
	@Description("Exception text, which should be used together with exception object when available.")
	private String text;

	@Required
	@Description("Line number of the exception location (0-based).")
	private int lineNumber;

	@Required
	@Description("Column number of the exception location (0-based).")
	private int columnNumber;

	@Description("Script ID of the exception location.")
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Description("URL of the exception location, to be used when the script was not reported.")
	private String url;

	@Description("JavaScript stack trace if available.")
	private StackTrace stackTrace;

	@Description("Exception object if available.")
	private RemoteObject exception;

	@Description("Identifier of the context where exception happened.")
	@TypeDescription("Id of an execution context.")
	private int executionContextId;

	@Experimental
	@Description("Dictionary with entries of meta data that the client associated with this exception, such as information about associated network requests, etc.")
	private Object exceptionMetaData;

    public ExceptionDetails() {
    }

	public int getExceptionId() {
		return this.exceptionId;
	}
	public void setExceptionId(int exceptionId) {
		this.exceptionId = exceptionId;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
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
	public StackTrace getStackTrace() {
		return this.stackTrace;
	}
	public void setStackTrace(StackTrace stackTrace) {
		this.stackTrace = stackTrace;
	}
	public RemoteObject getException() {
		return this.exception;
	}
	public void setException(RemoteObject exception) {
		this.exception = exception;
	}
	public int getExecutionContextId() {
		return this.executionContextId;
	}
	public void setExecutionContextId(int executionContextId) {
		this.executionContextId = executionContextId;
	}
	public Object getExceptionMetaData() {
		return this.exceptionMetaData;
	}
	public void setExceptionMetaData(Object exceptionMetaData) {
		this.exceptionMetaData = exceptionMetaData;
	}
}
