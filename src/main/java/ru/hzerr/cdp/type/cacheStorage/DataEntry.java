package ru.hzerr.cdp.type.cacheStorage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.annotation.TypeDescription;

@Description("Data entry.")
public class DataEntry {

	@Required
	@Description("Request URL.")
	private String requestURL;

	@Required
	@Description("Request method.")
	private String requestMethod;

	@Required
	@Description("Request headers")
	private List<Header> requestHeaders;

	@Required
	@Description("Number of seconds since epoch.")
	private Number responseTime;

	@Required
	@Description("HTTP response status code.")
	private int responseStatus;

	@Required
	@Description("HTTP response status text.")
	private String responseStatusText;

	@Required
	@Description("HTTP response type")
	@TypeDescription("type of HTTP response cached")
	private String responseType;

	@Required
	@Description("Response headers")
	private List<Header> responseHeaders;

    public DataEntry() {
    }

	public String getRequestURL() {
		return this.requestURL;
	}
	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
	public String getRequestMethod() {
		return this.requestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	public List<Header> getRequestHeaders() {
		return this.requestHeaders;
	}
	public void setRequestHeaders(List<Header> requestHeaders) {
		this.requestHeaders = requestHeaders;
	}
	public Number getResponseTime() {
		return this.responseTime;
	}
	public void setResponseTime(Number responseTime) {
		this.responseTime = responseTime;
	}
	public int getResponseStatus() {
		return this.responseStatus;
	}
	public void setResponseStatus(int responseStatus) {
		this.responseStatus = responseStatus;
	}
	public String getResponseStatusText() {
		return this.responseStatusText;
	}
	public void setResponseStatusText(String responseStatusText) {
		this.responseStatusText = responseStatusText;
	}
	public String getResponseType() {
		return this.responseType;
	}
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	public List<Header> getResponseHeaders() {
		return this.responseHeaders;
	}
	public void setResponseHeaders(List<Header> responseHeaders) {
		this.responseHeaders = responseHeaders;
	}
}
