package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.overlay.InspectModeCanceledEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class OverlayInspectModeCanceledEventProcessor extends AbstractChromeInstanceEventProcessor<InspectModeCanceledEvent> {

    public OverlayInspectModeCanceledEventProcessor() {
        super("Overlay.inspectModeCanceled", InspectModeCanceledEvent.class);
    }

    @Override
    protected abstract void onEvent(InspectModeCanceledEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Overlay.inspectModeCanceled"; }
}
