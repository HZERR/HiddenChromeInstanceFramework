package ru.hzerr.generated.security;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class SafetyTipInfo {

	@Required
	@Description("Describes whether the page triggers any safety tips or reputation warnings. Default is unknown.")
	@TypeExperimental
	private String safetyTipStatus;

	@Description("The URL the safety tip suggested (\"Did you mean?\"). Only filled in for lookalike matches.")
	private String safeUrl;

    public SafetyTipInfo() {
    }

	public String getSafetyTipStatus() {
		return this.safetyTipStatus;
	}
	public void setSafetyTipStatus(String safetyTipStatus) {
		this.safetyTipStatus = safetyTipStatus;
	}
	public String getSafeUrl() {
		return this.safeUrl;
	}
	public void setSafeUrl(String safeUrl) {
		this.safeUrl = safeUrl;
	}
}
