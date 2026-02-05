package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.DirectUDPMessage;

@Experimental
@Description("Fired when message is sent to udp direct socket stream.")
@Event("directUDPSocketChunkSent")
public class DirectUDPSocketChunkSentEvent {

	@Required
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String identifier;

	@Required
	private DirectUDPMessage message;

	@Required
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

    public DirectUDPSocketChunkSentEvent() {
    }

	public String getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public DirectUDPMessage getMessage() {
		return this.message;
	}
	public void setMessage(DirectUDPMessage message) {
		this.message = message;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
}
