package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.AudioNodeWillBeDestroyedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioAudioNodeWillBeDestroyedEventProcessor extends AbstractChromeInstanceEventProcessor<AudioNodeWillBeDestroyedEvent> {

    public WebAudioAudioNodeWillBeDestroyedEventProcessor() {
        super("WebAudio.audioNodeWillBeDestroyed", AudioNodeWillBeDestroyedEvent.class);
    }

    @Override
    protected abstract void onEvent(AudioNodeWillBeDestroyedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.audioNodeWillBeDestroyed"; }
}
