package ru.hzerr.cdp.event.target;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Issued when a target is destroyed.")
@Event("targetDestroyed")
public class TargetDestroyedEvent {

	@Required
	private String targetId;

    public TargetDestroyedEvent() {
    }

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
}
