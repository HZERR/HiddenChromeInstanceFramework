package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Information about the cached resource.")
public class CachedResource {

	@Required
	@Description("Resource URL. This is the url of the original network request.")
	private String url;

	@Required
	@Description("Type of this resource.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String type;

	@Description("Cached response data.")
	private Response response;

	@Required
	@Description("Cached response body size.")
	private Number bodySize;

    public CachedResource() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Response getResponse() {
		return this.response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public Number getBodySize() {
		return this.bodySize;
	}
	public void setBodySize(Number bodySize) {
		this.bodySize = bodySize;
	}
}
