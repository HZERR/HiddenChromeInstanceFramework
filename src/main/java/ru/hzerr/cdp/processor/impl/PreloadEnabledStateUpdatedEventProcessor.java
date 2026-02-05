package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.preload.PreloadEnabledStateUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PreloadEnabledStateUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<PreloadEnabledStateUpdatedEvent> {

    public PreloadEnabledStateUpdatedEventProcessor() {
        super("Preload.preloadEnabledStateUpdated", PreloadEnabledStateUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(PreloadEnabledStateUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Preload.preloadEnabledStateUpdated"; }
}
