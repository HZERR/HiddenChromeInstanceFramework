package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.page.Frame;

@Experimental
@Description("Fired when opening document to write to.")
@Event("documentOpened")
public class DocumentOpenedEvent {

	@Required
	@Description("Frame object.")
	private Frame frame;

    public DocumentOpenedEvent() {
    }

	public Frame getFrame() {
		return this.frame;
	}
	public void setFrame(Frame frame) {
		this.frame = frame;
	}
}
