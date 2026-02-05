package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Experimental
@Event("attributionReportingVerboseDebugReportSent")
public class AttributionReportingVerboseDebugReportSentEvent {

	@Required
	private String url;

	private int netError;

	private String netErrorName;

	private int httpStatusCode;

    public AttributionReportingVerboseDebugReportSentEvent() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getNetError() {
		return this.netError;
	}
	public void setNetError(int netError) {
		this.netError = netError;
	}
	public String getNetErrorName() {
		return this.netErrorName;
	}
	public void setNetErrorName(String netErrorName) {
		this.netErrorName = netErrorName;
	}
	public int getHttpStatusCode() {
		return this.httpStatusCode;
	}
	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
}
