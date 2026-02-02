package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;

@Experimental
public class SafeAreaInsets {

	@Description("Overrides safe-area-inset-top.")
	private int top;

	@Description("Overrides safe-area-max-inset-top.")
	private int topMax;

	@Description("Overrides safe-area-inset-left.")
	private int left;

	@Description("Overrides safe-area-max-inset-left.")
	private int leftMax;

	@Description("Overrides safe-area-inset-bottom.")
	private int bottom;

	@Description("Overrides safe-area-max-inset-bottom.")
	private int bottomMax;

	@Description("Overrides safe-area-inset-right.")
	private int right;

	@Description("Overrides safe-area-max-inset-right.")
	private int rightMax;

    public SafeAreaInsets() {
    }

	public int getTop() {
		return this.top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getTopMax() {
		return this.topMax;
	}
	public void setTopMax(int topMax) {
		this.topMax = topMax;
	}
	public int getLeft() {
		return this.left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getLeftMax() {
		return this.leftMax;
	}
	public void setLeftMax(int leftMax) {
		this.leftMax = leftMax;
	}
	public int getBottom() {
		return this.bottom;
	}
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
	public int getBottomMax() {
		return this.bottomMax;
	}
	public void setBottomMax(int bottomMax) {
		this.bottomMax = bottomMax;
	}
	public int getRight() {
		return this.right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getRightMax() {
		return this.rightMax;
	}
	public void setRightMax(int rightMax) {
		this.rightMax = rightMax;
	}
}
