package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("This issue warns about sites in the redirect chain of a finished navigation that may be flagged as trackers and have their state cleared if they don't receive a user interaction. Note that in this context 'site' means eTLD+1. For example, if the URL `https://example.test:80/bounce` was in the redirect chain, the site reported would be `example.test`.")
public class BounceTrackingIssueDetails {

	@Required
	private String[] trackingSites;

    public BounceTrackingIssueDetails() {
    }

	public String[] getTrackingSites() {
		return this.trackingSites;
	}
	public void setTrackingSites(String[] trackingSites) {
		this.trackingSites = trackingSites;
	}
}
