package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.generated.dom.RGBA;

public class IsolationModeHighlightConfig {

	@Description("The fill color of the resizers (default: transparent).")
	private RGBA resizerColor;

	@Description("The fill color for resizer handles (default: transparent).")
	private RGBA resizerHandleColor;

	@Description("The fill color for the mask covering non-isolated elements (default: transparent).")
	private RGBA maskColor;

    public IsolationModeHighlightConfig() {
    }

	public RGBA getResizerColor() {
		return this.resizerColor;
	}
	public void setResizerColor(RGBA resizerColor) {
		this.resizerColor = resizerColor;
	}
	public RGBA getResizerHandleColor() {
		return this.resizerHandleColor;
	}
	public void setResizerHandleColor(RGBA resizerHandleColor) {
		this.resizerHandleColor = resizerHandleColor;
	}
	public RGBA getMaskColor() {
		return this.maskColor;
	}
	public void setMaskColor(RGBA maskColor) {
		this.maskColor = maskColor;
	}
}
