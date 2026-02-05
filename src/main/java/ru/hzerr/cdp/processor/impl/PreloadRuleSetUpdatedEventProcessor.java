package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.preload.RuleSetUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PreloadRuleSetUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<RuleSetUpdatedEvent> {

    public PreloadRuleSetUpdatedEventProcessor() {
        super("Preload.ruleSetUpdated", RuleSetUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(RuleSetUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Preload.ruleSetUpdated"; }
}
