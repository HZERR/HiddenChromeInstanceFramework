package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.preload.PrerenderStatusUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PreloadPrerenderStatusUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<PrerenderStatusUpdatedEvent> {

    public PreloadPrerenderStatusUpdatedEventProcessor() {
        super("Preload.prerenderStatusUpdated", PrerenderStatusUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(PrerenderStatusUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Preload.prerenderStatusUpdated"; }
}
