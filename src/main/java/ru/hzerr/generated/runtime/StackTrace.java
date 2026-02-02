package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.annotation.Experimental;

@Description("Call frames for assertions or error messages.")
public class StackTrace {

	@Description("String label of this stack trace. For async traces this may be a name of the function that initiated the async call.")
	private String description;

	@Required
	@Description("JavaScript function name.")
	private List<CallFrame> callFrames;

	@Description("Asynchronous JavaScript stack trace that preceded this stack, if available.")
	private StackTrace parent;

	@Experimental
	@Description("Asynchronous JavaScript stack trace that preceded this stack, if available.")
	private StackTraceId parentId;

    public StackTrace() {
    }

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<CallFrame> getCallFrames() {
		return this.callFrames;
	}
	public void setCallFrames(List<CallFrame> callFrames) {
		this.callFrames = callFrames;
	}
	public StackTrace getParent() {
		return this.parent;
	}
	public void setParent(StackTrace parent) {
		this.parent = parent;
	}
	public StackTraceId getParentId() {
		return this.parentId;
	}
	public void setParentId(StackTraceId parentId) {
		this.parentId = parentId;
	}
}
