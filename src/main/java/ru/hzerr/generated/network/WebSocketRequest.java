package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("WebSocket request data.")
public class WebSocketRequest {

	@Required
	@Description("HTTP request headers.")
	private Headers headers;

    public WebSocketRequest() {
    }

	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
}
