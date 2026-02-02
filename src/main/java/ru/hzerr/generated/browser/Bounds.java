package ru.hzerr.generated.browser;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Browser window bounds information")
public class Bounds {

	@Description("The offset from the left edge of the screen to the window in pixels.")
	private int left;

	@Description("The offset from the top edge of the screen to the window in pixels.")
	private int top;

	@Description("The window width in pixels.")
	private int width;

	@Description("The window height in pixels.")
	private int height;

	@Description("The window state. Default to normal.")
	@TypeExperimental
	@TypeDescription("The state of the browser window.")
	private String windowState;

    public Bounds() {
    }

	public int getLeft() {
		return this.left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getTop() {
		return this.top;
	}
	public void setTop(int top) {
		this.top = top;
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
	public String getWindowState() {
		return this.windowState;
	}
	public void setWindowState(String windowState) {
		this.windowState = windowState;
	}
}
