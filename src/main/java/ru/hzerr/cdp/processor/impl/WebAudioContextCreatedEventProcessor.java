package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.ContextCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioContextCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<ContextCreatedEvent> {

    public WebAudioContextCreatedEventProcessor() {
        super("WebAudio.contextCreated", ContextCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(ContextCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.contextCreated"; }
}
