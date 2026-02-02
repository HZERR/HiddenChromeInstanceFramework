package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("A cookie should have been blocked by 3PCD but is exempted and stored from a response with the corresponding reason. A cookie could only have at most one exemption reason.")
public class ExemptedSetCookieWithReason {

	@Required
	@Description("The reason the cookie was exempted.")
	@TypeExperimental
	@TypeDescription("Types of reasons why a cookie should have been blocked by 3PCD but is exempted for the request.")
	private String exemptionReason;

	@Required
	@Description("The string representing this individual cookie as it would appear in the header.")
	private String cookieLine;

	@Required
	@Description("The cookie object representing the cookie.")
	private Cookie cookie;

    public ExemptedSetCookieWithReason() {
    }

	public String getExemptionReason() {
		return this.exemptionReason;
	}
	public void setExemptionReason(String exemptionReason) {
		this.exemptionReason = exemptionReason;
	}
	public String getCookieLine() {
		return this.cookieLine;
	}
	public void setCookieLine(String cookieLine) {
		this.cookieLine = cookieLine;
	}
	public Cookie getCookie() {
		return this.cookie;
	}
	public void setCookie(Cookie cookie) {
		this.cookie = cookie;
	}
}
