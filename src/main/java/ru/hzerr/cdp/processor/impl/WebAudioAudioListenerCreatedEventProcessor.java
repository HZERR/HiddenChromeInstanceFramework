package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.AudioListenerCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioAudioListenerCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<AudioListenerCreatedEvent> {

    public WebAudioAudioListenerCreatedEventProcessor() {
        super("WebAudio.audioListenerCreated", AudioListenerCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(AudioListenerCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.audioListenerCreated"; }
}
