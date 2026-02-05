package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired when frame has started loading.")
@Event("frameStartedLoading")
public class FrameStartedLoadingEvent {

	@Required
	@Description("Id of the frame that has started loading.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

    public FrameStartedLoadingEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
}
