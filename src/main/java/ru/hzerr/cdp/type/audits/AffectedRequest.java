package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Required;

@Description("Information about a request that is affected by an inspector issue.")
public class AffectedRequest {

	@Description("The unique request id.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	private String url;

    public AffectedRequest() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
