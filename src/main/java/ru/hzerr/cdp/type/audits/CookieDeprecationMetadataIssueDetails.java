package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("This issue warns about third-party sites that are accessing cookies on the current page, and have been permitted due to having a global metadata grant. Note that in this context 'site' means eTLD+1. For example, if the URL `https://example.test:80/web_page` was accessing cookies, the site reported would be `example.test`.")
public class CookieDeprecationMetadataIssueDetails {

	@Required
	private String[] allowedSites;

	@Required
	private Number optOutPercentage;

	@Required
	private boolean isOptOutTopLevel;

	@Required
	private String operation;

    public CookieDeprecationMetadataIssueDetails() {
    }

	public String[] getAllowedSites() {
		return this.allowedSites;
	}
	public void setAllowedSites(String[] allowedSites) {
		this.allowedSites = allowedSites;
	}
	public Number getOptOutPercentage() {
		return this.optOutPercentage;
	}
	public void setOptOutPercentage(Number optOutPercentage) {
		this.optOutPercentage = optOutPercentage;
	}
	public boolean getIsOptOutTopLevel() {
		return this.isOptOutTopLevel;
	}
	public void setIsOptOutTopLevel(boolean isOptOutTopLevel) {
		this.isOptOutTopLevel = isOptOutTopLevel;
	}
	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
}
