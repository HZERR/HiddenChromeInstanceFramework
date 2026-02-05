package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.DocumentOpenedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageDocumentOpenedEventProcessor extends AbstractChromeInstanceEventProcessor<DocumentOpenedEvent> {

    public PageDocumentOpenedEventProcessor() {
        super("Page.documentOpened", DocumentOpenedEvent.class);
    }

    @Override
    protected abstract void onEvent(DocumentOpenedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.documentOpened"; }
}
