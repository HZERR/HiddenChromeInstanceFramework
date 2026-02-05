package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.debugger.BreakpointResolvedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

@Deprecated
public abstract class DebuggerBreakpointResolvedEventProcessor extends AbstractChromeInstanceEventProcessor<BreakpointResolvedEvent> {

    public DebuggerBreakpointResolvedEventProcessor() {
        super("Debugger.breakpointResolved", BreakpointResolvedEvent.class);
    }

    @Override
    protected abstract void onEvent(BreakpointResolvedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Debugger.breakpointResolved"; }
}
