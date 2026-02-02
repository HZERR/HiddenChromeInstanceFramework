package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Information about the Resource on the page.")
public class FrameResource {

	@Required
	@Description("Resource URL.")
	private String url;

	@Required
	@Description("Type of this resource.")
	@TypeDescription("Resource type as it was perceived by the rendering engine.")
	private String type;

	@Required
	@Description("Resource mimeType as determined by the browser.")
	private String mimeType;

	@Description("last-modified timestamp as reported by server.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number lastModified;

	@Description("Resource content size.")
	private Number contentSize;

	@Description("True if the resource failed to load.")
	private boolean failed;

	@Description("True if the resource was canceled during loading.")
	private boolean canceled;

    public FrameResource() {
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
	public String getMimeType() {
		return this.mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public Number getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Number lastModified) {
		this.lastModified = lastModified;
	}
	public Number getContentSize() {
		return this.contentSize;
	}
	public void setContentSize(Number contentSize) {
		this.contentSize = contentSize;
	}
	public boolean getFailed() {
		return this.failed;
	}
	public void setFailed(boolean failed) {
		this.failed = failed;
	}
	public boolean getCanceled() {
		return this.canceled;
	}
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
}
