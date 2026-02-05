package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.NodeParamDisconnectedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioNodeParamDisconnectedEventProcessor extends AbstractChromeInstanceEventProcessor<NodeParamDisconnectedEvent> {

    public WebAudioNodeParamDisconnectedEventProcessor() {
        super("WebAudio.nodeParamDisconnected", NodeParamDisconnectedEvent.class);
    }

    @Override
    protected abstract void onEvent(NodeParamDisconnectedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.nodeParamDisconnected"; }
}
