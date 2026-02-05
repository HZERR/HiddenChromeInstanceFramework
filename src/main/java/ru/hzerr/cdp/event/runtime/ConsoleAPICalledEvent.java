package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import java.util.List;
import ru.hzerr.cdp.type.runtime.RemoteObject;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.runtime.StackTrace;
import ru.hzerr.annotation.Experimental;

@Description("Issued when console API was called.")
@Event("consoleAPICalled")
public class ConsoleAPICalledEvent {

	@Required
	@Description("Type of the call.")
	@Enum({"log", "debug", "info", "error", "warning", "dir", "dirxml", "table", "trace", "clear", "startGroup", "startGroupCollapsed", "endGroup", "assert", "profile", "profileEnd", "count", "timeEnd"})
	private String type;

	@Required
	@Description("Call arguments.")
	private List<RemoteObject> args;

	@Required
	@Description("Identifier of the context where the call was made.")
	@TypeDescription("Id of an execution context.")
	private int executionContextId;

	@Required
	@Description("Call timestamp.")
	@TypeDescription("Number of milliseconds since epoch.")
	private Number timestamp;

	@Description("Stack trace captured when the call was made. The async stack chain is automatically reported for the following call types: `assert`, `error`, `trace`, `warning`. For other types the async call chain can be retrieved using `Debugger.getStackTrace` and `stackTrace.parentId` field.")
	private StackTrace stackTrace;

	@Experimental
	@Description("Console context descriptor for calls on non-default console context (not console.*): 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call on named context.")
	private String context;

    public ConsoleAPICalledEvent() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<RemoteObject> getArgs() {
		return this.args;
	}
	public void setArgs(List<RemoteObject> args) {
		this.args = args;
	}
	public int getExecutionContextId() {
		return this.executionContextId;
	}
	public void setExecutionContextId(int executionContextId) {
		this.executionContextId = executionContextId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public StackTrace getStackTrace() {
		return this.stackTrace;
	}
	public void setStackTrace(StackTrace stackTrace) {
		this.stackTrace = stackTrace;
	}
	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}
}
