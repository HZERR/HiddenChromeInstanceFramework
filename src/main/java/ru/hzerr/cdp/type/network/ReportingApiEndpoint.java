package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class ReportingApiEndpoint {

	@Required
	@Description("The URL of the endpoint to which reports may be delivered.")
	private String url;

	@Required
	@Description("Name of the endpoint group.")
	private String groupName;

    public ReportingApiEndpoint() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
