package ru.hzerr.cdp.event.fetch;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Request;
import java.util.List;
import ru.hzerr.cdp.type.fetch.HeaderEntry;
import ru.hzerr.annotation.Experimental;

@Description("Issued when the domain is enabled and the request URL matches the specified filter. The request is paused until the client responds with one of continueRequest, failRequest or fulfillRequest. The stage of the request can be determined by presence of responseErrorReason and responseStatusCode -- the request is at the response stage if either of these fields is present and in the request stage otherwise. Redirect responses and subsequent requests are reported similarly to regular responses and requests. Redirect responses may be distinguished by the value of `responseStatusCode` (which is one of 301, 302, 303, 307, 308) along with presence of the `location` header. Requests resulting from a redirect will have `redirectedRequestId` field set.")
@Event("requestPaused")
public class RequestPausedEvent {

	@Required
	@Description("Each request the page makes will have a unique id.")
	@TypeDescription("Unique request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("The details of the request.")
	private Request request;

	@Required
	@Description("The id of the frame that initiated the request.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("How the requested resource will be used.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String resourceType;

	@Description("Response error if intercepted at response stage.")
	@TypeDescription("Network level fetch failure reason.")
	private String responseErrorReason;

	@Description("Response code if intercepted at response stage.")
	private int responseStatusCode;

	@Description("Response status text if intercepted at response stage.")
	private String responseStatusText;

	@Description("Response headers if intercepted at the response stage.")
	private List<HeaderEntry> responseHeaders;

	@Description("If the intercepted request had a corresponding Network.requestWillBeSent event fired for it, then this networkId will be the same as the requestId present in the requestWillBeSent event.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String networkId;

	@Experimental
	@Description("If the request is due to a redirect response from the server, the id of the request that has caused the redirect.")
	@TypeDescription("Unique request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String redirectedRequestId;

    public RequestPausedEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Request getRequest() {
		return this.request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResponseErrorReason() {
		return this.responseErrorReason;
	}
	public void setResponseErrorReason(String responseErrorReason) {
		this.responseErrorReason = responseErrorReason;
	}
	public int getResponseStatusCode() {
		return this.responseStatusCode;
	}
	public void setResponseStatusCode(int responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}
	public String getResponseStatusText() {
		return this.responseStatusText;
	}
	public void setResponseStatusText(String responseStatusText) {
		this.responseStatusText = responseStatusText;
	}
	public List<HeaderEntry> getResponseHeaders() {
		return this.responseHeaders;
	}
	public void setResponseHeaders(List<HeaderEntry> responseHeaders) {
		this.responseHeaders = responseHeaders;
	}
	public String getNetworkId() {
		return this.networkId;
	}
	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}
	public String getRedirectedRequestId() {
		return this.redirectedRequestId;
	}
	public void setRedirectedRequestId(String redirectedRequestId) {
		this.redirectedRequestId = redirectedRequestId;
	}
}
