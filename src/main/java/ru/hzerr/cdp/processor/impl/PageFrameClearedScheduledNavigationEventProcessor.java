package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FrameClearedScheduledNavigationEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

@Deprecated
public abstract class PageFrameClearedScheduledNavigationEventProcessor extends AbstractChromeInstanceEventProcessor<FrameClearedScheduledNavigationEvent> {

    public PageFrameClearedScheduledNavigationEventProcessor() {
        super("Page.frameClearedScheduledNavigation", FrameClearedScheduledNavigationEvent.class);
    }

    @Override
    protected abstract void onEvent(FrameClearedScheduledNavigationEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.frameClearedScheduledNavigation"; }
}
