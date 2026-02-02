package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class FailedRequestInfo {

	@Required
	@Description("The URL that failed to load.")
	private String url;

	@Required
	@Description("The failure message for the failed request.")
	private String failureMessage;

	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

    public FailedRequestInfo() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFailureMessage() {
		return this.failureMessage;
	}
	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}
	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
