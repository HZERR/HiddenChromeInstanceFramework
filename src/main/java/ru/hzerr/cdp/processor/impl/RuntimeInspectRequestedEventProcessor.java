package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.InspectRequestedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeInspectRequestedEventProcessor extends AbstractChromeInstanceEventProcessor<InspectRequestedEvent> {

    public RuntimeInspectRequestedEventProcessor() {
        super("Runtime.inspectRequested", InspectRequestedEvent.class);
    }

    @Override
    protected abstract void onEvent(InspectRequestedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.inspectRequested"; }
}
