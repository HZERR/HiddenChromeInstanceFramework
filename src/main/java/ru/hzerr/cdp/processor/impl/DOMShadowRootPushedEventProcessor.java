package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.ShadowRootPushedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMShadowRootPushedEventProcessor extends AbstractChromeInstanceEventProcessor<ShadowRootPushedEvent> {

    public DOMShadowRootPushedEventProcessor() {
        super("DOM.shadowRootPushed", ShadowRootPushedEvent.class);
    }

    @Override
    protected abstract void onEvent(ShadowRootPushedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.shadowRootPushed"; }
}
