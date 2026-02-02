package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

public class MixedContentIssueDetails {

	@Description("The type of resource causing the mixed content issue (css, js, iframe, form,...). Marked as optional because it is mapped to from blink::mojom::RequestContextType, which will be replaced by network::mojom::RequestDestination")
	private String resourceType;

	@Required
	@Description("The way the mixed content issue is being resolved.")
	private String resolutionStatus;

	@Required
	@Description("The unsafe http url causing the mixed content issue.")
	private String insecureURL;

	@Required
	@Description("The url responsible for the call to an unsafe url.")
	private String mainResourceURL;

	@Description("The mixed content request. Does not always exist (e.g. for unsafe form submission urls).")
	private AffectedRequest request;

	@Description("Optional because not every mixed content issue is necessarily linked to a frame.")
	private AffectedFrame frame;

    public MixedContentIssueDetails() {
    }

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResolutionStatus() {
		return this.resolutionStatus;
	}
	public void setResolutionStatus(String resolutionStatus) {
		this.resolutionStatus = resolutionStatus;
	}
	public String getInsecureURL() {
		return this.insecureURL;
	}
	public void setInsecureURL(String insecureURL) {
		this.insecureURL = insecureURL;
	}
	public String getMainResourceURL() {
		return this.mainResourceURL;
	}
	public void setMainResourceURL(String mainResourceURL) {
		this.mainResourceURL = mainResourceURL;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
	public AffectedFrame getFrame() {
		return this.frame;
	}
	public void setFrame(AffectedFrame frame) {
		this.frame = frame;
	}
}
