package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.ExecutionContextDestroyedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeExecutionContextDestroyedEventProcessor extends AbstractChromeInstanceEventProcessor<ExecutionContextDestroyedEvent> {

    public RuntimeExecutionContextDestroyedEventProcessor() {
        super("Runtime.executionContextDestroyed", ExecutionContextDestroyedEvent.class);
    }

    @Override
    protected abstract void onEvent(ExecutionContextDestroyedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.executionContextDestroyed"; }
}
