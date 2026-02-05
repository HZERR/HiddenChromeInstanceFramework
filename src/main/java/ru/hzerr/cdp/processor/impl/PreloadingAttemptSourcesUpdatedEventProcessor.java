package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.preload.PreloadingAttemptSourcesUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PreloadingAttemptSourcesUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<PreloadingAttemptSourcesUpdatedEvent> {

    public PreloadingAttemptSourcesUpdatedEventProcessor() {
        super("Preload.preloadingAttemptSourcesUpdated", PreloadingAttemptSourcesUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(PreloadingAttemptSourcesUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Preload.preloadingAttemptSourcesUpdated"; }
}
