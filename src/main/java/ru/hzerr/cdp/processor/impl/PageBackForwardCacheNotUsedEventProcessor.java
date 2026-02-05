package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.BackForwardCacheNotUsedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageBackForwardCacheNotUsedEventProcessor extends AbstractChromeInstanceEventProcessor<BackForwardCacheNotUsedEvent> {

    public PageBackForwardCacheNotUsedEventProcessor() {
        super("Page.backForwardCacheNotUsed", BackForwardCacheNotUsedEvent.class);
    }

    @Override
    protected abstract void onEvent(BackForwardCacheNotUsedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.backForwardCacheNotUsed"; }
}
