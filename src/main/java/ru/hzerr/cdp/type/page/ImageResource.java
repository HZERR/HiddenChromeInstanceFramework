package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("The image definition used in both icon and screenshot.")
public class ImageResource {

	@Required
	@Description("The src field in the definition, but changing to url in favor of consistency.")
	private String url;

	private String sizes;

	private String type;

    public ImageResource() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSizes() {
		return this.sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
