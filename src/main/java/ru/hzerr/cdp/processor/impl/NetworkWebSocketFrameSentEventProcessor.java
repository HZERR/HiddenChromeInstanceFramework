package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebSocketFrameSentEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebSocketFrameSentEventProcessor extends AbstractChromeInstanceEventProcessor<WebSocketFrameSentEvent> {

    public NetworkWebSocketFrameSentEventProcessor() {
        super("Network.webSocketFrameSent", WebSocketFrameSentEvent.class);
    }

    @Override
    protected abstract void onEvent(WebSocketFrameSentEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webSocketFrameSent"; }
}
