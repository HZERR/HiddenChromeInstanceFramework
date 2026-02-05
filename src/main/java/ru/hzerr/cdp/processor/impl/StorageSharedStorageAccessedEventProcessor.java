package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.SharedStorageAccessedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageSharedStorageAccessedEventProcessor extends AbstractChromeInstanceEventProcessor<SharedStorageAccessedEvent> {

    public StorageSharedStorageAccessedEventProcessor() {
        super("Storage.sharedStorageAccessed", SharedStorageAccessedEvent.class);
    }

    @Override
    protected abstract void onEvent(SharedStorageAccessedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.sharedStorageAccessed"; }
}
