package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Required;

public class UnencodedDigestIssueDetails {

	@Required
	private String error;

	@Required
	private AffectedRequest request;

    public UnencodedDigestIssueDetails() {
    }

	public String getError() {
		return this.error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
}
