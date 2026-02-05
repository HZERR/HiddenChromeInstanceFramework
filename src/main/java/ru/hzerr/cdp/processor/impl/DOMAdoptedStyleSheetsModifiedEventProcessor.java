package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.AdoptedStyleSheetsModifiedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMAdoptedStyleSheetsModifiedEventProcessor extends AbstractChromeInstanceEventProcessor<AdoptedStyleSheetsModifiedEvent> {

    public DOMAdoptedStyleSheetsModifiedEventProcessor() {
        super("DOM.adoptedStyleSheetsModified", AdoptedStyleSheetsModifiedEvent.class);
    }

    @Override
    protected abstract void onEvent(AdoptedStyleSheetsModifiedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.adoptedStyleSheetsModified"; }
}
