package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectTCPSocketChunkSentEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectTCPSocketChunkSentEventProcessor extends AbstractChromeInstanceEventProcessor<DirectTCPSocketChunkSentEvent> {

    public NetworkDirectTCPSocketChunkSentEventProcessor() {
        super("Network.directTCPSocketChunkSent", DirectTCPSocketChunkSentEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectTCPSocketChunkSentEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directTCPSocketChunkSent"; }
}
