package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.heapProfiler.ReportHeapSnapshotProgressEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class HeapProfilerReportHeapSnapshotProgressEventProcessor extends AbstractChromeInstanceEventProcessor<ReportHeapSnapshotProgressEvent> {

    public HeapProfilerReportHeapSnapshotProgressEventProcessor() {
        super("HeapProfiler.reportHeapSnapshotProgress", ReportHeapSnapshotProgressEvent.class);
    }

    @Override
    protected abstract void onEvent(ReportHeapSnapshotProgressEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "HeapProfiler.reportHeapSnapshotProgress"; }
}
