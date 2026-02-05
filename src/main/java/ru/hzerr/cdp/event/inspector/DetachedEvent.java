package ru.hzerr.cdp.event.inspector;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Fired when remote debugging connection is about to be terminated. Contains detach reason.")
@Event("detached")
public class DetachedEvent {

	@Required
	@Description("The reason why connection has been terminated.")
	private String reason;

    public DetachedEvent() {
    }

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
