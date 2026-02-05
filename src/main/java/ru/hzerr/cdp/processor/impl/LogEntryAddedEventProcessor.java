package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.log.EntryAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class LogEntryAddedEventProcessor extends AbstractChromeInstanceEventProcessor<EntryAddedEvent> {

    public LogEntryAddedEventProcessor() {
        super("Log.entryAdded", EntryAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(EntryAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Log.entryAdded"; }
}
