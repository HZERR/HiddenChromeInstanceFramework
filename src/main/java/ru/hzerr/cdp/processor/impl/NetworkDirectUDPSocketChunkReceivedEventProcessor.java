package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectUDPSocketChunkReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectUDPSocketChunkReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectUDPSocketChunkReceivedEvent> {

    public NetworkDirectUDPSocketChunkReceivedEventProcessor() {
        super("Network.directUDPSocketChunkReceived", DirectUDPSocketChunkReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectUDPSocketChunkReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directUDPSocketChunkReceived"; }
}
