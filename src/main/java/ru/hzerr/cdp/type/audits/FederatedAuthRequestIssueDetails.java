package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

public class FederatedAuthRequestIssueDetails {

	@Required
	@TypeDescription("Represents the failure reason when a federated authentication reason fails. Should be updated alongside RequestIdTokenStatus in third_party/blink/public/mojom/devtools/inspector_issue.mojom to include all cases except for success.")
	private String federatedAuthRequestIssueReason;

    public FederatedAuthRequestIssueDetails() {
    }

	public String getFederatedAuthRequestIssueReason() {
		return this.federatedAuthRequestIssueReason;
	}
	public void setFederatedAuthRequestIssueReason(String federatedAuthRequestIssueReason) {
		this.federatedAuthRequestIssueReason = federatedAuthRequestIssueReason;
	}
}
