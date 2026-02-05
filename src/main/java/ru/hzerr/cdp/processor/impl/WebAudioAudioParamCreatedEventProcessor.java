package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.AudioParamCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioAudioParamCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<AudioParamCreatedEvent> {

    public WebAudioAudioParamCreatedEventProcessor() {
        super("WebAudio.audioParamCreated", AudioParamCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(AudioParamCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.audioParamCreated"; }
}
