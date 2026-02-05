package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when HTTP request has finished loading.")
@Event("loadingFinished")
public class LoadingFinishedEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Required
	@Description("Total number of bytes received for this request.")
	private Number encodedDataLength;

    public LoadingFinishedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public Number getEncodedDataLength() {
		return this.encodedDataLength;
	}
	public void setEncodedDataLength(Number encodedDataLength) {
		this.encodedDataLength = encodedDataLength;
	}
}
