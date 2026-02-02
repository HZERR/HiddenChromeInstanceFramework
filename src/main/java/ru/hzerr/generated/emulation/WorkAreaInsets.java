package ru.hzerr.generated.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;

@Experimental
public class WorkAreaInsets {

	@Description("Work area top inset in pixels. Default is 0;")
	private int top;

	@Description("Work area left inset in pixels. Default is 0;")
	private int left;

	@Description("Work area bottom inset in pixels. Default is 0;")
	private int bottom;

	@Description("Work area right inset in pixels. Default is 0;")
	private int right;

    public WorkAreaInsets() {
    }

	public int getTop() {
		return this.top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getLeft() {
		return this.left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getBottom() {
		return this.bottom;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public int getRight() {
		return this.right;
	}
	public void setRight(int right) {
		this.right = right;
	}
}
