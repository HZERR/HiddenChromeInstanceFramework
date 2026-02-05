package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectTCPSocketClosedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectTCPSocketClosedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectTCPSocketClosedEvent> {

    public NetworkDirectTCPSocketClosedEventProcessor() {
        super("Network.directTCPSocketClosed", DirectTCPSocketClosedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectTCPSocketClosedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directTCPSocketClosed"; }
}
