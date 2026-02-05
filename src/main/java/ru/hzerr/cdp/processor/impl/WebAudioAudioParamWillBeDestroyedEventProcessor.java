package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.AudioParamWillBeDestroyedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioAudioParamWillBeDestroyedEventProcessor extends AbstractChromeInstanceEventProcessor<AudioParamWillBeDestroyedEvent> {

    public WebAudioAudioParamWillBeDestroyedEventProcessor() {
        super("WebAudio.audioParamWillBeDestroyed", AudioParamWillBeDestroyedEvent.class);
    }

    @Override
    protected abstract void onEvent(AudioParamWillBeDestroyedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.audioParamWillBeDestroyed"; }
}
