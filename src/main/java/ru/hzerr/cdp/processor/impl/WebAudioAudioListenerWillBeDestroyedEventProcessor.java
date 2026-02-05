package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.AudioListenerWillBeDestroyedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioAudioListenerWillBeDestroyedEventProcessor extends AbstractChromeInstanceEventProcessor<AudioListenerWillBeDestroyedEvent> {

    public WebAudioAudioListenerWillBeDestroyedEventProcessor() {
        super("WebAudio.audioListenerWillBeDestroyed", AudioListenerWillBeDestroyedEvent.class);
    }

    @Override
    protected abstract void onEvent(AudioListenerWillBeDestroyedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.audioListenerWillBeDestroyed"; }
}
