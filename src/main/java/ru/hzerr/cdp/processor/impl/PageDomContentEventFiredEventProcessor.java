package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.DomContentEventFiredEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageDomContentEventFiredEventProcessor extends AbstractChromeInstanceEventProcessor<DomContentEventFiredEvent> {

    public PageDomContentEventFiredEventProcessor() {
        super("Page.domContentEventFired", DomContentEventFiredEvent.class);
    }

    @Override
    protected abstract void onEvent(DomContentEventFiredEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.domContentEventFired"; }
}
