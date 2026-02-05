package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.DocumentUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMDocumentUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<DocumentUpdatedEvent> {

    public DOMDocumentUpdatedEventProcessor() {
        super("DOM.documentUpdated", DocumentUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(DocumentUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.documentUpdated"; }
}
