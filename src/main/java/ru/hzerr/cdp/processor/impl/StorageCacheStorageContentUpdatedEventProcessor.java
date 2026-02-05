package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.CacheStorageContentUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageCacheStorageContentUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<CacheStorageContentUpdatedEvent> {

    public StorageCacheStorageContentUpdatedEventProcessor() {
        super("Storage.cacheStorageContentUpdated", CacheStorageContentUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(CacheStorageContentUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.cacheStorageContentUpdated"; }
}
