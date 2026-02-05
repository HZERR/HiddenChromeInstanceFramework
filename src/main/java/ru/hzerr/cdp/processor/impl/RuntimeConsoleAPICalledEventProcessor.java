package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.ConsoleAPICalledEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeConsoleAPICalledEventProcessor extends AbstractChromeInstanceEventProcessor<ConsoleAPICalledEvent> {

    public RuntimeConsoleAPICalledEventProcessor() {
        super("Runtime.consoleAPICalled", ConsoleAPICalledEvent.class);
    }

    @Override
    protected abstract void onEvent(ConsoleAPICalledEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.consoleAPICalled"; }
}
