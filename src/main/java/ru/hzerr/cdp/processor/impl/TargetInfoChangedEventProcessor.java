package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.target.TargetInfoChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TargetInfoChangedEventProcessor extends AbstractChromeInstanceEventProcessor<TargetInfoChangedEvent> {

    public TargetInfoChangedEventProcessor() {
        super("Target.targetInfoChanged", TargetInfoChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(TargetInfoChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Target.targetInfoChanged"; }
}
