package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.profiler.ConsoleProfileStartedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class ProfilerConsoleProfileStartedEventProcessor extends AbstractChromeInstanceEventProcessor<ConsoleProfileStartedEvent> {

    public ProfilerConsoleProfileStartedEventProcessor() {
        super("Profiler.consoleProfileStarted", ConsoleProfileStartedEvent.class);
    }

    @Override
    protected abstract void onEvent(ConsoleProfileStartedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Profiler.consoleProfileStarted"; }
}
