package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("A single Related Website Set object.")
public class RelatedWebsiteSet {

	@Required
	@Description("The primary site of this set, along with the ccTLDs if there is any.")
	private String[] primarySites;

	@Required
	@Description("The associated sites of this set, along with the ccTLDs if there is any.")
	private String[] associatedSites;

	@Required
	@Description("The service sites of this set, along with the ccTLDs if there is any.")
	private String[] serviceSites;

    public RelatedWebsiteSet() {
    }

	public String[] getPrimarySites() {
		return this.primarySites;
	}
	public void setPrimarySites(String[] primarySites) {
		this.primarySites = primarySites;
	}
	public String[] getAssociatedSites() {
		return this.associatedSites;
	}
	public void setAssociatedSites(String[] associatedSites) {
		this.associatedSites = associatedSites;
	}
	public String[] getServiceSites() {
		return this.serviceSites;
	}
	public void setServiceSites(String[] serviceSites) {
		this.serviceSites = serviceSites;
	}
}
