package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebTransportClosedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebTransportClosedEventProcessor extends AbstractChromeInstanceEventProcessor<WebTransportClosedEvent> {

    public NetworkWebTransportClosedEventProcessor() {
        super("Network.webTransportClosed", WebTransportClosedEvent.class);
    }

    @Override
    protected abstract void onEvent(WebTransportClosedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webTransportClosed"; }
}
