package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("WebSocket response data.")
public class WebSocketResponse {

	@Required
	@Description("HTTP response status code.")
	private int status;

	@Required
	@Description("HTTP response status text.")
	private String statusText;

	@Required
	@Description("HTTP response headers.")
	private Headers headers;

	@Description("HTTP response headers text.")
	private String headersText;

	@Description("HTTP request headers.")
	private Headers requestHeaders;

	@Description("HTTP request headers text.")
	private String requestHeadersText;

    public WebSocketResponse() {
    }

	public int getStatus() {
		return this.status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusText() {
		return this.statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public String getHeadersText() {
		return this.headersText;
	}
	public void setHeadersText(String headersText) {
		this.headersText = headersText;
	}
	public Headers getRequestHeaders() {
		return this.requestHeaders;
	}
	public void setRequestHeaders(Headers requestHeaders) {
		this.requestHeaders = requestHeaders;
	}
	public String getRequestHeadersText() {
		return this.requestHeadersText;
	}
	public void setRequestHeadersText(String requestHeadersText) {
		this.requestHeadersText = requestHeadersText;
	}
}
