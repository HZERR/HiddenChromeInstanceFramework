package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.tracing.TracingCompleteEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TracingCompleteEventProcessor extends AbstractChromeInstanceEventProcessor<TracingCompleteEvent> {

    public TracingCompleteEventProcessor() {
        super("Tracing.tracingComplete", TracingCompleteEvent.class);
    }

    @Override
    protected abstract void onEvent(TracingCompleteEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Tracing.tracingComplete"; }
}
