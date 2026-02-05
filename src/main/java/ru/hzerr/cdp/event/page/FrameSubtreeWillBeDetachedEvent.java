package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired before frame subtree is detached. Emitted before any frame of the subtree is actually detached.")
@Event("frameSubtreeWillBeDetached")
public class FrameSubtreeWillBeDetachedEvent {

	@Required
	@Description("Id of the frame that is the root of the subtree that will be detached.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

    public FrameSubtreeWillBeDetachedEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
}
