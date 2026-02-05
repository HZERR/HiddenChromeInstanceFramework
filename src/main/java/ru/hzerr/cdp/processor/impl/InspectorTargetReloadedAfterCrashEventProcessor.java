package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.inspector.TargetReloadedAfterCrashEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class InspectorTargetReloadedAfterCrashEventProcessor extends AbstractChromeInstanceEventProcessor<TargetReloadedAfterCrashEvent> {

    public InspectorTargetReloadedAfterCrashEventProcessor() {
        super("Inspector.targetReloadedAfterCrash", TargetReloadedAfterCrashEvent.class);
    }

    @Override
    protected abstract void onEvent(TargetReloadedAfterCrashEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Inspector.targetReloadedAfterCrash"; }
}
