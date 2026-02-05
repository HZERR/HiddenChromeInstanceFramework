package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.IndexedDBListUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageIndexedDBListUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<IndexedDBListUpdatedEvent> {

    public StorageIndexedDBListUpdatedEventProcessor() {
        super("Storage.indexedDBListUpdated", IndexedDBListUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(IndexedDBListUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.indexedDBListUpdated"; }
}
