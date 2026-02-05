package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.ExceptionThrownEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeExceptionThrownEventProcessor extends AbstractChromeInstanceEventProcessor<ExceptionThrownEvent> {

    public RuntimeExceptionThrownEventProcessor() {
        super("Runtime.exceptionThrown", ExceptionThrownEvent.class);
    }

    @Override
    protected abstract void onEvent(ExceptionThrownEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.exceptionThrown"; }
}
