package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.debugger.ScriptParsedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DebuggerScriptParsedEventProcessor extends AbstractChromeInstanceEventProcessor<ScriptParsedEvent> {

    public DebuggerScriptParsedEventProcessor() {
        super("Debugger.scriptParsed", ScriptParsedEvent.class);
    }

    @Override
    protected abstract void onEvent(ScriptParsedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Debugger.scriptParsed"; }
}
