package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.NodeParamConnectedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioNodeParamConnectedEventProcessor extends AbstractChromeInstanceEventProcessor<NodeParamConnectedEvent> {

    public WebAudioNodeParamConnectedEventProcessor() {
        super("WebAudio.nodeParamConnected", NodeParamConnectedEvent.class);
    }

    @Override
    protected abstract void onEvent(NodeParamConnectedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.nodeParamConnected"; }
}
