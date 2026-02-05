package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameScheduledNavigationEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

@Deprecated
public abstract class PageFrameScheduledNavigationEventProcessor extends AbstractChromeInstanceEventProcessor<FrameScheduledNavigationEvent> {

    public PageFrameScheduledNavigationEventProcessor() {
        super("Page.frameScheduledNavigation", FrameScheduledNavigationEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameScheduledNavigationEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameScheduledNavigation"; }
}
