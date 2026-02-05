package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.preload.RuleSetRemovedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PreloadRuleSetRemovedEventProcessor extends AbstractChromeInstanceEventProcessor<RuleSetRemovedEvent> {

    public PreloadRuleSetRemovedEventProcessor() {
        super("Preload.ruleSetRemoved", RuleSetRemovedEvent.class);
    }

    @Override
    protected abstract void onEvent(RuleSetRemovedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Preload.ruleSetRemoved"; }
}
