package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.StorageBucketDeletedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageBucketDeletedEventProcessor extends AbstractChromeInstanceEventProcessor<StorageBucketDeletedEvent> {

    public StorageBucketDeletedEventProcessor() {
        super("Storage.storageBucketDeleted", StorageBucketDeletedEvent.class);
    }

    @Override
    protected abstract void onEvent(StorageBucketDeletedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.storageBucketDeleted"; }
}
