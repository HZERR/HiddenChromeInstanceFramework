package ru.hzerr.cdp.event.target;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.target.TargetInfo;

@Description("Issued when a possible inspection target is created.")
@Event("targetCreated")
public class TargetCreatedEvent {

	@Required
	private TargetInfo targetInfo;

    public TargetCreatedEvent() {
    }

	public TargetInfo getTargetInfo() {
		return this.targetInfo;
	}
	public void setTargetInfo(TargetInfo targetInfo) {
		this.targetInfo = targetInfo;
	}
}
