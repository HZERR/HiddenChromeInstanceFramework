package ru.hzerr.cdp.event.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.page.Viewport;

@Description("Fired when user asks to capture screenshot of some area on the page.")
@Event("screenshotRequested")
public class ScreenshotRequestedEvent {

	@Required
	@Description("Viewport to capture, in device independent pixels (dip).")
	private Viewport viewport;

    public ScreenshotRequestedEvent() {
    }

	public Viewport getViewport() {
		return this.viewport;
	}
	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
}
