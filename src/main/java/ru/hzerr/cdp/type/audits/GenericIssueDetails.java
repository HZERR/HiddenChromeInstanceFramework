package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Depending on the concrete errorType, different properties are set.")
public class GenericIssueDetails {

	@Required
	@Description("Issues with the same errorType are aggregated in the frontend.")
	private String errorType;

	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int violatingNodeId;

	private String violatingNodeAttribute;

	private AffectedRequest request;

    public GenericIssueDetails() {
    }

	public String getErrorType() {
		return this.errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public int getViolatingNodeId() {
		return this.violatingNodeId;
	}
	public void setViolatingNodeId(int violatingNodeId) {
		this.violatingNodeId = violatingNodeId;
	}
	public String getViolatingNodeAttribute() {
		return this.violatingNodeAttribute;
	}
	public void setViolatingNodeAttribute(String violatingNodeAttribute) {
		this.violatingNodeAttribute = violatingNodeAttribute;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
}
