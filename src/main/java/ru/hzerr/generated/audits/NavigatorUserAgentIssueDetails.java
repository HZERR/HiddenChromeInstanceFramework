package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Required;

@Deprecated
public class NavigatorUserAgentIssueDetails {

	@Required
	private String url;

	private SourceCodeLocation location;

    public NavigatorUserAgentIssueDetails() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public SourceCodeLocation getLocation() {
		return this.location;
	}
	public void setLocation(SourceCodeLocation location) {
		this.location = location;
	}
}
