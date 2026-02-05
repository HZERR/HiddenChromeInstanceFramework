package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.layerTree.LayerTreeDidChangeEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class LayerTreeDidChangeEventProcessor extends AbstractChromeInstanceEventProcessor<LayerTreeDidChangeEvent> {

    public LayerTreeDidChangeEventProcessor() {
        super("LayerTree.layerTreeDidChange", LayerTreeDidChangeEvent.class);
    }

    @Override
    protected abstract void onEvent(LayerTreeDidChangeEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "LayerTree.layerTreeDidChange"; }
}
