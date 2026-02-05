package ru.hzerr.cdp.event.log;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.log.LogEntry;

@Description("Issued when new message was logged.")
@Event("entryAdded")
public class EntryAddedEvent {

	@Required
	@Description("The entry.")
	private LogEntry entry;

    public EntryAddedEvent() {
    }

	public LogEntry getEntry() {
		return this.entry;
	}
	public void setEntry(LogEntry entry) {
		this.entry = entry;
	}
}
