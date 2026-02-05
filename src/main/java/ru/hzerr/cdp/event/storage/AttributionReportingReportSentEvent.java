package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.Description;

@Experimental
@Event("attributionReportingReportSent")
public class AttributionReportingReportSentEvent {

	@Required
	private String url;

	@Required
	private Object body;

	@Required
	@TypeExperimental
	private String result;

	@Description("If result is `sent`, populated with net/HTTP status.")
	private int netError;

	private String netErrorName;

	private int httpStatusCode;

    public AttributionReportingReportSentEvent() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Object getBody() {
		return this.body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
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
