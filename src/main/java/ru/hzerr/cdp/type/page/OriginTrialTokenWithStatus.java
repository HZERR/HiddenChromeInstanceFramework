package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Experimental
public class OriginTrialTokenWithStatus {

	@Required
	private String rawTokenText;

	@Description("`parsedToken` is present only when the token is extractable and parsable.")
	private OriginTrialToken parsedToken;

	@Required
	@TypeExperimental
	@TypeDescription("Origin Trial(https://www.chromium.org/blink/origin-trials) support. Status for an Origin Trial token.")
	private String status;

    public OriginTrialTokenWithStatus() {
    }

	public String getRawTokenText() {
		return this.rawTokenText;
	}
	public void setRawTokenText(String rawTokenText) {
		this.rawTokenText = rawTokenText;
	}
	public OriginTrialToken getParsedToken() {
		return this.parsedToken;
	}
	public void setParsedToken(OriginTrialToken parsedToken) {
		this.parsedToken = parsedToken;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
