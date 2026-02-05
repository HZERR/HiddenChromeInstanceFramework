package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.DirectTCPSocketOptions;
import ru.hzerr.cdp.type.network.Initiator;

@Experimental
@Description("Fired upon direct_socket.TCPSocket creation.")
@Event("directTCPSocketCreated")
public class DirectTCPSocketCreatedEvent {

	@Required
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String identifier;

	@Required
	private String remoteAddr;

	@Required
	@Description("Unsigned int 16.")
	private int remotePort;

	@Required
	private DirectTCPSocketOptions options;

	@Required
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	private Initiator initiator;

    public DirectTCPSocketCreatedEvent() {
    }

	public String getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getRemoteAddr() {
		return this.remoteAddr;
	}
	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}
	public int getRemotePort() {
		return this.remotePort;
	}
	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}
	public DirectTCPSocketOptions getOptions() {
		return this.options;
	}
	public void setOptions(DirectTCPSocketOptions options) {
		this.options = options;
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
