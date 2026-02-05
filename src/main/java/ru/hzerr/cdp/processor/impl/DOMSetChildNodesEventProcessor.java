package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.SetChildNodesEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMSetChildNodesEventProcessor extends AbstractChromeInstanceEventProcessor<SetChildNodesEvent> {

    public DOMSetChildNodesEventProcessor() {
        super("DOM.setChildNodes", SetChildNodesEvent.class);
    }

    @Override
    protected abstract void onEvent(SetChildNodesEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.setChildNodes"; }
}
