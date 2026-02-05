package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.accessibility.NodesUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AccessibilityNodesUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<NodesUpdatedEvent> {

    public AccessibilityNodesUpdatedEventProcessor() {
        super("Accessibility.nodesUpdated", NodesUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(NodesUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Accessibility.nodesUpdated"; }
}
