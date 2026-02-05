package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.ChildNodeRemovedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMChildNodeRemovedEventProcessor extends AbstractChromeInstanceEventProcessor<ChildNodeRemovedEvent> {

    public DOMChildNodeRemovedEventProcessor() {
        super("DOM.childNodeRemoved", ChildNodeRemovedEvent.class);
    }

    @Override
    protected abstract void onEvent(ChildNodeRemovedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.childNodeRemoved"; }
}
