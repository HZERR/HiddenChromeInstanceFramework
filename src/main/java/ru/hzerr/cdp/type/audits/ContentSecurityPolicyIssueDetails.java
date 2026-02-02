package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

public class ContentSecurityPolicyIssueDetails {

	@Description("The url not included in allowed sources.")
	private String blockedURL;

	@Required
	@Description("Specific directive that is violated, causing the CSP issue.")
	private String violatedDirective;

	@Required
	private boolean isReportOnly;

	@Required
	private String contentSecurityPolicyViolationType;

	private AffectedFrame frameAncestor;

	private SourceCodeLocation sourceCodeLocation;

	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int violatingNodeId;

    public ContentSecurityPolicyIssueDetails() {
    }

	public String getBlockedURL() {
		return this.blockedURL;
	}
	public void setBlockedURL(String blockedURL) {
		this.blockedURL = blockedURL;
	}
	public String getViolatedDirective() {
		return this.violatedDirective;
	}
	public void setViolatedDirective(String violatedDirective) {
		this.violatedDirective = violatedDirective;
	}
	public boolean getIsReportOnly() {
		return this.isReportOnly;
	}
	public void setIsReportOnly(boolean isReportOnly) {
		this.isReportOnly = isReportOnly;
	}
	public String getContentSecurityPolicyViolationType() {
		return this.contentSecurityPolicyViolationType;
	}
	public void setContentSecurityPolicyViolationType(String contentSecurityPolicyViolationType) {
		this.contentSecurityPolicyViolationType = contentSecurityPolicyViolationType;
	}
	public AffectedFrame getFrameAncestor() {
		return this.frameAncestor;
	}
	public void setFrameAncestor(AffectedFrame frameAncestor) {
		this.frameAncestor = frameAncestor;
	}
	public SourceCodeLocation getSourceCodeLocation() {
		return this.sourceCodeLocation;
	}
	public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
		this.sourceCodeLocation = sourceCodeLocation;
	}
	public int getViolatingNodeId() {
		return this.violatingNodeId;
	}
	public void setViolatingNodeId(int violatingNodeId) {
		this.violatingNodeId = violatingNodeId;
	}
}
