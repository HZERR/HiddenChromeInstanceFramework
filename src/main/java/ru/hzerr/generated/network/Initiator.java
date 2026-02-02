package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import ru.hzerr.generated.runtime.StackTrace;
import ru.hzerr.annotation.TypeDescription;

@Description("Information about the request initiator.")
public class Initiator {

	@Required
	@Description("Type of this initiator.")
	@Enum({"parser", "script", "preload", "SignedExchange", "preflight", "FedCM", "other"})
	private String type;

	@Description("Initiator JavaScript stack trace, set for Script only. Requires the Debugger domain to be enabled.")
	private StackTrace stack;

	@Description("Initiator URL, set for Parser type or for Script type (when script is importing module) or for SignedExchange type.")
	private String url;

	@Description("Initiator line number, set for Parser type or for Script type (when script is importing module) (0-based).")
	private Number lineNumber;

	@Description("Initiator column number, set for Parser type or for Script type (when script is importing module) (0-based).")
	private Number columnNumber;

	@Description("Set if another request triggered this request (e.g. preflight).")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

    public Initiator() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public StackTrace getStack() {
		return this.stack;
	}
	public void setStack(StackTrace stack) {
		this.stack = stack;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Number getLineNumber() {
		return this.lineNumber;
	}
	public void setLineNumber(Number lineNumber) {
		this.lineNumber = lineNumber;
	}
	public Number getColumnNumber() {
		return this.columnNumber;
	}
	public void setColumnNumber(Number columnNumber) {
		this.columnNumber = columnNumber;
	}
	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
