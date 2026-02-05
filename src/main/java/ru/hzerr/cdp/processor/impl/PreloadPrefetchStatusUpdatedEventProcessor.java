package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.preload.PrefetchStatusUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PreloadPrefetchStatusUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<PrefetchStatusUpdatedEvent> {

    public PreloadPrefetchStatusUpdatedEventProcessor() {
        super("Preload.prefetchStatusUpdated", PrefetchStatusUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(PrefetchStatusUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Preload.prefetchStatusUpdated"; }
}
