package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.PseudoElementAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMPseudoElementAddedEventProcessor extends AbstractChromeInstanceEventProcessor<PseudoElementAddedEvent> {

    public DOMPseudoElementAddedEventProcessor() {
        super("DOM.pseudoElementAdded", PseudoElementAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(PseudoElementAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.pseudoElementAdded"; }
}
