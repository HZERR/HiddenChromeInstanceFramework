package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Required;

public class SRIMessageSignatureIssueDetails {

	@Required
	private String error;

	@Required
	private String signatureBase;

	@Required
	private String[] integrityAssertions;

	@Required
	private AffectedRequest request;

    public SRIMessageSignatureIssueDetails() {
    }

	public String getError() {
		return this.error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getSignatureBase() {
		return this.signatureBase;
	}
	public void setSignatureBase(String signatureBase) {
		this.signatureBase = signatureBase;
	}
	public String[] getIntegrityAssertions() {
		return this.integrityAssertions;
	}
	public void setIntegrityAssertions(String[] integrityAssertions) {
		this.integrityAssertions = integrityAssertions;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
}
