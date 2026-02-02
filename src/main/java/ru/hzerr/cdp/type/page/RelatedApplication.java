package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class RelatedApplication {

	private String id;

	@Required
	private String url;

    public RelatedApplication() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
