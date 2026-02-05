package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Deprecated
@Experimental
@Description("Fired when download makes progress. Last call has |done| == true. Deprecated. Use Browser.downloadProgress instead.")
@Event("downloadProgress")
public class DownloadProgressEvent {

	@Required
	@Description("Global unique identifier of the download.")
	private String guid;

	@Required
	@Description("Total expected bytes to download.")
	private Number totalBytes;

	@Required
	@Description("Total bytes received.")
	private Number receivedBytes;

	@Required
	@Description("Download status.")
	@Enum({"inProgress", "completed", "canceled"})
	private String state;

    public DownloadProgressEvent() {
    }

	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public Number getTotalBytes() {
		return this.totalBytes;
	}
	public void setTotalBytes(Number totalBytes) {
		this.totalBytes = totalBytes;
	}
	public Number getReceivedBytes() {
		return this.receivedBytes;
	}
	public void setReceivedBytes(Number receivedBytes) {
		this.receivedBytes = receivedBytes;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
