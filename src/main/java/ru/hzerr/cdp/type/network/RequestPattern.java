package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
@Description("Request pattern for interception.")
public class RequestPattern {

	@Description("Wildcards (`'*'` -> zero or more, `'?'` -> exactly one) are allowed. Escape character is backslash. Omitting is equivalent to `\"*\"`.")
	private String urlPattern;

	@Description("If set, only requests for matching resource types will be intercepted.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String resourceType;

	@Description("Stage at which to begin intercepting requests. Default is Request.")
	@TypeExperimental
	@TypeDescription("Stages of the interception to begin intercepting. Request will intercept before the request is sent. Response will intercept after the response is received.")
	private String interceptionStage;

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
	public String getInterceptionStage() {
		return this.interceptionStage;
	}
	public void setInterceptionStage(String interceptionStage) {
		this.interceptionStage = interceptionStage;
	}
}
