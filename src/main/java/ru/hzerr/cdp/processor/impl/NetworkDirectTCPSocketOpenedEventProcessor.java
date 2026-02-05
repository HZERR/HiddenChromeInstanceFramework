package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectTCPSocketOpenedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectTCPSocketOpenedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectTCPSocketOpenedEvent> {

    public NetworkDirectTCPSocketOpenedEventProcessor() {
        super("Network.directTCPSocketOpened", DirectTCPSocketOpenedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectTCPSocketOpenedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directTCPSocketOpened"; }
}
