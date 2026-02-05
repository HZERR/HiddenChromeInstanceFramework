package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.runtime.ExecutionContextDescription;

@Description("Issued when new execution context is created.")
@Event("executionContextCreated")
public class ExecutionContextCreatedEvent {

	@Required
	@Description("A newly created execution context.")
	private ExecutionContextDescription context;

    public ExecutionContextCreatedEvent() {
    }

	public ExecutionContextDescription getContext() {
		return this.context;
	}
	public void setContext(ExecutionContextDescription context) {
		this.context = context;
	}
}
