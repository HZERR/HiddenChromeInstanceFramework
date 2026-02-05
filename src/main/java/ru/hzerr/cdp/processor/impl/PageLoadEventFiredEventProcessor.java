package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.LoadEventFiredEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageLoadEventFiredEventProcessor extends AbstractChromeInstanceEventProcessor<LoadEventFiredEvent> {

    public PageLoadEventFiredEventProcessor() {
        super("Page.loadEventFired", LoadEventFiredEvent.class);
    }

    @Override
    protected abstract void onEvent(LoadEventFiredEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.loadEventFired"; }
}
