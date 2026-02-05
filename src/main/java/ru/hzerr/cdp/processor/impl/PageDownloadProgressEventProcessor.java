package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.DownloadProgressEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

@Deprecated
public abstract class PageDownloadProgressEventProcessor extends AbstractChromeInstanceEventProcessor<DownloadProgressEvent> {

    public PageDownloadProgressEventProcessor() {
        super("Page.downloadProgress", DownloadProgressEvent.class);
    }

    @Override
    protected abstract void onEvent(DownloadProgressEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.downloadProgress"; }
}
