package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectUDPSocketAbortedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectUDPSocketAbortedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectUDPSocketAbortedEvent> {

    public NetworkDirectUDPSocketAbortedEventProcessor() {
        super("Network.directUDPSocketAborted", DirectUDPSocketAbortedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectUDPSocketAbortedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directUDPSocketAborted"; }
}
