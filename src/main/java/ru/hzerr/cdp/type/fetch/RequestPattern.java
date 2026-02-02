package ru.hzerr.cdp.type.fetch;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class RequestPattern {

	@Description("Wildcards (`'*'` -> zero or more, `'?'` -> exactly one) are allowed. Escape character is backslash. Omitting is equivalent to `\"*\"`.")
	private String urlPattern;

	@Description("If set, only requests for matching resource types will be intercepted.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String resourceType;

	@Description("Stage at which to begin intercepting requests. Default is Request.")
	@TypeDescription("Stages of the request to handle. Request will intercept before the request is sent. Response will intercept after the response is received (but before response body is received).")
	private String requestStage;

    public RequestPattern() {
    }

	public String getUrlPattern() {
		return this.urlPattern;
	}
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getRequestStage() {
		return this.requestStage;
	}
	public void setRequestStage(String requestStage) {
		this.requestStage = requestStage;
	}
}
