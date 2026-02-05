package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.NavigatedWithinDocumentEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageNavigatedWithinDocumentEventProcessor extends AbstractChromeInstanceEventProcessor<NavigatedWithinDocumentEvent> {

    public PageNavigatedWithinDocumentEventProcessor() {
        super("Page.navigatedWithinDocument", NavigatedWithinDocumentEvent.class);
    }

    @Override
    protected abstract void onEvent(NavigatedWithinDocumentEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.navigatedWithinDocument"; }
}
