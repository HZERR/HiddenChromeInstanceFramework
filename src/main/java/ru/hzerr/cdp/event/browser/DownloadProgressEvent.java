package ru.hzerr.cdp.event.browser;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Experimental
@Description("Fired when download makes progress. Last call has |done| == true.")
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

	@Experimental
	@Description("If download is \"completed\", provides the path of the downloaded file. Depending on the platform, it is not guaranteed to be set, nor the file is guaranteed to exist.")
	private String filePath;

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
	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
