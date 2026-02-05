package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.runtime.StackTrace;

@Description("Fired when frame has been attached to its parent.")
@Event("frameAttached")
public class FrameAttachedEvent {

	@Required
	@Description("Id of the frame that has been attached.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Parent frame identifier.")
	@TypeDescription("Unique frame identifier.")
	private String parentFrameId;

	@Description("JavaScript stack trace of when frame was attached, only set if frame initiated from script.")
	private StackTrace stack;

    public FrameAttachedEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getParentFrameId() {
		return this.parentFrameId;
	}
	public void setParentFrameId(String parentFrameId) {
		this.parentFrameId = parentFrameId;
	}
	public StackTrace getStack() {
		return this.stack;
	}
	public void setStack(StackTrace stack) {
		this.stack = stack;
	}
}
