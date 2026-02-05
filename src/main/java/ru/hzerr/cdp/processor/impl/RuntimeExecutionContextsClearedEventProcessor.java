package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.ExecutionContextsClearedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeExecutionContextsClearedEventProcessor extends AbstractChromeInstanceEventProcessor<ExecutionContextsClearedEvent> {

    public RuntimeExecutionContextsClearedEventProcessor() {
        super("Runtime.executionContextsCleared", ExecutionContextsClearedEvent.class);
    }

    @Override
    protected abstract void onEvent(ExecutionContextsClearedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.executionContextsCleared"; }
}
