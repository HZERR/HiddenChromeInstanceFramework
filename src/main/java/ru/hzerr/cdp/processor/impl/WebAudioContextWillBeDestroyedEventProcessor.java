package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAudio.ContextWillBeDestroyedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAudioContextWillBeDestroyedEventProcessor extends AbstractChromeInstanceEventProcessor<ContextWillBeDestroyedEvent> {

    public WebAudioContextWillBeDestroyedEventProcessor() {
        super("WebAudio.contextWillBeDestroyed", ContextWillBeDestroyedEvent.class);
    }

    @Override
    protected abstract void onEvent(ContextWillBeDestroyedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAudio.contextWillBeDestroyed"; }
}
