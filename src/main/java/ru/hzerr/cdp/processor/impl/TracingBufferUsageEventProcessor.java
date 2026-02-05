package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.tracing.BufferUsageEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TracingBufferUsageEventProcessor extends AbstractChromeInstanceEventProcessor<BufferUsageEvent> {

    public TracingBufferUsageEventProcessor() {
        super("Tracing.bufferUsage", BufferUsageEvent.class);
    }

    @Override
    protected abstract void onEvent(BufferUsageEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Tracing.bufferUsage"; }
}
