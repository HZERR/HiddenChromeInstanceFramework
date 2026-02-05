package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.SignedExchangeInfo;

@Experimental
@Description("Fired when a signed exchange was received over the network")
@Event("signedExchangeReceived")
public class SignedExchangeReceivedEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Information about the signed exchange response.")
	private SignedExchangeInfo info;

    public SignedExchangeReceivedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public SignedExchangeInfo getInfo() {
		return this.info;
	}
	public void setInfo(SignedExchangeInfo info) {
		this.info = info;
	}
}
