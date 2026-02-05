package ru.hzerr.cdp.event.fedCm;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Triggered when a dialog is closed, either by user action, JS abort, or a command below.")
@Event("dialogClosed")
public class DialogClosedEvent {

	@Required
	private String dialogId;

    public DialogClosedEvent() {
    }

	public String getDialogId() {
		return this.dialogId;
	}
	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}
}
