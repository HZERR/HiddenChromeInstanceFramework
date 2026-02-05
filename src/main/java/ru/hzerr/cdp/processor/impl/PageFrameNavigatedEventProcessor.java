package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameNavigatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameNavigatedEventProcessor extends AbstractChromeInstanceEventProcessor<FrameNavigatedEvent> {

    public PageFrameNavigatedEventProcessor() {
        super("Page.frameNavigated", FrameNavigatedEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameNavigatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameNavigated"; }
}
