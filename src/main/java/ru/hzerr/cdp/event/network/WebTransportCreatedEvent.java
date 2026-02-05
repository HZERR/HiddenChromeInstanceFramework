package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Initiator;

@Description("Fired upon WebTransport creation.")
@Event("webTransportCreated")
public class WebTransportCreatedEvent {

	@Required
	@Description("WebTransport identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String transportId;

	@Required
	@Description("WebTransport request URL.")
	private String url;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Description("Request initiator.")
	private Initiator initiator;

    public WebTransportCreatedEvent() {
    }

	public String getTransportId() {
		return this.transportId;
	}
	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public Initiator getInitiator() {
		return this.initiator;
	}
	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}
}
