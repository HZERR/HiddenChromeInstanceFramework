package ru.hzerr.cdp.event.layerTree;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.dom.Rect;

@Event("layerPainted")
public class LayerPaintedEvent {

	@Required
	@Description("The id of the painted layer.")
	@TypeDescription("Unique Layer identifier.")
	private String layerId;

	@Required
	@Description("Clip rectangle.")
	private Rect clip;

    public LayerPaintedEvent() {
    }

	public String getLayerId() {
		return this.layerId;
	}
	public void setLayerId(String layerId) {
		this.layerId = layerId;
	}
	public Rect getClip() {
		return this.clip;
	}
	public void setClip(Rect clip) {
		this.clip = clip;
	}
}
