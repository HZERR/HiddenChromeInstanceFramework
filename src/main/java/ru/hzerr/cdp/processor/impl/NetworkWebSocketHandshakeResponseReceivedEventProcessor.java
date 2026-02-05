package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebSocketHandshakeResponseReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebSocketHandshakeResponseReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<WebSocketHandshakeResponseReceivedEvent> {

    public NetworkWebSocketHandshakeResponseReceivedEventProcessor() {
        super("Network.webSocketHandshakeResponseReceived", WebSocketHandshakeResponseReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(WebSocketHandshakeResponseReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webSocketHandshakeResponseReceived"; }
}
