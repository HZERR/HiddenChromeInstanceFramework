package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.FileChooserOpenedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageFileChooserOpenedEventProcessor extends AbstractChromeInstanceEventProcessor<FileChooserOpenedEvent> {

    public PageFileChooserOpenedEventProcessor() {
        super("Page.fileChooserOpened", FileChooserOpenedEvent.class);
    }

    @Override
    protected abstract void onEvent(FileChooserOpenedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.fileChooserOpened"; }
}
