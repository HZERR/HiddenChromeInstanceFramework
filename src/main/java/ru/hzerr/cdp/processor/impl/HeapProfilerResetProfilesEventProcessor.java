package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.heapProfiler.ResetProfilesEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class HeapProfilerResetProfilesEventProcessor extends AbstractChromeInstanceEventProcessor<ResetProfilesEvent> {

    public HeapProfilerResetProfilesEventProcessor() {
        super("HeapProfiler.resetProfiles", ResetProfilesEvent.class);
    }

    @Override
    protected abstract void onEvent(ResetProfilesEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "HeapProfiler.resetProfiles"; }
}
