package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Deprecated
@Description("Fired when frame no longer has a scheduled navigation.")
@Event("frameClearedScheduledNavigation")
public class FrameClearedScheduledNavigationEvent {

	@Required
	@Description("Id of the frame that has cleared its scheduled navigation.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

    public FrameClearedScheduledNavigationEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
}
