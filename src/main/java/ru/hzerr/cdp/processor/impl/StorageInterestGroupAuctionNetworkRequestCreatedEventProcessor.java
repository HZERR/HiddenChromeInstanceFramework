package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.InterestGroupAuctionNetworkRequestCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageInterestGroupAuctionNetworkRequestCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<InterestGroupAuctionNetworkRequestCreatedEvent> {

    public StorageInterestGroupAuctionNetworkRequestCreatedEventProcessor() {
        super("Storage.interestGroupAuctionNetworkRequestCreated", InterestGroupAuctionNetworkRequestCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(InterestGroupAuctionNetworkRequestCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.interestGroupAuctionNetworkRequestCreated"; }
}
