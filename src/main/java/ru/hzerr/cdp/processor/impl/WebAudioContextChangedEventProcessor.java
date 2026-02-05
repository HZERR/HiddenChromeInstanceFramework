package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.ContextChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioContextChangedEventProcessor extends AbstractChromeInstanceEventProcessor<ContextChangedEvent> {

    public WebAudioContextChangedEventProcessor() {
        super("WebAudio.contextChanged", ContextChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(ContextChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.contextChanged"; }
}
