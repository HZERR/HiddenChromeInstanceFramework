package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.InterestGroupAuctionEventOccurredEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageInterestGroupAuctionEventOccurredEventProcessor extends AbstractChromeInstanceEventProcessor<InterestGroupAuctionEventOccurredEvent> {

    public StorageInterestGroupAuctionEventOccurredEventProcessor() {
        super("Storage.interestGroupAuctionEventOccurred", InterestGroupAuctionEventOccurredEvent.class);
    }

    @Override
    protected abstract void onEvent(InterestGroupAuctionEventOccurredEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.interestGroupAuctionEventOccurred"; }
}
