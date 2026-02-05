package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.runtime.RemoteObject;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeDescription;

@Description("Issued when object should be inspected (for example, as a result of inspect() command line API call).")
@Event("inspectRequested")
public class InspectRequestedEvent {

	@Required
	private RemoteObject object;

	@Required
	private Object hints;

	@Experimental
	@Description("Identifier of the context where the call was made.")
	@TypeDescription("Id of an execution context.")
	private int executionContextId;

    public InspectRequestedEvent() {
    }

	public RemoteObject getObject() {
		return this.object;
	}
	public void setObject(RemoteObject object) {
		this.object = object;
	}
	public Object getHints() {
		return this.hints;
	}
	public void setHints(Object hints) {
		this.hints = hints;
	}
	public int getExecutionContextId() {
		return this.executionContextId;
	}
	public void setExecutionContextId(int executionContextId) {
		this.executionContextId = executionContextId;
	}
}
