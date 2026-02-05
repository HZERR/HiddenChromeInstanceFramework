package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.WebSocketRequest;

@Description("Fired when WebSocket is about to initiate handshake.")
@Event("webSocketWillSendHandshakeRequest")
public class WebSocketWillSendHandshakeRequestEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Required
	@Description("UTC Timestamp.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number wallTime;

	@Required
	@Description("WebSocket request data.")
	private WebSocketRequest request;

    public WebSocketWillSendHandshakeRequestEvent() {
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
	public Number getWallTime() {
		return this.wallTime;
	}
	public void setWallTime(Number wallTime) {
		this.wallTime = wallTime;
	}
	public WebSocketRequest getRequest() {
		return this.request;
	}
	public void setRequest(WebSocketRequest request) {
		this.request = request;
	}
}
