package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.heapProfiler.LastSeenObjectIdEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class HeapProfilerLastSeenObjectIdEventProcessor extends AbstractChromeInstanceEventProcessor<LastSeenObjectIdEvent> {

    public HeapProfilerLastSeenObjectIdEventProcessor() {
        super("HeapProfiler.lastSeenObjectId", LastSeenObjectIdEvent.class);
    }

    @Override
    protected abstract void onEvent(LastSeenObjectIdEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "HeapProfiler.lastSeenObjectId"; }
}
