package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.cast.IssueUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class CastIssueUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<IssueUpdatedEvent> {

    public CastIssueUpdatedEventProcessor() {
        super("Cast.issueUpdated", IssueUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(IssueUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Cast.issueUpdated"; }
}
