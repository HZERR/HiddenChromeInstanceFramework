package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.ScreencastVisibilityChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageScreencastVisibilityChangedEventProcessor extends AbstractChromeInstanceEventProcessor<ScreencastVisibilityChangedEvent> {

    public PageScreencastVisibilityChangedEventProcessor() {
        super("Page.screencastVisibilityChanged", ScreencastVisibilityChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(ScreencastVisibilityChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.screencastVisibilityChanged"; }
}
