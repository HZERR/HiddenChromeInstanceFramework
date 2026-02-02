package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Information about a cookie that is affected by an inspector issue.")
public class AffectedCookie {

	@Required
	@Description("The following three properties uniquely identify a cookie")
	private String name;

	@Required
	private String path;

	@Required
	private String domain;

    public AffectedCookie() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
}
