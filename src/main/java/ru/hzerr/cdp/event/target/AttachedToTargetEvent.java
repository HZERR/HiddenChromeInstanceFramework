package ru.hzerr.cdp.event.target;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.target.TargetInfo;

@Experimental
@Description("Issued when attached to target because of auto-attach or `attachToTarget` command.")
@Event("attachedToTarget")
public class AttachedToTargetEvent {

	@Required
	@Description("Identifier assigned to the session used to send/receive messages.")
	@TypeDescription("Unique identifier of attached debugging session.")
	private String sessionId;

	@Required
	private TargetInfo targetInfo;

	@Required
	private boolean waitingForDebugger;

    public AttachedToTargetEvent() {
    }

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public TargetInfo getTargetInfo() {
		return this.targetInfo;
	}
	public void setTargetInfo(TargetInfo targetInfo) {
		this.targetInfo = targetInfo;
	}
	public boolean getWaitingForDebugger() {
		return this.waitingForDebugger;
	}
	public void setWaitingForDebugger(boolean waitingForDebugger) {
		this.waitingForDebugger = waitingForDebugger;
	}
}
