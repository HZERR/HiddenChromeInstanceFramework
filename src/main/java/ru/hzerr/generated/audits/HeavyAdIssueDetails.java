package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class HeavyAdIssueDetails {

	@Required
	@Description("The resolution status, either blocking the content or warning.")
	private String resolution;

	@Required
	@Description("The reason the ad was blocked, total network or cpu or peak cpu.")
	private String reason;

	@Required
	@Description("The frame that was blocked.")
	private AffectedFrame frame;

    public HeavyAdIssueDetails() {
    }

	public String getResolution() {
		return this.resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public AffectedFrame getFrame() {
		return this.frame;
	}
	public void setFrame(AffectedFrame frame) {
		this.frame = frame;
	}
}
