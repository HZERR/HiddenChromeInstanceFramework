package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Fired when the page with currently enabled screencast was shown or hidden `.")
@Event("screencastVisibilityChanged")
public class ScreencastVisibilityChangedEvent {

	@Required
	@Description("True if the page is visible.")
	private boolean visible;

    public ScreencastVisibilityChangedEvent() {
    }

	public boolean getVisible() {
		return this.visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
