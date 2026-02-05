package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Response;
import ru.hzerr.annotation.Experimental;

@Description("Fired when HTTP response is available.")
@Event("responseReceived")
public class ResponseReceivedEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Loader identifier. Empty string if the request is fetched from worker.")
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Required
	@Description("Resource type.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String type;

	@Required
	@Description("Response data.")
	private Response response;

	@Experimental
	@Required
	@Description("Indicates whether requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be or were emitted for this request.")
	private boolean hasExtraInfo;

	@Description("Frame identifier.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

    public ResponseReceivedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Response getResponse() {
		return this.response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public boolean getHasExtraInfo() {
		return this.hasExtraInfo;
	}
	public void setHasExtraInfo(boolean hasExtraInfo) {
		this.hasExtraInfo = hasExtraInfo;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
}
