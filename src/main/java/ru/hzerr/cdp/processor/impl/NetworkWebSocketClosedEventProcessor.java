package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebSocketClosedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebSocketClosedEventProcessor extends AbstractChromeInstanceEventProcessor<WebSocketClosedEvent> {

    public NetworkWebSocketClosedEventProcessor() {
        super("Network.webSocketClosed", WebSocketClosedEvent.class);
    }

    @Override
    protected abstract void onEvent(WebSocketClosedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webSocketClosed"; }
}
