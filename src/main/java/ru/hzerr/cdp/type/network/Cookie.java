package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeExperimental;

@Description("Cookie object")
public class Cookie {

	@Required
	@Description("Cookie name.")
	private String name;

	@Required
	@Description("Cookie value.")
	private String value;

	@Required
	@Description("Cookie domain.")
	private String domain;

	@Required
	@Description("Cookie path.")
	private String path;

	@Required
	@Description("Cookie expiration date as the number of seconds since the UNIX epoch. The value is set to -1 if the expiry date is not set. The value can be null for values that cannot be represented in JSON (Â±Inf).")
	private Number expires;

	@Required
	@Description("Cookie size.")
	private int size;

	@Required
	@Description("True if cookie is http-only.")
	private boolean httpOnly;

	@Required
	@Description("True if cookie is secure.")
	private boolean secure;

	@Required
	@Description("True in case of session cookie.")
	private boolean session;

	@Description("Cookie SameSite type.")
	@TypeDescription("Represents the cookie's 'SameSite' status: https://tools.ietf.org/html/draft-west-first-party-cookies")
	private String sameSite;

	@Experimental
	@Required
	@Description("Cookie Priority")
	@TypeExperimental
	@TypeDescription("Represents the cookie's 'Priority' status: https://tools.ietf.org/html/draft-west-cookie-priority-00")
	private String priority;

	@Deprecated
	@Experimental
	@Required
	@Description("True if cookie is SameParty.")
	private boolean sameParty;

	@Experimental
	@Required
	@Description("Cookie source scheme type.")
	@TypeExperimental
	@TypeDescription("Represents the source scheme of the origin that originally set the cookie. A value of \"Unset\" allows protocol clients to emulate legacy cookie scope for the scheme. This is a temporary ability and it will be removed in the future.")
	private String sourceScheme;

	@Experimental
	@Required
	@Description("Cookie source port. Valid values are {-1, [1, 65535]}, -1 indicates an unspecified port. An unspecified port value allows protocol clients to emulate legacy cookie scope for the port. This is a temporary ability and it will be removed in the future.")
	private int sourcePort;

	@Experimental
	@Description("Cookie partition key.")
	private CookiePartitionKey partitionKey;

	@Experimental
	@Description("True if cookie partition key is opaque.")
	private boolean partitionKeyOpaque;

    public Cookie() {
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
	public Number getExpires() {
		return this.expires;
	}
	public void setExpires(Number expires) {
		this.expires = expires;
	}
	public int getSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean getHttpOnly() {
		return this.httpOnly;
	}
	public void setHttpOnly(boolean httpOnly) {
		this.httpOnly = httpOnly;
	}
	public boolean getSecure() {
		return this.secure;
	}
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	public boolean getSession() {
		return this.session;
	}
	public void setSession(boolean session) {
		this.session = session;
	}
	public String getSameSite() {
		return this.sameSite;
	}
	public void setSameSite(String sameSite) {
		this.sameSite = sameSite;
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
	public boolean getPartitionKeyOpaque() {
		return this.partitionKeyOpaque;
	}
	public void setPartitionKeyOpaque(boolean partitionKeyOpaque) {
		this.partitionKeyOpaque = partitionKeyOpaque;
	}
}
