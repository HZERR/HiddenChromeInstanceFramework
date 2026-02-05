package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.page.Frame;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired once navigation of the frame has completed. Frame is now associated with the new loader.")
@Event("frameNavigated")
public class FrameNavigatedEvent {

	@Required
	@Description("Frame object.")
	private Frame frame;

	@Experimental
	@Required
	@TypeExperimental
	@TypeDescription("The type of a frameNavigated event.")
	private String type;

    public FrameNavigatedEvent() {
    }

	public Frame getFrame() {
		return this.frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
