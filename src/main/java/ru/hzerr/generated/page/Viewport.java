package ru.hzerr.generated.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Viewport for capturing screenshot.")
public class Viewport {

	@Required
	@Description("X offset in device independent pixels (dip).")
	private Number x;

	@Required
	@Description("Y offset in device independent pixels (dip).")
	private Number y;

	@Required
	@Description("Rectangle width in device independent pixels (dip).")
	private Number width;

	@Required
	@Description("Rectangle height in device independent pixels (dip).")
	private Number height;

	@Required
	@Description("Page scale factor.")
	private Number scale;

    public Viewport() {
    }

	public Number getX() {
		return this.x;
	}
	public void setX(Number x) {
		this.x = x;
	}
	public Number getY() {
		return this.y;
	}
	public void setY(Number y) {
		this.y = y;
	}
	public Number getWidth() {
		return this.width;
	}
	public void setWidth(Number width) {
		this.width = width;
	}
	public Number getHeight() {
		return this.height;
	}
	public void setHeight(Number height) {
		this.height = height;
	}
	public Number getScale() {
		return this.scale;
	}
	public void setScale(Number scale) {
		this.scale = scale;
	}
}
