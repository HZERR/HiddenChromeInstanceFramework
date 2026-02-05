package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.AttributeRemovedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMAttributeRemovedEventProcessor extends AbstractChromeInstanceEventProcessor<AttributeRemovedEvent> {

    public DOMAttributeRemovedEventProcessor() {
        super("DOM.attributeRemoved", AttributeRemovedEvent.class);
    }

    @Override
    protected abstract void onEvent(AttributeRemovedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.attributeRemoved"; }
}
