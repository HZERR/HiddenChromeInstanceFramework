package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.AffectedByStartingStylesFlagUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMAffectedByStartingStylesFlagUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<AffectedByStartingStylesFlagUpdatedEvent> {

    public DOMAffectedByStartingStylesFlagUpdatedEventProcessor() {
        super("DOM.affectedByStartingStylesFlagUpdated", AffectedByStartingStylesFlagUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(AffectedByStartingStylesFlagUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.affectedByStartingStylesFlagUpdated"; }
}
