package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Required;

public class SharedDictionaryIssueDetails {

	@Required
	private String sharedDictionaryError;

	@Required
	private AffectedRequest request;

    public SharedDictionaryIssueDetails() {
    }

	public String getSharedDictionaryError() {
		return this.sharedDictionaryError;
	}
	public void setSharedDictionaryError(String sharedDictionaryError) {
		this.sharedDictionaryError = sharedDictionaryError;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
}
