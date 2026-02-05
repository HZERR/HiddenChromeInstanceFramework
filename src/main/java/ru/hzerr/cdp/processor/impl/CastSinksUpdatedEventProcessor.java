package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.cast.SinksUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class CastSinksUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<SinksUpdatedEvent> {

    public CastSinksUpdatedEventProcessor() {
        super("Cast.sinksUpdated", SinksUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(SinksUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Cast.sinksUpdated"; }
}
