package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.InlineStyleInvalidatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMInlineStyleInvalidatedEventProcessor extends AbstractChromeInstanceEventProcessor<InlineStyleInvalidatedEvent> {

    public DOMInlineStyleInvalidatedEventProcessor() {
        super("DOM.inlineStyleInvalidated", InlineStyleInvalidatedEvent.class);
    }

    @Override
    protected abstract void onEvent(InlineStyleInvalidatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.inlineStyleInvalidated"; }
}
