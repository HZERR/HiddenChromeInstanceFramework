package ru.hzerr.cdp.event.security;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.security.SecurityStateExplanation;
import ru.hzerr.cdp.type.security.InsecureContentStatus;

@Deprecated
@Description("The security state of the page changed. No longer being sent.")
@Event("securityStateChanged")
public class SecurityStateChangedEvent {

	@Required
	@Description("Security state.")
	@TypeDescription("The security level of a page or resource.")
	private String securityState;

	@Deprecated
	@Required
	@Description("True if the page was loaded over cryptographic transport such as HTTPS.")
	private boolean schemeIsCryptographic;

	@Deprecated
	@Required
	@Description("Previously a list of explanations for the security state. Now always empty.")
	private List<SecurityStateExplanation> explanations;

	@Deprecated
	@Required
	@Description("Information about insecure content on the page.")
	private InsecureContentStatus insecureContentStatus;

	@Deprecated
	@Description("Overrides user-visible description of the state. Always omitted.")
	private String summary;

    public SecurityStateChangedEvent() {
    }

	public String getSecurityState() {
		return this.securityState;
	}
	public void setSecurityState(String securityState) {
		this.securityState = securityState;
	}
	public boolean getSchemeIsCryptographic() {
		return this.schemeIsCryptographic;
	}
	public void setSchemeIsCryptographic(boolean schemeIsCryptographic) {
		this.schemeIsCryptographic = schemeIsCryptographic;
	}
	public List<SecurityStateExplanation> getExplanations() {
		return this.explanations;
	}
	public void setExplanations(List<SecurityStateExplanation> explanations) {
		this.explanations = explanations;
	}
	public InsecureContentStatus getInsecureContentStatus() {
		return this.insecureContentStatus;
	}
	public void setInsecureContentStatus(InsecureContentStatus insecureContentStatus) {
		this.insecureContentStatus = insecureContentStatus;
	}
	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
