package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when WebTransport handshake is finished.")
@Event("webTransportConnectionEstablished")
public class WebTransportConnectionEstablishedEvent {

	@Required
	@Description("WebTransport identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String transportId;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

    public WebTransportConnectionEstablishedEvent() {
    }

	public String getTransportId() {
		return this.transportId;
	}
	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
}
