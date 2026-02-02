package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Experimental
@Description("A cookie which was not stored from a response with the corresponding reason.")
public class BlockedSetCookieWithReason {

	@Required
	@Description("The reason(s) this cookie was blocked.")
	@TypeExperimental
	@TypeDescription("Types of reasons why a cookie may not be stored from a response.")
	private List<String> blockedReasons;

	@Required
	@Description("The string representing this individual cookie as it would appear in the header. This is not the entire \"cookie\" or \"set-cookie\" header which could have multiple cookies.")
	private String cookieLine;

	@Description("The cookie object which represents the cookie which was not stored. It is optional because sometimes complete cookie information is not available, such as in the case of parsing errors.")
	private Cookie cookie;

    public BlockedSetCookieWithReason() {
    }

	public List<String> getBlockedReasons() {
		return this.blockedReasons;
	}
	public void setBlockedReasons(List<String> blockedReasons) {
		this.blockedReasons = blockedReasons;
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
