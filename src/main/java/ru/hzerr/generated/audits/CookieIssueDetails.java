package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("This information is currently necessary, as the front-end has a difficult time finding a specific cookie. With this, we can convey specific error information without the cookie.")
public class CookieIssueDetails {

	@Description("If AffectedCookie is not set then rawCookieLine contains the raw Set-Cookie header string. This hints at a problem where the cookie line is syntactically or semantically malformed in a way that no valid cookie could be created.")
	private AffectedCookie cookie;

	private String rawCookieLine;

	@Required
	private List<String> cookieWarningReasons;

	@Required
	private List<String> cookieExclusionReasons;

	@Required
	@Description("Optionally identifies the site-for-cookies and the cookie url, which may be used by the front-end as additional context.")
	private String operation;

	private String siteForCookies;

	private String cookieUrl;

	private AffectedRequest request;

	@Description("The recommended solution to the issue.")
	private CookieIssueInsight insight;

    public CookieIssueDetails() {
    }

	public AffectedCookie getCookie() {
		return this.cookie;
	}
	public void setCookie(AffectedCookie cookie) {
		this.cookie = cookie;
	}
	public String getRawCookieLine() {
		return this.rawCookieLine;
	}
	public void setRawCookieLine(String rawCookieLine) {
		this.rawCookieLine = rawCookieLine;
	}
	public List<String> getCookieWarningReasons() {
		return this.cookieWarningReasons;
	}
	public void setCookieWarningReasons(List<String> cookieWarningReasons) {
		this.cookieWarningReasons = cookieWarningReasons;
	}
	public List<String> getCookieExclusionReasons() {
		return this.cookieExclusionReasons;
	}
	public void setCookieExclusionReasons(List<String> cookieExclusionReasons) {
		this.cookieExclusionReasons = cookieExclusionReasons;
	}
	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getSiteForCookies() {
		return this.siteForCookies;
	}
	public void setSiteForCookies(String siteForCookies) {
		this.siteForCookies = siteForCookies;
	}
	public String getCookieUrl() {
		return this.cookieUrl;
	}
	public void setCookieUrl(String cookieUrl) {
		this.cookieUrl = cookieUrl;
	}
	public AffectedRequest getRequest() {
		return this.request;
	}
	public void setRequest(AffectedRequest request) {
		this.request = request;
	}
	public CookieIssueInsight getInsight() {
		return this.insight;
	}
	public void setInsight(CookieIssueInsight insight) {
		this.insight = insight;
	}
}
