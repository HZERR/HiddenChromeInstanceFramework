package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.ExecutionContextCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeExecutionContextCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<ExecutionContextCreatedEvent> {

    public RuntimeExecutionContextCreatedEventProcessor() {
        super("Runtime.executionContextCreated", ExecutionContextCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(ExecutionContextCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.executionContextCreated"; }
}
