package ru.hzerr.generated.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Rectangle.")
public class Rect {

	@Required
	@Description("X coordinate")
	private Number x;

	@Required
	@Description("Y coordinate")
	private Number y;

	@Required
	@Description("Rectangle width")
	private Number width;

	@Required
	@Description("Rectangle height")
	private Number height;

    public Rect() {
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
}
