package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.StorageBucketCreatedOrUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageBucketCreatedOrUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<StorageBucketCreatedOrUpdatedEvent> {

    public StorageBucketCreatedOrUpdatedEventProcessor() {
        super("Storage.storageBucketCreatedOrUpdated", StorageBucketCreatedOrUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(StorageBucketCreatedOrUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.storageBucketCreatedOrUpdated"; }
}
