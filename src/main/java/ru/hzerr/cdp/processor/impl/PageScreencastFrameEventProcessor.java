package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.ScreencastFrameEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageScreencastFrameEventProcessor extends AbstractChromeInstanceEventProcessor<ScreencastFrameEvent> {

    public PageScreencastFrameEventProcessor() {
        super("Page.screencastFrame", ScreencastFrameEvent.class);
    }

    @Override
    protected abstract void onEvent(ScreencastFrameEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.screencastFrame"; }
}
