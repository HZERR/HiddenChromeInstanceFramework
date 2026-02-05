package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.AudioNodeCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioAudioNodeCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<AudioNodeCreatedEvent> {

    public WebAudioAudioNodeCreatedEventProcessor() {
        super("WebAudio.audioNodeCreated", AudioNodeCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(AudioNodeCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.audioNodeCreated"; }
}
