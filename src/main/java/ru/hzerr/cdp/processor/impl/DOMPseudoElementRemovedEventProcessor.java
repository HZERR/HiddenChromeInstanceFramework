package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.PseudoElementRemovedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMPseudoElementRemovedEventProcessor extends AbstractChromeInstanceEventProcessor<PseudoElementRemovedEvent> {

    public DOMPseudoElementRemovedEventProcessor() {
        super("DOM.pseudoElementRemoved", PseudoElementRemovedEvent.class);
    }

    @Override
    protected abstract void onEvent(PseudoElementRemovedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.pseudoElementRemoved"; }
}
