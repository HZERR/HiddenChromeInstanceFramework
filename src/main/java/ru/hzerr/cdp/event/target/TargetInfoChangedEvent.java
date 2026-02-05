package ru.hzerr.cdp.event.target;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.target.TargetInfo;

@Description("Issued when some information about a target has changed. This only happens between `targetCreated` and `targetDestroyed`.")
@Event("targetInfoChanged")
public class TargetInfoChangedEvent {

	@Required
	private TargetInfo targetInfo;

    public TargetInfoChangedEvent() {
    }

	public TargetInfo getTargetInfo() {
		return this.targetInfo;
	}
	public void setTargetInfo(TargetInfo targetInfo) {
		this.targetInfo = targetInfo;
	}
}
