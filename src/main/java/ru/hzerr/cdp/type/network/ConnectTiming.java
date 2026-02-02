package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class ConnectTiming {

	@Required
	@Description("Timing's requestTime is a baseline in seconds, while the other numbers are ticks in milliseconds relatively to this requestTime. Matches ResourceTiming's requestTime for the same request (but not for redirected requests).")
	private Number requestTime;

    public ConnectTiming() {
    }

	public Number getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Number requestTime) {
		this.requestTime = requestTime;
	}
}
