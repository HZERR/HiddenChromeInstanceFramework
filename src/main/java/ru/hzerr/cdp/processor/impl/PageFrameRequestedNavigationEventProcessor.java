package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameRequestedNavigationEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFrameRequestedNavigationEventProcessor extends AbstractChromeInstanceEventProcessor<FrameRequestedNavigationEvent> {

    public PageFrameRequestedNavigationEventProcessor() {
        super("Page.frameRequestedNavigation", FrameRequestedNavigationEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameRequestedNavigationEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameRequestedNavigation"; }
}
