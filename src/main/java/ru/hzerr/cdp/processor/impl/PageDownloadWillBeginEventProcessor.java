package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.DownloadWillBeginEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageDownloadWillBeginEventProcessor extends AbstractChromeInstanceEventProcessor<DownloadWillBeginEvent> {

    public PageDownloadWillBeginEventProcessor() {
        super("Page.downloadWillBegin", DownloadWillBeginEvent.class);
    }

    @Override
    protected abstract void onEvent(DownloadWillBeginEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.downloadWillBegin"; }
}
