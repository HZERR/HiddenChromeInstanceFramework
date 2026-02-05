package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.browser.DownloadWillBeginEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class BrowserDownloadWillBeginEventProcessor extends AbstractChromeInstanceEventProcessor<DownloadWillBeginEvent> {

    public BrowserDownloadWillBeginEventProcessor() {
        super("Browser.downloadWillBegin", DownloadWillBeginEvent.class);
    }

    @Override
    protected abstract void onEvent(DownloadWillBeginEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Browser.downloadWillBegin"; }
}
