package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.heapProfiler.HeapStatsUpdateEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class HeapProfilerHeapStatsUpdateEventProcessor extends AbstractChromeInstanceEventProcessor<HeapStatsUpdateEvent> {

    public HeapProfilerHeapStatsUpdateEventProcessor() {
        super("HeapProfiler.heapStatsUpdate", HeapStatsUpdateEvent.class);
    }

    @Override
    protected abstract void onEvent(HeapStatsUpdateEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "HeapProfiler.heapStatsUpdate"; }
}
