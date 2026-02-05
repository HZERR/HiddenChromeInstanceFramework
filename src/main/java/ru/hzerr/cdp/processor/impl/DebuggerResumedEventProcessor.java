package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.debugger.ResumedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DebuggerResumedEventProcessor extends AbstractChromeInstanceEventProcessor<ResumedEvent> {

    public DebuggerResumedEventProcessor() {
        super("Debugger.resumed", ResumedEvent.class);
    }

    @Override
    protected abstract void onEvent(ResumedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Debugger.resumed"; }
}
