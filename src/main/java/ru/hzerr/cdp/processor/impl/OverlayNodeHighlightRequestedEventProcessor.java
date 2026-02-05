package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.overlay.NodeHighlightRequestedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class OverlayNodeHighlightRequestedEventProcessor extends AbstractChromeInstanceEventProcessor<NodeHighlightRequestedEvent> {

    public OverlayNodeHighlightRequestedEventProcessor() {
        super("Overlay.nodeHighlightRequested", NodeHighlightRequestedEvent.class);
    }

    @Override
    protected abstract void onEvent(NodeHighlightRequestedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Overlay.nodeHighlightRequested"; }
}
