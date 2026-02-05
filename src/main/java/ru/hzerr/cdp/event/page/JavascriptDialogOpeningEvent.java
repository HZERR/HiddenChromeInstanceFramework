package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.")
@Event("javascriptDialogOpening")
public class JavascriptDialogOpeningEvent {

	@Required
	@Description("Frame url.")
	private String url;

	@Experimental
	@Required
	@Description("Frame id.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Message that will be displayed by the dialog.")
	private String message;

	@Required
	@Description("Dialog type.")
	@TypeDescription("Javascript dialog type.")
	private String type;

	@Required
	@Description("True iff browser is capable showing or acting on the given dialog. When browser has no dialog handler for given target, calling alert while Page domain is engaged will stall the page execution. Execution can be resumed via calling Page.handleJavaScriptDialog.")
	private boolean hasBrowserHandler;

	@Description("Default dialog prompt.")
	private String defaultPrompt;

    public JavascriptDialogOpeningEvent() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getHasBrowserHandler() {
		return this.hasBrowserHandler;
	}
	public void setHasBrowserHandler(boolean hasBrowserHandler) {
		this.hasBrowserHandler = hasBrowserHandler;
	}
	public String getDefaultPrompt() {
		return this.defaultPrompt;
	}
	public void setDefaultPrompt(String defaultPrompt) {
		this.defaultPrompt = defaultPrompt;
	}
}
