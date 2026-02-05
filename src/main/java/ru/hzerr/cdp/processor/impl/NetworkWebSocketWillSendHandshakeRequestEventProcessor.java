package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebSocketWillSendHandshakeRequestEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebSocketWillSendHandshakeRequestEventProcessor extends AbstractChromeInstanceEventProcessor<WebSocketWillSendHandshakeRequestEvent> {

    public NetworkWebSocketWillSendHandshakeRequestEventProcessor() {
        super("Network.webSocketWillSendHandshakeRequest", WebSocketWillSendHandshakeRequestEvent.class);
    }

    @Override
    protected abstract void onEvent(WebSocketWillSendHandshakeRequestEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webSocketWillSendHandshakeRequest"; }
}
