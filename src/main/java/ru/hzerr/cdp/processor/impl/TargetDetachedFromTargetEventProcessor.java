package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.target.DetachedFromTargetEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TargetDetachedFromTargetEventProcessor extends AbstractChromeInstanceEventProcessor<DetachedFromTargetEvent> {

    public TargetDetachedFromTargetEventProcessor() {
        super("Target.detachedFromTarget", DetachedFromTargetEvent.class);
    }

    @Override
    protected abstract void onEvent(DetachedFromTargetEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Target.detachedFromTarget"; }
}
