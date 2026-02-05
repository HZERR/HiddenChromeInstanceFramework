package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.inspector.TargetCrashedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class InspectorTargetCrashedEventProcessor extends AbstractChromeInstanceEventProcessor<TargetCrashedEvent> {

    public InspectorTargetCrashedEventProcessor() {
        super("Inspector.targetCrashed", TargetCrashedEvent.class);
    }

    @Override
    protected abstract void onEvent(TargetCrashedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Inspector.targetCrashed"; }
}
