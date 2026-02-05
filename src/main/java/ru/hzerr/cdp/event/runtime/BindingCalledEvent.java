package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Notification is issued every time when binding is called.")
@Event("bindingCalled")
public class BindingCalledEvent {

	@Required
	private String name;

	@Required
	private String payload;

	@Required
	@Description("Identifier of the context where the call was made.")
	@TypeDescription("Id of an execution context.")
	private int executionContextId;

    public BindingCalledEvent() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public int getExecutionContextId() {
		return this.executionContextId;
	}
	public void setExecutionContextId(int executionContextId) {
		this.executionContextId = executionContextId;
	}
}
