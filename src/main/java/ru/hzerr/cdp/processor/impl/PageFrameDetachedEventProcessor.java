package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameDetachedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameDetachedEventProcessor extends AbstractChromeInstanceEventProcessor<FrameDetachedEvent> {

    public PageFrameDetachedEventProcessor() {
        super("Page.frameDetached", FrameDetachedEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameDetachedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameDetached"; }
}
