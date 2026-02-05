package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.WebSocketFrameErrorEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkWebSocketFrameErrorEventProcessor extends AbstractChromeInstanceEventProcessor<WebSocketFrameErrorEvent> {

    public NetworkWebSocketFrameErrorEventProcessor() {
        super("Network.webSocketFrameError", WebSocketFrameErrorEvent.class);
    }

    @Override
    protected abstract void onEvent(WebSocketFrameErrorEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.webSocketFrameError"; }
}
