package ru.hzerr.cdp.event.tethering;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Informs that port was successfully bound and got a specified connection id.")
@Event("accepted")
public class AcceptedEvent {

	@Required
	@Description("Port number that was successfully bound.")
	private int port;

	@Required
	@Description("Connection id to be used.")
	private String connectionId;

    public AcceptedEvent() {
    }

	public int getPort() {
		return this.port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getConnectionId() {
		return this.connectionId;
	}
	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}
}
