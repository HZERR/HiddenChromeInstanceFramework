package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.ChildNodeInsertedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMChildNodeInsertedEventProcessor extends AbstractChromeInstanceEventProcessor<ChildNodeInsertedEvent> {

    public DOMChildNodeInsertedEventProcessor() {
        super("DOM.childNodeInserted", ChildNodeInsertedEvent.class);
    }

    @Override
    protected abstract void onEvent(ChildNodeInsertedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.childNodeInserted"; }
}
