package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectTCPSocketAbortedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectTCPSocketAbortedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectTCPSocketAbortedEvent> {

    public NetworkDirectTCPSocketAbortedEventProcessor() {
        super("Network.directTCPSocketAborted", DirectTCPSocketAbortedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectTCPSocketAbortedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directTCPSocketAborted"; }
}
