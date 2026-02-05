package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebTransportConnectionEstablishedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebTransportConnectionEstablishedEventProcessor extends AbstractChromeInstanceEventProcessor<WebTransportConnectionEstablishedEvent> {

    public NetworkWebTransportConnectionEstablishedEventProcessor() {
        super("Network.webTransportConnectionEstablished", WebTransportConnectionEstablishedEvent.class);
    }

    @Override
    protected abstract void onEvent(WebTransportConnectionEstablishedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webTransportConnectionEstablished"; }
}
