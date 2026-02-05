package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.tethering.AcceptedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TetheringAcceptedEventProcessor extends AbstractChromeInstanceEventProcessor<AcceptedEvent> {

    public TetheringAcceptedEventProcessor() {
        super("Tethering.accepted", AcceptedEvent.class);
    }

    @Override
    protected abstract void onEvent(AcceptedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Tethering.accepted"; }
}
