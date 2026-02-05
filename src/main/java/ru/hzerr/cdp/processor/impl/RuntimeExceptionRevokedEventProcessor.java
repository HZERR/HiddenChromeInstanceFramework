package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.ExceptionRevokedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeExceptionRevokedEventProcessor extends AbstractChromeInstanceEventProcessor<ExceptionRevokedEvent> {

    public RuntimeExceptionRevokedEventProcessor() {
        super("Runtime.exceptionRevoked", ExceptionRevokedEvent.class);
    }

    @Override
    protected abstract void onEvent(ExceptionRevokedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.exceptionRevoked"; }
}
