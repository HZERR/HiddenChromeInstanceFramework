package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;

@Description("Issued when execution context is destroyed.")
@Event("executionContextDestroyed")
public class ExecutionContextDestroyedEvent {

	@Deprecated
	@Required
	@Description("Id of the destroyed context")
	@TypeDescription("Id of an execution context.")
	private int executionContextId;

	@Experimental
	@Required
	@Description("Unique Id of the destroyed context")
	private String executionContextUniqueId;

    public ExecutionContextDestroyedEvent() {
    }

	public int getExecutionContextId() {
		return this.executionContextId;
	}
	public void setExecutionContextId(int executionContextId) {
		this.executionContextId = executionContextId;
	}
	public String getExecutionContextUniqueId() {
		return this.executionContextUniqueId;
	}
	public void setExecutionContextUniqueId(String executionContextUniqueId) {
		this.executionContextUniqueId = executionContextUniqueId;
	}
}
