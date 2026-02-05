package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.")
@Event("javascriptDialogClosed")
public class JavascriptDialogClosedEvent {

	@Experimental
	@Required
	@Description("Frame id.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Whether dialog was confirmed.")
	private boolean result;

	@Required
	@Description("User input in case of prompt.")
	private String userInput;

    public JavascriptDialogClosedEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public boolean getResult() {
		return this.result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getUserInput() {
		return this.userInput;
	}
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
}
