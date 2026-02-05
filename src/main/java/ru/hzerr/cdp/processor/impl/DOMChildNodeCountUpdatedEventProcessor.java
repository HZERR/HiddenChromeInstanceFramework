package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.ChildNodeCountUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMChildNodeCountUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<ChildNodeCountUpdatedEvent> {

    public DOMChildNodeCountUpdatedEventProcessor() {
        super("DOM.childNodeCountUpdated", ChildNodeCountUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(ChildNodeCountUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.childNodeCountUpdated"; }
}
