package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Request;
import ru.hzerr.cdp.type.network.AuthChallenge;
import ru.hzerr.cdp.type.network.Headers;

@Deprecated
@Experimental
@Description("Details of an intercepted HTTP request, which must be either allowed, blocked, modified or mocked. Deprecated, use Fetch.requestPaused instead.")
@Event("requestIntercepted")
public class RequestInterceptedEvent {

	@Required
	@Description("Each request the page makes will have a unique id, however if any redirects are encountered while processing that fetch, they will be reported with the same id as the original fetch. Likewise if HTTP authentication is needed then the same fetch id will be used.")
	@TypeDescription("Unique intercepted request identifier.")
	private String interceptionId;

	@Required
	private Request request;

	@Required
	@Description("The id of the frame that initiated the request.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("How the requested resource will be used.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String resourceType;

	@Required
	@Description("Whether this is a navigation request, which can abort the navigation completely.")
	private boolean isNavigationRequest;

	@Description("Set if the request is a navigation that will result in a download. Only present after response is received from the server (i.e. HeadersReceived stage).")
	private boolean isDownload;

	@Description("Redirect location, only sent if a redirect was intercepted.")
	private String redirectUrl;

	@Description("Details of the Authorization Challenge encountered. If this is set then continueInterceptedRequest must contain an authChallengeResponse.")
	private AuthChallenge authChallenge;

	@Description("Response error if intercepted at response stage or if redirect occurred while intercepting request.")
	@TypeDescription("Network level fetch failure reason.")
	private String responseErrorReason;

	@Description("Response code if intercepted at response stage or if redirect occurred while intercepting request or auth retry occurred.")
	private int responseStatusCode;

	@Description("Response headers if intercepted at the response stage or if redirect occurred while intercepting request or auth retry occurred.")
	private Headers responseHeaders;

	@Description("If the intercepted request had a corresponding requestWillBeSent event fired for it, then this requestId will be the same as the requestId present in the requestWillBeSent event.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

    public RequestInterceptedEvent() {
    }

	public String getInterceptionId() {
		return this.interceptionId;
	}
	public void setInterceptionId(String interceptionId) {
		this.interceptionId = interceptionId;
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
	public boolean getIsNavigationRequest() {
		return this.isNavigationRequest;
	}
	public void setIsNavigationRequest(boolean isNavigationRequest) {
		this.isNavigationRequest = isNavigationRequest;
	}
	public boolean getIsDownload() {
		return this.isDownload;
	}
	public void setIsDownload(boolean isDownload) {
		this.isDownload = isDownload;
	}
	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public AuthChallenge getAuthChallenge() {
		return this.authChallenge;
	}
	public void setAuthChallenge(AuthChallenge authChallenge) {
		this.authChallenge = authChallenge;
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
	public Headers getResponseHeaders() {
		return this.responseHeaders;
	}
	public void setResponseHeaders(Headers responseHeaders) {
		this.responseHeaders = responseHeaders;
	}
	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
