package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameStoppedLoadingEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameStoppedLoadingEventProcessor extends AbstractChromeInstanceEventProcessor<FrameStoppedLoadingEvent> {

    public PageFrameStoppedLoadingEventProcessor() {
        super("Page.frameStoppedLoading", FrameStoppedLoadingEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameStoppedLoadingEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameStoppedLoading"; }
}
