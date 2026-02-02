package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Details for issues around \"Attribution Reporting API\" usage. Explainer: https://github.com/WICG/attribution-reporting-api")
public class AttributionReportingIssueDetails {

	@Required
	private String violationType;

	private AffectedRequest request;

	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int violatingNodeId;

	private String invalidParameter;

    public AttributionReportingIssueDetails() {
    }

	public String getViolationType() {
		return this.violationType;
	}
	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
	public int getViolatingNodeId() {
		return this.violatingNodeId;
	}
	public void setViolatingNodeId(int violatingNodeId) {
		this.violatingNodeId = violatingNodeId;
	}
	public String getInvalidParameter() {
		return this.invalidParameter;
	}
	public void setInvalidParameter(String invalidParameter) {
		this.invalidParameter = invalidParameter;
	}
}
