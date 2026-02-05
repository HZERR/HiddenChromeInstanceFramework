package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.audits.IssueAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AuditsIssueAddedEventProcessor extends AbstractChromeInstanceEventProcessor<IssueAddedEvent> {

    public AuditsIssueAddedEventProcessor() {
        super("Audits.issueAdded", IssueAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(IssueAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Audits.issueAdded"; }
}
