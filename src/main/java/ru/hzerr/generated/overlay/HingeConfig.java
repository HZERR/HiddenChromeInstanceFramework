package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.generated.dom.Rect;
import ru.hzerr.generated.dom.RGBA;

@Description("Configuration for dual screen hinge")
public class HingeConfig {

	@Required
	@Description("A rectangle represent hinge")
	private Rect rect;

	@Description("The content box highlight fill color (default: a dark color).")
	private RGBA contentColor;

	@Description("The content box highlight outline color (default: transparent).")
	private RGBA outlineColor;

    public HingeConfig() {
    }

	public Rect getRect() {
		return this.rect;
	}
	public void setRect(Rect rect) {
		this.rect = rect;
	}
	public RGBA getContentColor() {
		return this.contentColor;
	}
	public void setContentColor(RGBA contentColor) {
		this.contentColor = contentColor;
	}
	public RGBA getOutlineColor() {
		return this.outlineColor;
	}
	public void setOutlineColor(RGBA outlineColor) {
		this.outlineColor = outlineColor;
	}
}
