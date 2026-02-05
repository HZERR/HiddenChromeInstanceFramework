package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.SharedStorageWorkletOperationExecutionFinishedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageSharedStorageWorkletOperationExecutionFinishedEventProcessor extends AbstractChromeInstanceEventProcessor<SharedStorageWorkletOperationExecutionFinishedEvent> {

    public StorageSharedStorageWorkletOperationExecutionFinishedEventProcessor() {
        super("Storage.sharedStorageWorkletOperationExecutionFinished", SharedStorageWorkletOperationExecutionFinishedEvent.class);
    }

    @Override
    protected abstract void onEvent(SharedStorageWorkletOperationExecutionFinishedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.sharedStorageWorkletOperationExecutionFinished"; }
}
