package ru.hzerr.cdp.event.layerTree;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Description;
import java.util.List;
import ru.hzerr.cdp.type.layerTree.Layer;

@Event("layerTreeDidChange")
public class LayerTreeDidChangeEvent {

	@Description("Layer tree, absent if not in the compositing mode.")
	private List<Layer> layers;

    public LayerTreeDidChangeEvent() {
    }

	public List<Layer> getLayers() {
		return this.layers;
	}
	public void setLayers(List<Layer> layers) {
		this.layers = layers;
	}
}
