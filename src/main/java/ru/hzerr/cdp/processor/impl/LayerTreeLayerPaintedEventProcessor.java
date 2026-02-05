package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.layerTree.LayerPaintedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class LayerTreeLayerPaintedEventProcessor extends AbstractChromeInstanceEventProcessor<LayerPaintedEvent> {

    public LayerTreeLayerPaintedEventProcessor() {
        super("LayerTree.layerPainted", LayerPaintedEvent.class);
    }

    @Override
    protected abstract void onEvent(LayerPaintedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "LayerTree.layerPainted"; }
}
