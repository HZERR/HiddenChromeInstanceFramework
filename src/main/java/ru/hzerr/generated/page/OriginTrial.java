package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Experimental
public class OriginTrial {

	@Required
	private String trialName;

	@Required
	@TypeExperimental
	@TypeDescription("Status for an Origin Trial.")
	private String status;

	@Required
	private List<OriginTrialTokenWithStatus> tokensWithStatus;

    public OriginTrial() {
    }

	public String getTrialName() {
		return this.trialName;
	}
	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<OriginTrialTokenWithStatus> getTokensWithStatus() {
		return this.tokensWithStatus;
	}
	public void setTokensWithStatus(List<OriginTrialTokenWithStatus> tokensWithStatus) {
		this.tokensWithStatus = tokensWithStatus;
	}
}
