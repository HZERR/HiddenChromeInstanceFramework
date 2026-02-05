package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.dom.DistributedNodesUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class DOMDistributedNodesUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<DistributedNodesUpdatedEvent> {

    public DOMDistributedNodesUpdatedEventProcessor() {
        super("DOM.distributedNodesUpdated", DistributedNodesUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(DistributedNodesUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "DOM.distributedNodesUpdated"; }
}
