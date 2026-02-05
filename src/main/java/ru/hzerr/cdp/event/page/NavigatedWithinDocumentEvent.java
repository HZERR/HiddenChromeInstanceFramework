package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Enum;

@Experimental
@Description("Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.")
@Event("navigatedWithinDocument")
public class NavigatedWithinDocumentEvent {

	@Required
	@Description("Id of the frame.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Frame's new url.")
	private String url;

	@Required
	@Description("Navigation type")
	@Enum({"fragment", "historyApi", "other"})
	private String navigationType;

    public NavigatedWithinDocumentEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNavigationType() {
		return this.navigationType;
	}
	public void setNavigationType(String navigationType) {
		this.navigationType = navigationType;
	}
}
