package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired when frame has stopped loading.")
@Event("frameStoppedLoading")
public class FrameStoppedLoadingEvent {

	@Required
	@Description("Id of the frame that has stopped loading.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

    public FrameStoppedLoadingEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
}
