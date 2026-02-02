package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Details for a request that has been blocked with the BLOCKED_BY_RESPONSE code. Currently only used for COEP/COOP, but may be extended to include some CSP errors in the future.")
public class BlockedByResponseIssueDetails {

	@Required
	private AffectedRequest request;

	private AffectedFrame parentFrame;

	private AffectedFrame blockedFrame;

	@Required
	@TypeDescription("Enum indicating the reason a response has been blocked. These reasons are refinements of the net error BLOCKED_BY_RESPONSE.")
	private String reason;

    public BlockedByResponseIssueDetails() {
    }

	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
	public AffectedFrame getParentFrame() {
		return this.parentFrame;
	}
	public void setParentFrame(AffectedFrame parentFrame) {
		this.parentFrame = parentFrame;
	}
	public AffectedFrame getBlockedFrame() {
		return this.blockedFrame;
	}
	public void setBlockedFrame(AffectedFrame blockedFrame) {
		this.blockedFrame = blockedFrame;
	}
	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
