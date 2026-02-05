package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.debugger.PausedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DebuggerPausedEventProcessor extends AbstractChromeInstanceEventProcessor<PausedEvent> {

    public DebuggerPausedEventProcessor() {
        super("Debugger.paused", PausedEvent.class);
    }

    @Override
    protected abstract void onEvent(PausedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Debugger.paused"; }
}
