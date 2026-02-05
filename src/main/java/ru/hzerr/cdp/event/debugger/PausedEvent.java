package ru.hzerr.cdp.event.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.debugger.CallFrame;
import ru.hzerr.annotation.Enum;
import ru.hzerr.cdp.type.runtime.StackTrace;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.cdp.type.runtime.StackTraceId;

@Description("Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.")
@Event("paused")
public class PausedEvent {

	@Required
	@Description("Call stack the virtual machine stopped on.")
	private List<CallFrame> callFrames;

	@Required
	@Description("Pause reason.")
	@Enum({"ambiguous", "assert", "CSPViolation", "debugCommand", "DOM", "EventListener", "exception", "instrumentation", "OOM", "other", "promiseRejection", "XHR", "step"})
	private String reason;

	@Description("Object containing break-specific auxiliary properties.")
	private Object data;

	@Description("Hit breakpoints IDs")
	private String[] hitBreakpoints;

	@Description("Async stack trace, if any.")
	private StackTrace asyncStackTrace;

	@Experimental
	@Description("Async stack trace, if any.")
	private StackTraceId asyncStackTraceId;

	@Deprecated
	@Experimental
	@Description("Never present, will be removed.")
	private StackTraceId asyncCallStackTraceId;

    public PausedEvent() {
    }

	public List<CallFrame> getCallFrames() {
		return this.callFrames;
	}
	public void setCallFrames(List<CallFrame> callFrames) {
		this.callFrames = callFrames;
	}
	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Object getData() {
		return this.data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String[] getHitBreakpoints() {
		return this.hitBreakpoints;
	}
	public void setHitBreakpoints(String[] hitBreakpoints) {
		this.hitBreakpoints = hitBreakpoints;
	}
	public StackTrace getAsyncStackTrace() {
		return this.asyncStackTrace;
	}
	public void setAsyncStackTrace(StackTrace asyncStackTrace) {
		this.asyncStackTrace = asyncStackTrace;
	}
	public StackTraceId getAsyncStackTraceId() {
		return this.asyncStackTraceId;
	}
	public void setAsyncStackTraceId(StackTraceId asyncStackTraceId) {
		this.asyncStackTraceId = asyncStackTraceId;
	}
	public StackTraceId getAsyncCallStackTraceId() {
		return this.asyncCallStackTraceId;
	}
	public void setAsyncCallStackTraceId(StackTraceId asyncCallStackTraceId) {
		this.asyncCallStackTraceId = asyncCallStackTraceId;
	}
}
