package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebSocketCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebSocketCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<WebSocketCreatedEvent> {

    public NetworkWebSocketCreatedEventProcessor() {
        super("Network.webSocketCreated", WebSocketCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(WebSocketCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webSocketCreated"; }
}
