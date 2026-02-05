package ru.hzerr.cdp.event.fetch;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.network.Request;
import ru.hzerr.cdp.type.fetch.AuthChallenge;

@Description("Issued when the domain is enabled with handleAuthRequests set to true. The request is paused until client responds with continueWithAuth.")
@Event("authRequired")
public class AuthRequiredEvent {

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

	@Required
	@Description("Details of the Authorization Challenge encountered. If this is set, client should respond with continueRequest that contains AuthChallengeResponse.")
	private AuthChallenge authChallenge;

    public AuthRequiredEvent() {
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
	public AuthChallenge getAuthChallenge() {
		return this.authChallenge;
	}
	public void setAuthChallenge(AuthChallenge authChallenge) {
		this.authChallenge = authChallenge;
	}
}
