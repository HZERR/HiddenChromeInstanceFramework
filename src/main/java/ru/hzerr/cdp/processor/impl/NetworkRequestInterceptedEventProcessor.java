package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.RequestInterceptedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkRequestInterceptedEventProcessor extends AbstractChromeInstanceEventProcessor<RequestInterceptedEvent> {

    public NetworkRequestInterceptedEventProcessor() {
        super("Network.requestIntercepted", RequestInterceptedEvent.class);
    }

    @Override
    protected abstract void onEvent(RequestInterceptedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.requestIntercepted"; }
}
