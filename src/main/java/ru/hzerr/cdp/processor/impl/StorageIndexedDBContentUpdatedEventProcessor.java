package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.IndexedDBContentUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageIndexedDBContentUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<IndexedDBContentUpdatedEvent> {

    public StorageIndexedDBContentUpdatedEventProcessor() {
        super("Storage.indexedDBContentUpdated", IndexedDBContentUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(IndexedDBContentUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.indexedDBContentUpdated"; }
}
