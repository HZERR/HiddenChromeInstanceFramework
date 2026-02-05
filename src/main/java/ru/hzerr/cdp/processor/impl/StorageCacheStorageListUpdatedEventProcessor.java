package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.CacheStorageListUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageCacheStorageListUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<CacheStorageListUpdatedEvent> {

    public StorageCacheStorageListUpdatedEventProcessor() {
        super("Storage.cacheStorageListUpdated", CacheStorageListUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(CacheStorageListUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.cacheStorageListUpdated"; }
}
