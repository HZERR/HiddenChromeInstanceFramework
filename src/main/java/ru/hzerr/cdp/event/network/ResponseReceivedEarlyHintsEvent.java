package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Headers;

@Experimental
@Description("Fired when 103 Early Hints headers is received in addition to the common response. Not every responseReceived event will have an responseReceivedEarlyHints fired. Only one responseReceivedEarlyHints may be fired for eached responseReceived event.")
@Event("responseReceivedEarlyHints")
public class ResponseReceivedEarlyHintsEvent {

	@Required
	@Description("Request identifier. Used to match this information to another responseReceived event.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Raw response headers as they were received over the wire. Duplicate headers in the response are represented as a single key with their values concatentated using `\n` as the separator. See also `headersText` that contains verbatim text for HTTP/1.*.")
	private Headers headers;

    public ResponseReceivedEarlyHintsEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
}
