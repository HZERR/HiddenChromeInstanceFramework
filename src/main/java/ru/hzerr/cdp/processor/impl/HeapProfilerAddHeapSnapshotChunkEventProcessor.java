package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.heapProfiler.AddHeapSnapshotChunkEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class HeapProfilerAddHeapSnapshotChunkEventProcessor extends AbstractChromeInstanceEventProcessor<AddHeapSnapshotChunkEvent> {

    public HeapProfilerAddHeapSnapshotChunkEventProcessor() {
        super("HeapProfiler.addHeapSnapshotChunk", AddHeapSnapshotChunkEvent.class);
    }

    @Override
    protected abstract void onEvent(AddHeapSnapshotChunkEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "HeapProfiler.addHeapSnapshotChunk"; }
}
