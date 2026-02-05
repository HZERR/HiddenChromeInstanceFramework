package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when EventSource message is received.")
@Event("eventSourceMessageReceived")
public class EventSourceMessageReceivedEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Required
	@Description("Message type.")
	private String eventName;

	@Required
	@Description("Message identifier.")
	private String eventId;

	@Required
	@Description("Message content.")
	private String data;

    public EventSourceMessageReceivedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public String getEventName() {
		return this.eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
