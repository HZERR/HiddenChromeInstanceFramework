package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.generated.dom.RGBA;

@Description("Style information for drawing a box.")
public class BoxStyle {

	@Description("The background color for the box (default: transparent)")
	private RGBA fillColor;

	@Description("The hatching color for the box (default: transparent)")
	private RGBA hatchColor;

    public BoxStyle() {
    }

	public RGBA getFillColor() {
		return this.fillColor;
	}
	public void setFillColor(RGBA fillColor) {
		this.fillColor = fillColor;
	}
	public RGBA getHatchColor() {
		return this.hatchColor;
	}
	public void setHatchColor(RGBA hatchColor) {
		this.hatchColor = hatchColor;
	}
}
