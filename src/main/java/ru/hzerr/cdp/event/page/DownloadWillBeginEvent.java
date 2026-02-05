package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Deprecated
@Experimental
@Description("Fired when page is about to start a download. Deprecated. Use Browser.downloadWillBegin instead.")
@Event("downloadWillBegin")
public class DownloadWillBeginEvent {

	@Required
	@Description("Id of the frame that caused download to begin.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Global unique identifier of the download.")
	private String guid;

	@Required
	@Description("URL of the resource being downloaded.")
	private String url;

	@Required
	@Description("Suggested file name of the resource (the actual name of the file saved on disk may differ).")
	private String suggestedFilename;

    public DownloadWillBeginEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSuggestedFilename() {
		return this.suggestedFilename;
	}
	public void setSuggestedFilename(String suggestedFilename) {
		this.suggestedFilename = suggestedFilename;
	}
}
