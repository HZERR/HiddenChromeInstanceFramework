package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebTransportCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebTransportCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<WebTransportCreatedEvent> {

    public NetworkWebTransportCreatedEventProcessor() {
        super("Network.webTransportCreated", WebTransportCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(WebTransportCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webTransportCreated"; }
}
