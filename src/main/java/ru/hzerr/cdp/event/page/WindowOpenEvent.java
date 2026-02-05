package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Fired when a new window is going to be opened, via window.open(), link click, form submission, etc.")
@Event("windowOpen")
public class WindowOpenEvent {

	@Required
	@Description("The URL for the new window.")
	private String url;

	@Required
	@Description("Window name.")
	private String windowName;

	@Required
	@Description("An array of enabled window features.")
	private String[] windowFeatures;

	@Required
	@Description("Whether or not it was triggered by user gesture.")
	private boolean userGesture;

    public WindowOpenEvent() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getWindowName() {
		return this.windowName;
	}
	public void setWindowName(String windowName) {
		this.windowName = windowName;
	}
	public String[] getWindowFeatures() {
		return this.windowFeatures;
	}
	public void setWindowFeatures(String[] windowFeatures) {
		this.windowFeatures = windowFeatures;
	}
	public boolean getUserGesture() {
		return this.userGesture;
	}
	public void setUserGesture(boolean userGesture) {
		this.userGesture = userGesture;
	}
}
