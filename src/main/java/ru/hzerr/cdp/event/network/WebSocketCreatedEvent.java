package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Initiator;

@Description("Fired upon WebSocket creation.")
@Event("webSocketCreated")
public class WebSocketCreatedEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("WebSocket request URL.")
	private String url;

	@Description("Request initiator.")
	private Initiator initiator;

    public WebSocketCreatedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Initiator getInitiator() {
		return this.initiator;
	}
	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}
}
