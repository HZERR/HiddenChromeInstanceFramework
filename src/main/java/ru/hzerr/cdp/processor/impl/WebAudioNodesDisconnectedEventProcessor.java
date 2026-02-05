package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.NodesDisconnectedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioNodesDisconnectedEventProcessor extends AbstractChromeInstanceEventProcessor<NodesDisconnectedEvent> {

    public WebAudioNodesDisconnectedEventProcessor() {
        super("WebAudio.nodesDisconnected", NodesDisconnectedEvent.class);
    }

    @Override
    protected abstract void onEvent(NodesDisconnectedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.nodesDisconnected"; }
}
