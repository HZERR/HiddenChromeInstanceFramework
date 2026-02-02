package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeExperimental;

@Description("Cookie parameter object")
public class CookieParam {

	@Required
	@Description("Cookie name.")
	private String name;

	@Required
	@Description("Cookie value.")
	private String value;

	@Description("The request-URI to associate with the setting of the cookie. This value can affect the default domain, path, source port, and source scheme values of the created cookie.")
	private String url;

	@Description("Cookie domain.")
	private String domain;

	@Description("Cookie path.")
	private String path;

	@Description("True if cookie is secure.")
	private boolean secure;

	@Description("True if cookie is http-only.")
	private boolean httpOnly;

	@Description("Cookie SameSite type.")
	@TypeDescription("Represents the cookie's 'SameSite' status: https://tools.ietf.org/html/draft-west-first-party-cookies")
	private String sameSite;

	@Description("Cookie expiration date, session cookie if not set")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number expires;

	@Experimental
	@Description("Cookie Priority.")
	@TypeExperimental
	@TypeDescription("Represents the cookie's 'Priority' status: https://tools.ietf.org/html/draft-west-cookie-priority-00")
	private String priority;

	@Experimental
	@Description("True if cookie is SameParty.")
	private boolean sameParty;

	@Experimental
	@Description("Cookie source scheme type.")
	@TypeExperimental
	@TypeDescription("Represents the source scheme of the origin that originally set the cookie. A value of \"Unset\" allows protocol clients to emulate legacy cookie scope for the scheme. This is a temporary ability and it will be removed in the future.")
	private String sourceScheme;

	@Experimental
	@Description("Cookie source port. Valid values are {-1, [1, 65535]}, -1 indicates an unspecified port. An unspecified port value allows protocol clients to emulate legacy cookie scope for the port. This is a temporary ability and it will be removed in the future.")
	private int sourcePort;

	@Experimental
	@Description("Cookie partition key. If not set, the cookie will be set as not partitioned.")
	private CookiePartitionKey partitionKey;

    public CookieParam() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean getSecure() {
		return this.secure;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	public boolean getHttpOnly() {
		return this.httpOnly;
	}
	public void setHttpOnly(boolean httpOnly) {
		this.httpOnly = httpOnly;
	}
	public String getSameSite() {
		return this.sameSite;
	}
	public void setSameSite(String sameSite) {
		this.sameSite = sameSite;
	}
	public Number getExpires() {
		return this.expires;
	}
	public void setExpires(Number expires) {
		this.expires = expires;
	}
	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public boolean getSameParty() {
		return this.sameParty;
	}
	public void setSameParty(boolean sameParty) {
		this.sameParty = sameParty;
	}
	public String getSourceScheme() {
		return this.sourceScheme;
	}
	public void setSourceScheme(String sourceScheme) {
		this.sourceScheme = sourceScheme;
	}
	public int getSourcePort() {
		return this.sourcePort;
	}
	public void setSourcePort(int sourcePort) {
		this.sourcePort = sourcePort;
	}
	public CookiePartitionKey getPartitionKey() {
		return this.partitionKey;
	}
	public void setPartitionKey(CookiePartitionKey partitionKey) {
		this.partitionKey = partitionKey;
	}
}
