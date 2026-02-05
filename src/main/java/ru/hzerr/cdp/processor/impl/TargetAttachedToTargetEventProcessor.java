package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.target.AttachedToTargetEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TargetAttachedToTargetEventProcessor extends AbstractChromeInstanceEventProcessor<AttachedToTargetEvent> {

    public TargetAttachedToTargetEventProcessor() {
        super("Target.attachedToTarget", AttachedToTargetEvent.class);
    }

    @Override
    protected abstract void onEvent(AttachedToTargetEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Target.attachedToTarget"; }
}
