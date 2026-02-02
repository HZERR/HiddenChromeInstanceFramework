package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class LaunchHandler {

	@Required
	private String clientMode;

    public LaunchHandler() {
    }

	public String getClientMode() {
		return this.clientMode;
	}
	public void setClientMode(String clientMode) {
		this.clientMode = clientMode;
	}
}
