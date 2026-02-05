package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
@Description("Fired when a renderer-initiated navigation is requested. Navigation may still be cancelled after the event is issued.")
@Event("frameRequestedNavigation")
public class FrameRequestedNavigationEvent {

	@Required
	@Description("Id of the frame that is being navigated.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("The reason for the navigation.")
	@TypeExperimental
	private String reason;

	@Required
	@Description("The destination URL for the requested navigation.")
	private String url;

	@Required
	@Description("The disposition for the navigation.")
	@TypeExperimental
	private String disposition;

    public FrameRequestedNavigationEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDisposition() {
		return this.disposition;
	}
	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}
}
