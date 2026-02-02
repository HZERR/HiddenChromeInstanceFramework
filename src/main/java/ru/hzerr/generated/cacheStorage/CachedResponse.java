package ru.hzerr.generated.cacheStorage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Cached response")
public class CachedResponse {

	@Required
	@Description("Entry content, base64-encoded.")
	private byte[] body;

    public CachedResponse() {
    }

	public byte[] getBody() {
		return this.body;
	}
	public void setBody(byte[] body) {
		this.body = body;
	}
}
