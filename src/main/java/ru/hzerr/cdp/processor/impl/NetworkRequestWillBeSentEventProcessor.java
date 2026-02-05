package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.RequestWillBeSentEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkRequestWillBeSentEventProcessor extends AbstractChromeInstanceEventProcessor<RequestWillBeSentEvent> {

    public NetworkRequestWillBeSentEventProcessor() {
        super("Network.requestWillBeSent", RequestWillBeSentEvent.class);
    }

    @Override
    protected abstract void onEvent(RequestWillBeSentEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.requestWillBeSent"; }
}
