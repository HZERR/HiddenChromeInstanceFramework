package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.ShadowRootPoppedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMShadowRootPoppedEventProcessor extends AbstractChromeInstanceEventProcessor<ShadowRootPoppedEvent> {

    public DOMShadowRootPoppedEventProcessor() {
        super("DOM.shadowRootPopped", ShadowRootPoppedEvent.class);
    }

    @Override
    protected abstract void onEvent(ShadowRootPoppedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.shadowRootPopped"; }
}
