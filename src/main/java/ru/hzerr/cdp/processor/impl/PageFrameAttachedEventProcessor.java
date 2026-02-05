package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameAttachedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameAttachedEventProcessor extends AbstractChromeInstanceEventProcessor<FrameAttachedEvent> {

    public PageFrameAttachedEventProcessor() {
        super("Page.frameAttached", FrameAttachedEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameAttachedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameAttached"; }
}
