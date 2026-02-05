package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.TypeExperimental;

@Deprecated
@Description("Fired when frame schedules a potential navigation.")
@Event("frameScheduledNavigation")
public class FrameScheduledNavigationEvent {

	@Required
	@Description("Id of the frame that has scheduled a navigation.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Delay (in seconds) until the navigation is scheduled to begin. The navigation is not guaranteed to start.")
	private Number delay;

	@Required
	@Description("The reason for the navigation.")
	@TypeExperimental
	private String reason;

	@Required
	@Description("The destination URL for the scheduled navigation.")
	private String url;

    public FrameScheduledNavigationEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public Number getDelay() {
		return this.delay;
	}
	public void setDelay(Number delay) {
		this.delay = delay;
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
}
