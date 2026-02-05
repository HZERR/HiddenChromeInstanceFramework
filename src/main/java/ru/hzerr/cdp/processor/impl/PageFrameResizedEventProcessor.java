package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameResizedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameResizedEventProcessor extends AbstractChromeInstanceEventProcessor<FrameResizedEvent> {

    public PageFrameResizedEventProcessor() {
        super("Page.frameResized", FrameResizedEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameResizedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameResized"; }
}
