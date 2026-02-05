package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameStartedNavigatingEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameStartedNavigatingEventProcessor extends AbstractChromeInstanceEventProcessor<FrameStartedNavigatingEvent> {

    public PageFrameStartedNavigatingEventProcessor() {
        super("Page.frameStartedNavigating", FrameStartedNavigatingEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameStartedNavigatingEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameStartedNavigating"; }
}
