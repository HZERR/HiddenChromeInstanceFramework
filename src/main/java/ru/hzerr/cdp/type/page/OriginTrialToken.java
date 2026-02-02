package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class OriginTrialToken {

	@Required
	private String origin;

	@Required
	private boolean matchSubDomains;

	@Required
	private String trialName;

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number expiryTime;

	@Required
	private boolean isThirdParty;

	@Required
	@TypeExperimental
	private String usageRestriction;

    public OriginTrialToken() {
    }

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public boolean getMatchSubDomains() {
		return this.matchSubDomains;
	}
	public void setMatchSubDomains(boolean matchSubDomains) {
		this.matchSubDomains = matchSubDomains;
	}
	public String getTrialName() {
		return this.trialName;
	}
	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}
	public Number getExpiryTime() {
		return this.expiryTime;
	}
	public void setExpiryTime(Number expiryTime) {
		this.expiryTime = expiryTime;
	}
	public boolean getIsThirdParty() {
		return this.isThirdParty;
	}
	public void setIsThirdParty(boolean isThirdParty) {
		this.isThirdParty = isThirdParty;
	}
	public String getUsageRestriction() {
		return this.usageRestriction;
	}
	public void setUsageRestriction(String usageRestriction) {
		this.usageRestriction = usageRestriction;
	}
}
