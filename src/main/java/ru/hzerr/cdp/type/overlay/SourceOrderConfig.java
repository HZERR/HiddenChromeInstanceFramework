package ru.hzerr.cdp.type.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.dom.RGBA;

@Description("Configuration data for drawing the source order of an elements children.")
public class SourceOrderConfig {

	@Required
	@Description("the color to outline the given element in.")
	private RGBA parentOutlineColor;

	@Required
	@Description("the color to outline the child elements in.")
	private RGBA childOutlineColor;

    public SourceOrderConfig() {
    }

	public RGBA getParentOutlineColor() {
		return this.parentOutlineColor;
	}
	public void setParentOutlineColor(RGBA parentOutlineColor) {
		this.parentOutlineColor = parentOutlineColor;
	}
	public RGBA getChildOutlineColor() {
		return this.childOutlineColor;
	}
	public void setChildOutlineColor(RGBA childOutlineColor) {
		this.childOutlineColor = childOutlineColor;
	}
}
