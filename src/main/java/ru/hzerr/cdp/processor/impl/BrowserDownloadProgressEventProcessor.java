package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.browser.DownloadProgressEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class BrowserDownloadProgressEventProcessor extends AbstractChromeInstanceEventProcessor<DownloadProgressEvent> {

    public BrowserDownloadProgressEventProcessor() {
        super("Browser.downloadProgress", DownloadProgressEvent.class);
    }

    @Override
    protected abstract void onEvent(DownloadProgressEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Browser.downloadProgress"; }
}
