package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.JavascriptDialogClosedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageJavascriptDialogClosedEventProcessor extends AbstractChromeInstanceEventProcessor<JavascriptDialogClosedEvent> {

    public PageJavascriptDialogClosedEventProcessor() {
        super("Page.javascriptDialogClosed", JavascriptDialogClosedEvent.class);
    }

    @Override
    protected abstract void onEvent(JavascriptDialogClosedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.javascriptDialogClosed"; }
}
