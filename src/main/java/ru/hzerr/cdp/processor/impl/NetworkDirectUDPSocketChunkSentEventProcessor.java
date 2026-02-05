package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectUDPSocketChunkSentEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectUDPSocketChunkSentEventProcessor extends AbstractChromeInstanceEventProcessor<DirectUDPSocketChunkSentEvent> {

    public NetworkDirectUDPSocketChunkSentEventProcessor() {
        super("Network.directUDPSocketChunkSent", DirectUDPSocketChunkSentEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectUDPSocketChunkSentEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directUDPSocketChunkSent"; }
}
