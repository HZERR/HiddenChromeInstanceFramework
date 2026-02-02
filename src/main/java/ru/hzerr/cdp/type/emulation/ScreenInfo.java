package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
@Description("Screen information similar to the one returned by window.getScreenDetails() method, see https://w3c.github.io/window-management/#screendetailed.")
public class ScreenInfo {

	@Required
	@Description("Offset of the left edge of the screen.")
	private int left;

	@Required
	@Description("Offset of the top edge of the screen.")
	private int top;

	@Required
	@Description("Width of the screen.")
	private int width;

	@Required
	@Description("Height of the screen.")
	private int height;

	@Required
	@Description("Offset of the left edge of the available screen area.")
	private int availLeft;

	@Required
	@Description("Offset of the top edge of the available screen area.")
	private int availTop;

	@Required
	@Description("Width of the available screen area.")
	private int availWidth;

	@Required
	@Description("Height of the available screen area.")
	private int availHeight;

	@Required
	@Description("Specifies the screen's device pixel ratio.")
	private Number devicePixelRatio;

	@Required
	@Description("Specifies the screen's orientation.")
	private ScreenOrientation orientation;

	@Required
	@Description("Specifies the screen's color depth in bits.")
	private int colorDepth;

	@Required
	@Description("Indicates whether the device has multiple screens.")
	private boolean isExtended;

	@Required
	@Description("Indicates whether the screen is internal to the device or external, attached to the device.")
	private boolean isInternal;

	@Required
	@Description("Indicates whether the screen is set as the the operating system primary screen.")
	private boolean isPrimary;

	@Required
	@Description("Specifies the descriptive label for the screen.")
	private String label;

	@Required
	@Description("Specifies the unique identifier of the screen.")
	@TypeExperimental
	private String id;

    public ScreenInfo() {
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
	public int getAvailLeft() {
		return this.availLeft;
	}
	public void setAvailLeft(int availLeft) {
		this.availLeft = availLeft;
	}
	public int getAvailTop() {
		return this.availTop;
	}
	public void setAvailTop(int availTop) {
		this.availTop = availTop;
	}
	public int getAvailWidth() {
		return this.availWidth;
	}
	public void setAvailWidth(int availWidth) {
		this.availWidth = availWidth;
	}
	public int getAvailHeight() {
		return this.availHeight;
	}
	public void setAvailHeight(int availHeight) {
		this.availHeight = availHeight;
	}
	public Number getDevicePixelRatio() {
		return this.devicePixelRatio;
	}
	public void setDevicePixelRatio(Number devicePixelRatio) {
		this.devicePixelRatio = devicePixelRatio;
	}
	public ScreenOrientation getOrientation() {
		return this.orientation;
	}
	public void setOrientation(ScreenOrientation orientation) {
		this.orientation = orientation;
	}
	public int getColorDepth() {
		return this.colorDepth;
	}
	public void setColorDepth(int colorDepth) {
		this.colorDepth = colorDepth;
	}
	public boolean getIsExtended() {
		return this.isExtended;
	}
	public void setIsExtended(boolean isExtended) {
		this.isExtended = isExtended;
	}
	public boolean getIsInternal() {
		return this.isInternal;
	}
	public void setIsInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}
	public boolean getIsPrimary() {
		return this.isPrimary;
	}
	public void setIsPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
