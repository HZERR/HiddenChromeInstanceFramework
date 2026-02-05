package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.profiler.PreciseCoverageDeltaUpdateEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class ProfilerPreciseCoverageDeltaUpdateEventProcessor extends AbstractChromeInstanceEventProcessor<PreciseCoverageDeltaUpdateEvent> {

    public ProfilerPreciseCoverageDeltaUpdateEventProcessor() {
        super("Profiler.preciseCoverageDeltaUpdate", PreciseCoverageDeltaUpdateEvent.class);
    }

    @Override
    protected abstract void onEvent(PreciseCoverageDeltaUpdateEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Profiler.preciseCoverageDeltaUpdate"; }
}
