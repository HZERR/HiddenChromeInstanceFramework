package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameStartedLoadingEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameStartedLoadingEventProcessor extends AbstractChromeInstanceEventProcessor<FrameStartedLoadingEvent> {

    public PageFrameStartedLoadingEventProcessor() {
        super("Page.frameStartedLoading", FrameStartedLoadingEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameStartedLoadingEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameStartedLoading"; }
}
