package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.debugger.ScriptFailedToParseEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DebuggerScriptFailedToParseEventProcessor extends AbstractChromeInstanceEventProcessor<ScriptFailedToParseEvent> {

    public DebuggerScriptFailedToParseEventProcessor() {
        super("Debugger.scriptFailedToParse", ScriptFailedToParseEvent.class);
    }

    @Override
    protected abstract void onEvent(ScriptFailedToParseEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Debugger.scriptFailedToParse"; }
}
