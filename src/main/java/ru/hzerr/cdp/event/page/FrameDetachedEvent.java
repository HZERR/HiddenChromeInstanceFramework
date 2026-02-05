package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Enum;

@Description("Fired when frame has been detached from its parent.")
@Event("frameDetached")
public class FrameDetachedEvent {

	@Required
	@Description("Id of the frame that has been detached.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Experimental
	@Required
	@Enum({"remove", "swap"})
	private String reason;

    public FrameDetachedEvent() {
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
}
