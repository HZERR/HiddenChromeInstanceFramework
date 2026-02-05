package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.AttributeModifiedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMAttributeModifiedEventProcessor extends AbstractChromeInstanceEventProcessor<AttributeModifiedEvent> {

    public DOMAttributeModifiedEventProcessor() {
        super("DOM.attributeModified", AttributeModifiedEvent.class);
    }

    @Override
    protected abstract void onEvent(AttributeModifiedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.attributeModified"; }
}
