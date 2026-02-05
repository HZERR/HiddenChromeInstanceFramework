package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.target.TargetCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TargetCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<TargetCreatedEvent> {

    public TargetCreatedEventProcessor() {
        super("Target.targetCreated", TargetCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(TargetCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Target.targetCreated"; }
}
