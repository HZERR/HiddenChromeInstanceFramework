package ru.hzerr.generated.systemInfo;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Describes the width and height dimensions of an entity.")
public class Size {

	@Required
	@Description("Width in pixels.")
	private int width;

	@Required
	@Description("Height in pixels.")
	private int height;

    public Size() {
    }

	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
