package ru.hzerr.cdp.event.target;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Issued when detached from target for any reason (including `detachFromTarget` command). Can be issued multiple times per target if multiple sessions have been attached to it.")
@Event("detachedFromTarget")
public class DetachedFromTargetEvent {

	@Required
	@Description("Detached session identifier.")
	@TypeDescription("Unique identifier of attached debugging session.")
	private String sessionId;

	@Deprecated
	@Description("Deprecated.")
	private String targetId;

    public DetachedFromTargetEvent() {
    }

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
}
