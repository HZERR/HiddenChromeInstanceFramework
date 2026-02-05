package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectUDPSocketClosedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectUDPSocketClosedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectUDPSocketClosedEvent> {

    public NetworkDirectUDPSocketClosedEventProcessor() {
        super("Network.directUDPSocketClosed", DirectUDPSocketClosedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectUDPSocketClosedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directUDPSocketClosed"; }
}
