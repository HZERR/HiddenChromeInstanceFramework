package ru.hzerr.cdp.type.input;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class DragDataItem {

	@Required
	@Description("Mime type of the dragged data.")
	private String mimeType;

	@Required
	@Description("Depending of the value of `mimeType`, it contains the dragged link, text, HTML markup or any other data.")
	private String data;

	@Description("Title associated with a link. Only valid when `mimeType` == \"text/uri-list\".")
	private String title;

	@Description("Stores the base URL for the contained markup. Only valid when `mimeType` == \"text/html\".")
	private String baseURL;

    public DragDataItem() {
    }

	public String getMimeType() {
		return this.mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBaseURL() {
		return this.baseURL;
	}
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
}
