package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.InterestGroupAccessedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageInterestGroupAccessedEventProcessor extends AbstractChromeInstanceEventProcessor<InterestGroupAccessedEvent> {

    public StorageInterestGroupAccessedEventProcessor() {
        super("Storage.interestGroupAccessed", InterestGroupAccessedEvent.class);
    }

    @Override
    protected abstract void onEvent(InterestGroupAccessedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.interestGroupAccessed"; }
}
