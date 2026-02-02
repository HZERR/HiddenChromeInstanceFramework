package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

public class LowTextContrastIssueDetails {

	@Required
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int violatingNodeId;

	@Required
	private String violatingNodeSelector;

	@Required
	private Number contrastRatio;

	@Required
	private Number thresholdAA;

	@Required
	private Number thresholdAAA;

	@Required
	private String fontSize;

	@Required
	private String fontWeight;

    public LowTextContrastIssueDetails() {
    }

	public int getViolatingNodeId() {
		return this.violatingNodeId;
	}
	public void setViolatingNodeId(int violatingNodeId) {
		this.violatingNodeId = violatingNodeId;
	}
	public String getViolatingNodeSelector() {
		return this.violatingNodeSelector;
	}
	public void setViolatingNodeSelector(String violatingNodeSelector) {
		this.violatingNodeSelector = violatingNodeSelector;
	}
	public Number getContrastRatio() {
		return this.contrastRatio;
	}
	public void setContrastRatio(Number contrastRatio) {
		this.contrastRatio = contrastRatio;
	}
	public Number getThresholdAA() {
		return this.thresholdAA;
	}
	public void setThresholdAA(Number thresholdAA) {
		this.thresholdAA = thresholdAA;
	}
	public Number getThresholdAAA() {
		return this.thresholdAAA;
	}
	public void setThresholdAAA(Number thresholdAAA) {
		this.thresholdAAA = thresholdAAA;
	}
	public String getFontSize() {
		return this.fontSize;
	}
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}
	public String getFontWeight() {
		return this.fontWeight;
	}
	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}
}
