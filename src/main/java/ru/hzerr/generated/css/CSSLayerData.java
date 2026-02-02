package ru.hzerr.generated.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
@Description("CSS Layer data.")
public class CSSLayerData {

	@Required
	@Description("Layer name.")
	private String name;

	@Description("Direct sub-layers")
	private List<CSSLayerData> subLayers;

	@Required
	@Description("Layer order. The order determines the order of the layer in the cascade order. A higher number has higher priority in the cascade order.")
	private Number order;

    public CSSLayerData() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CSSLayerData> getSubLayers() {
		return this.subLayers;
	}
	public void setSubLayers(List<CSSLayerData> subLayers) {
		this.subLayers = subLayers;
	}
	public Number getOrder() {
		return this.order;
	}
	public void setOrder(Number order) {
		this.order = order;
	}
}
