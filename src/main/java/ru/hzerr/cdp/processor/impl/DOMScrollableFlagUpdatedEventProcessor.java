package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.ScrollableFlagUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMScrollableFlagUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<ScrollableFlagUpdatedEvent> {

    public DOMScrollableFlagUpdatedEventProcessor() {
        super("DOM.scrollableFlagUpdated", ScrollableFlagUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(ScrollableFlagUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.scrollableFlagUpdated"; }
}
