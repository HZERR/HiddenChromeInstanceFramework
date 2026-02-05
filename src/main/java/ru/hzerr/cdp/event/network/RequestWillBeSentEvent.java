package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Request;
import ru.hzerr.cdp.type.network.Initiator;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.cdp.type.network.Response;

@Description("Fired when page is about to send HTTP request.")
@Event("requestWillBeSent")
public class RequestWillBeSentEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("Loader identifier. Empty string if the request is fetched from worker.")
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	@Description("URL of the document this request is loaded for.")
	private String documentURL;

	@Required
	@Description("Request data.")
	private Request request;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

	@Required
	@Description("Timestamp.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number wallTime;

	@Required
	@Description("Request initiator.")
	private Initiator initiator;

	@Experimental
	@Required
	@Description("In the case that redirectResponse is populated, this flag indicates whether requestWillBeSentExtraInfo and responseReceivedExtraInfo events will be or were emitted for the request which was just redirected.")
	private boolean redirectHasExtraInfo;

	@Description("Redirect response data.")
	private Response redirectResponse;

	@Description("Type of this resource.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String type;

	@Description("Frame identifier.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Description("Whether the request is initiated by a user gesture. Defaults to false.")
	private boolean hasUserGesture;

    public RequestWillBeSentEvent() {
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
	public String getDocumentURL() {
		return this.documentURL;
	}
	public void setDocumentURL(String documentURL) {
		this.documentURL = documentURL;
	}
	public Request getRequest() {
		return this.request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public Number getWallTime() {
		return this.wallTime;
	}
	public void setWallTime(Number wallTime) {
		this.wallTime = wallTime;
	}
	public Initiator getInitiator() {
		return this.initiator;
	}
	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}
	public boolean getRedirectHasExtraInfo() {
		return this.redirectHasExtraInfo;
	}
	public void setRedirectHasExtraInfo(boolean redirectHasExtraInfo) {
		this.redirectHasExtraInfo = redirectHasExtraInfo;
	}
	public Response getRedirectResponse() {
		return this.redirectResponse;
	}
	public void setRedirectResponse(Response redirectResponse) {
		this.redirectResponse = redirectResponse;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public boolean getHasUserGesture() {
		return this.hasUserGesture;
	}
	public void setHasUserGesture(boolean hasUserGesture) {
		this.hasUserGesture = hasUserGesture;
	}
}
