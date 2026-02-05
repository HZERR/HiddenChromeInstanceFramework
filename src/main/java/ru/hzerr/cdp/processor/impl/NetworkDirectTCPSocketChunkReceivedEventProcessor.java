package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectTCPSocketChunkReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectTCPSocketChunkReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectTCPSocketChunkReceivedEvent> {

    public NetworkDirectTCPSocketChunkReceivedEventProcessor() {
        super("Network.directTCPSocketChunkReceived", DirectTCPSocketChunkReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectTCPSocketChunkReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directTCPSocketChunkReceived"; }
}
