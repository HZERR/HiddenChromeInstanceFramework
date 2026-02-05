package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.page.JavascriptDialogOpeningEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PageJavascriptDialogOpeningEventProcessor extends AbstractChromeInstanceEventProcessor<JavascriptDialogOpeningEvent> {

    public PageJavascriptDialogOpeningEventProcessor() {
        super("Page.javascriptDialogOpening", JavascriptDialogOpeningEvent.class);
    }

    @Override
    protected abstract void onEvent(JavascriptDialogOpeningEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Page.javascriptDialogOpening"; }
}
