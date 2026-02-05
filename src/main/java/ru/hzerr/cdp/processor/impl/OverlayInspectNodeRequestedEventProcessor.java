package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.overlay.InspectNodeRequestedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class OverlayInspectNodeRequestedEventProcessor extends AbstractChromeInstanceEventProcessor<InspectNodeRequestedEvent> {

    public OverlayInspectNodeRequestedEventProcessor() {
        super("Overlay.inspectNodeRequested", InspectNodeRequestedEvent.class);
    }

    @Override
    protected abstract void onEvent(InspectNodeRequestedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Overlay.inspectNodeRequested"; }
}
