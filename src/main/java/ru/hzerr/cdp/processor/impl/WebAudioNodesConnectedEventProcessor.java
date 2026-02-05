package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.NodesConnectedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioNodesConnectedEventProcessor extends AbstractChromeInstanceEventProcessor<NodesConnectedEvent> {

    public WebAudioNodesConnectedEventProcessor() {
        super("WebAudio.nodesConnected", NodesConnectedEvent.class);
    }

    @Override
    protected abstract void onEvent(NodesConnectedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.nodesConnected"; }
}
