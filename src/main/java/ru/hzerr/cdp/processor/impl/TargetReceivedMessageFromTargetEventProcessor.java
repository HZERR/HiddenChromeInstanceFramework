package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.target.ReceivedMessageFromTargetEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TargetReceivedMessageFromTargetEventProcessor extends AbstractChromeInstanceEventProcessor<ReceivedMessageFromTargetEvent> {

    public TargetReceivedMessageFromTargetEventProcessor() {
        super("Target.receivedMessageFromTarget", ReceivedMessageFromTargetEvent.class);
    }

    @Override
    protected abstract void onEvent(ReceivedMessageFromTargetEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Target.receivedMessageFromTarget"; }
}
