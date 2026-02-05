package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.profiler.ConsoleProfileFinishedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class ProfilerConsoleProfileFinishedEventProcessor extends AbstractChromeInstanceEventProcessor<ConsoleProfileFinishedEvent> {

    public ProfilerConsoleProfileFinishedEventProcessor() {
        super("Profiler.consoleProfileFinished", ConsoleProfileFinishedEvent.class);
    }

    @Override
    protected abstract void onEvent(ConsoleProfileFinishedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Profiler.consoleProfileFinished"; }
}
