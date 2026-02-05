package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.LifecycleEventEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageLifecycleEventEventProcessor extends AbstractChromeInstanceEventProcessor<LifecycleEventEvent> {

    public PageLifecycleEventEventProcessor() {
        super("Page.lifecycleEvent", LifecycleEventEvent.class);
    }

    @Override
    protected abstract void onEvent(LifecycleEventEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.lifecycleEvent"; }
}
