package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.RequestServedFromCacheEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkRequestServedFromCacheEventProcessor extends AbstractChromeInstanceEventProcessor<RequestServedFromCacheEvent> {

    public NetworkRequestServedFromCacheEventProcessor() {
        super("Network.requestServedFromCache", RequestServedFromCacheEvent.class);
    }

    @Override
    protected abstract void onEvent(RequestServedFromCacheEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.requestServedFromCache"; }
}
