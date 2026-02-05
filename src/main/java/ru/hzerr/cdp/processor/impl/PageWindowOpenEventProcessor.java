package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.WindowOpenEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageWindowOpenEventProcessor extends AbstractChromeInstanceEventProcessor<WindowOpenEvent> {

    public PageWindowOpenEventProcessor() {
        super("Page.windowOpen", WindowOpenEvent.class);
    }

    @Override
    protected abstract void onEvent(WindowOpenEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.windowOpen"; }
}
