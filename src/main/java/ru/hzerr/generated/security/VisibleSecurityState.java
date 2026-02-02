package ru.hzerr.generated.security;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Security state information about the page.")
public class VisibleSecurityState {

	@Required
	@Description("The security level of the page.")
	@TypeDescription("The security level of a page or resource.")
	private String securityState;

	@Description("Security state details about the page certificate.")
	private CertificateSecurityState certificateSecurityState;

	@Description("The type of Safety Tip triggered on the page. Note that this field will be set even if the Safety Tip UI was not actually shown.")
	private SafetyTipInfo safetyTipInfo;

	@Required
	@Description("Array of security state issues ids.")
	private String[] securityStateIssueIds;

    public VisibleSecurityState() {
    }

	public String getSecurityState() {
		return this.securityState;
	}
	public void setSecurityState(String securityState) {
		this.securityState = securityState;
	}
	public CertificateSecurityState getCertificateSecurityState() {
		return this.certificateSecurityState;
	}
	public void setCertificateSecurityState(CertificateSecurityState certificateSecurityState) {
		this.certificateSecurityState = certificateSecurityState;
	}
	public SafetyTipInfo getSafetyTipInfo() {
		return this.safetyTipInfo;
	}
	public void setSafetyTipInfo(SafetyTipInfo safetyTipInfo) {
		this.safetyTipInfo = safetyTipInfo;
	}
	public String[] getSecurityStateIssueIds() {
		return this.securityStateIssueIds;
	}
	public void setSecurityStateIssueIds(String[] securityStateIssueIds) {
		this.securityStateIssueIds = securityStateIssueIds;
	}
}
