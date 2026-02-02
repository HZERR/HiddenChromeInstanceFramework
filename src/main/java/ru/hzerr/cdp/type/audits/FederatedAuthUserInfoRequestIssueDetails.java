package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

public class FederatedAuthUserInfoRequestIssueDetails {

	@Required
	@TypeDescription("Represents the failure reason when a getUserInfo() call fails. Should be updated alongside FederatedAuthUserInfoRequestResult in third_party/blink/public/mojom/devtools/inspector_issue.mojom.")
	private String federatedAuthUserInfoRequestIssueReason;

    public FederatedAuthUserInfoRequestIssueDetails() {
    }

	public String getFederatedAuthUserInfoRequestIssueReason() {
		return this.federatedAuthUserInfoRequestIssueReason;
	}
	public void setFederatedAuthUserInfoRequestIssueReason(String federatedAuthUserInfoRequestIssueReason) {
		this.federatedAuthUserInfoRequestIssueReason = federatedAuthUserInfoRequestIssueReason;
	}
}
