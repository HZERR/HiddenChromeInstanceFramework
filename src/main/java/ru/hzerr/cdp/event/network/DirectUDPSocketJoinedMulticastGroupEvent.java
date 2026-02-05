package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Event("directUDPSocketJoinedMulticastGroup")
public class DirectUDPSocketJoinedMulticastGroupEvent {

	@Required
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String identifier;

	@Required
	private String IPAddress;

    public DirectUDPSocketJoinedMulticastGroupEvent() {
    }

	public String getIdentifier() {
		return this.identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getIPAddress() {
		return this.IPAddress;
	}
	public void setIPAddress(String IPAddress) {
		this.IPAddress = IPAddress;
	}
}
