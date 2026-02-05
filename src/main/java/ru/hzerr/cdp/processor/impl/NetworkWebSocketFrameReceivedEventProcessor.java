package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebSocketFrameReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebSocketFrameReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<WebSocketFrameReceivedEvent> {

    public NetworkWebSocketFrameReceivedEventProcessor() {
        super("Network.webSocketFrameReceived", WebSocketFrameReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(WebSocketFrameReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webSocketFrameReceived"; }
}
