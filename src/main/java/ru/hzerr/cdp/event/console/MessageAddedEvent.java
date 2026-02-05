package ru.hzerr.cdp.event.console;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.console.ConsoleMessage;

@Description("Issued when new console message is added.")
@Event("messageAdded")
public class MessageAddedEvent {

	@Required
	@Description("Console message that has been added.")
	private ConsoleMessage message;

    public MessageAddedEvent() {
    }

	public ConsoleMessage getMessage() {
		return this.message;
	}
	public void setMessage(ConsoleMessage message) {
		this.message = message;
	}
}
