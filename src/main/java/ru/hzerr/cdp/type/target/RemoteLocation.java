package ru.hzerr.cdp.type.target;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class RemoteLocation {

	@Required
	private String host;

	@Required
	private int port;

    public RemoteLocation() {
    }

	public String getHost() {
		return this.host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return this.port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
