package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("cookiePartitionKey object The representation of the components of the key that are created by the cookiePartitionKey class contained in net/cookies/cookie_partition_key.h.")
public class CookiePartitionKey {

	@Required
	@Description("The site of the top-level URL the browser was visiting at the start of the request to the endpoint that set the cookie.")
	private String topLevelSite;

	@Required
	@Description("Indicates if the cookie has any ancestors that are cross-site to the topLevelSite.")
	private boolean hasCrossSiteAncestor;

    public CookiePartitionKey() {
    }

	public String getTopLevelSite() {
		return this.topLevelSite;
	}
	public void setTopLevelSite(String topLevelSite) {
		this.topLevelSite = topLevelSite;
	}
	public boolean getHasCrossSiteAncestor() {
		return this.hasCrossSiteAncestor;
	}
	public void setHasCrossSiteAncestor(boolean hasCrossSiteAncestor) {
		this.hasCrossSiteAncestor = hasCrossSiteAncestor;
	}
}
