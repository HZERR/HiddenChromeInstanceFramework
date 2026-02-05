package ru.hzerr.cdp.event.target;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Notifies about a new protocol message received from the session (as reported in `attachedToTarget` event).")
@Event("receivedMessageFromTarget")
public class ReceivedMessageFromTargetEvent {

	@Required
	@Description("Identifier of a session which sends a message.")
	@TypeDescription("Unique identifier of attached debugging session.")
	private String sessionId;

	@Required
	private String message;

	@Deprecated
	@Description("Deprecated.")
	private String targetId;

    public ReceivedMessageFromTargetEvent() {
    }

	public String getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
}
