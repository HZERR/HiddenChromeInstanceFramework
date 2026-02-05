package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired when direct_socket.UDPSocket connection is opened.")
@Event("directUDPSocketOpened")
public class DirectUDPSocketOpenedEvent {

	@Required
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String identifier;

	@Required
	private String localAddr;

	@Required
	@Description("Expected to be unsigned integer.")
	private int localPort;

	@Required
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	private String remoteAddr;

	@Description("Expected to be unsigned integer.")
	private int remotePort;

    public DirectUDPSocketOpenedEvent() {
    }

	public String getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getLocalAddr() {
		return this.localAddr;
	}
	public void setLocalAddr(String localAddr) {
		this.localAddr = localAddr;
	}
	public int getLocalPort() {
		return this.localPort;
	}
	public void setLocalPort(int localPort) {
		this.localPort = localPort;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
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
}
