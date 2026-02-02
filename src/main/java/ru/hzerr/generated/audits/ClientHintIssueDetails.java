package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("This issue tracks client hints related issues. It's used to deprecate old features, encourage the use of new ones, and provide general guidance.")
public class ClientHintIssueDetails {

	@Required
	private SourceCodeLocation sourceCodeLocation;

	@Required
	private String clientHintIssueReason;

    public ClientHintIssueDetails() {
    }

	public SourceCodeLocation getSourceCodeLocation() {
		return this.sourceCodeLocation;
	}
	public void setSourceCodeLocation(SourceCodeLocation sourceCodeLocation) {
		this.sourceCodeLocation = sourceCodeLocation;
	}
	public String getClientHintIssueReason() {
		return this.clientHintIssueReason;
	}
	public void setClientHintIssueReason(String clientHintIssueReason) {
		this.clientHintIssueReason = clientHintIssueReason;
	}
}
