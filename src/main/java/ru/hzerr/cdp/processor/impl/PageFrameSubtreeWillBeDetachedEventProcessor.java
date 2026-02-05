package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameSubtreeWillBeDetachedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameSubtreeWillBeDetachedEventProcessor extends AbstractChromeInstanceEventProcessor<FrameSubtreeWillBeDetachedEvent> {

    public PageFrameSubtreeWillBeDetachedEventProcessor() {
        super("Page.frameSubtreeWillBeDetached", FrameSubtreeWillBeDetachedEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameSubtreeWillBeDetachedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameSubtreeWillBeDetached"; }
}
