package ru.hzerr.generated.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Visual viewport position, dimensions, and scale.")
public class VisualViewport {

	@Required
	@Description("Horizontal offset relative to the layout viewport (CSS pixels).")
	private Number offsetX;

	@Required
	@Description("Vertical offset relative to the layout viewport (CSS pixels).")
	private Number offsetY;

	@Required
	@Description("Horizontal offset relative to the document (CSS pixels).")
	private Number pageX;

	@Required
	@Description("Vertical offset relative to the document (CSS pixels).")
	private Number pageY;

	@Required
	@Description("Width (CSS pixels), excludes scrollbar if present.")
	private Number clientWidth;

	@Required
	@Description("Height (CSS pixels), excludes scrollbar if present.")
	private Number clientHeight;

	@Required
	@Description("Scale relative to the ideal viewport (size at width=device-width).")
	private Number scale;

	@Description("Page zoom factor (CSS to device independent pixels ratio).")
	private Number zoom;

    public VisualViewport() {
    }

	public Number getOffsetX() {
		return this.offsetX;
	}
	public void setOffsetX(Number offsetX) {
		this.offsetX = offsetX;
	}
	public Number getOffsetY() {
		return this.offsetY;
	}
	public void setOffsetY(Number offsetY) {
		this.offsetY = offsetY;
	}
	public Number getPageX() {
		return this.pageX;
	}
	public void setPageX(Number pageX) {
		this.pageX = pageX;
	}
	public Number getPageY() {
		return this.pageY;
	}
	public void setPageY(Number pageY) {
		this.pageY = pageY;
	}
	public Number getClientWidth() {
		return this.clientWidth;
	}
	public void setClientWidth(Number clientWidth) {
		this.clientWidth = clientWidth;
	}
	public Number getClientHeight() {
		return this.clientHeight;
	}
	public void setClientHeight(Number clientHeight) {
		this.clientHeight = clientHeight;
	}
	public Number getScale() {
		return this.scale;
	}
	public void setScale(Number scale) {
		this.scale = scale;
	}
	public Number getZoom() {
		return this.zoom;
	}
	public void setZoom(Number zoom) {
		this.zoom = zoom;
	}
}
