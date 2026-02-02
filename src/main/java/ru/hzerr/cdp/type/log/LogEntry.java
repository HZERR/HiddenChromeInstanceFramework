package ru.hzerr.cdp.type.log;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.runtime.StackTrace;
import java.util.List;
import ru.hzerr.cdp.type.runtime.RemoteObject;

@Description("Log entry.")
public class LogEntry {

	@Required
	@Description("Log entry source.")
	@Enum({"xml", "javascript", "network", "storage", "appcache", "rendering", "security", "deprecation", "worker", "violation", "intervention", "recommendation", "other"})
	private String source;

	@Required
	@Description("Log entry severity.")
	@Enum({"verbose", "info", "warning", "error"})
	private String level;

	@Required
	@Description("Logged text.")
	private String text;

	@Enum({"cors"})
	private String category;

	@Required
	@Description("Timestamp when this entry was added.")
	@TypeDescription("Number of milliseconds since epoch.")
	private Number timestamp;

	@Description("URL of the resource if known.")
	private String url;

	@Description("Line number in the resource.")
	private int lineNumber;

	@Description("JavaScript stack trace.")
	private StackTrace stackTrace;

	@Description("Identifier of the network request associated with this entry.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String networkRequestId;

	@Description("Identifier of the worker associated with this entry.")
	private String workerId;

	@Description("Call arguments.")
	private List<RemoteObject> args;

    public LogEntry() {
    }

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
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
	public StackTrace getStackTrace() {
		return this.stackTrace;
	}
	public void setStackTrace(StackTrace stackTrace) {
		this.stackTrace = stackTrace;
	}
	public String getNetworkRequestId() {
		return this.networkRequestId;
	}
	public void setNetworkRequestId(String networkRequestId) {
		this.networkRequestId = networkRequestId;
	}
	public String getWorkerId() {
		return this.workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	public List<RemoteObject> getArgs() {
		return this.args;
	}
	public void setArgs(List<RemoteObject> args) {
		this.args = args;
	}
}
