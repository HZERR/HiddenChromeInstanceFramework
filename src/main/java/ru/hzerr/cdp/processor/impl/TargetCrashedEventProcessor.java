package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.target.TargetCrashedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TargetCrashedEventProcessor extends AbstractChromeInstanceEventProcessor<TargetCrashedEvent> {

    public TargetCrashedEventProcessor() {
        super("Target.targetCrashed", TargetCrashedEvent.class);
    }

    @Override
    protected abstract void onEvent(TargetCrashedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Target.targetCrashed"; }
}
