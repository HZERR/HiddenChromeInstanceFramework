package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectTCPSocketCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectTCPSocketCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectTCPSocketCreatedEvent> {

    public NetworkDirectTCPSocketCreatedEventProcessor() {
        super("Network.directTCPSocketCreated", DirectTCPSocketCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectTCPSocketCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directTCPSocketCreated"; }
}
