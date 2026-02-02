package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Experimental
@Description("A cookie associated with the request which may or may not be sent with it. Includes the cookies itself and reasons for blocking or exemption.")
public class AssociatedCookie {

	@Required
	@Description("The cookie object representing the cookie which was not sent.")
	private Cookie cookie;

	@Required
	@Description("The reason(s) the cookie was blocked. If empty means the cookie is included.")
	@TypeExperimental
	@TypeDescription("Types of reasons why a cookie may not be sent with a request.")
	private List<String> blockedReasons;

	@Description("The reason the cookie should have been blocked by 3PCD but is exempted. A cookie could only have at most one exemption reason.")
	@TypeExperimental
	@TypeDescription("Types of reasons why a cookie should have been blocked by 3PCD but is exempted for the request.")
	private String exemptionReason;

    public AssociatedCookie() {
    }

	public Cookie getCookie() {
		return this.cookie;
	}
	public void setCookie(Cookie cookie) {
		this.cookie = cookie;
	}
	public List<String> getBlockedReasons() {
		return this.blockedReasons;
	}
	public void setBlockedReasons(List<String> blockedReasons) {
		this.blockedReasons = blockedReasons;
	}
	public String getExemptionReason() {
		return this.exemptionReason;
	}
	public void setExemptionReason(String exemptionReason) {
		this.exemptionReason = exemptionReason;
	}
}
