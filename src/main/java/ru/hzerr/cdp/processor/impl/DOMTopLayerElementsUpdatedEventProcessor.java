package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.TopLayerElementsUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMTopLayerElementsUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<TopLayerElementsUpdatedEvent> {

    public DOMTopLayerElementsUpdatedEventProcessor() {
        super("DOM.topLayerElementsUpdated", TopLayerElementsUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(TopLayerElementsUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.topLayerElementsUpdated"; }
}
