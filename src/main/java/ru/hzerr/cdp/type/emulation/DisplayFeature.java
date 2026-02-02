package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Enum;

public class DisplayFeature {

	@Required
	@Description("Orientation of a display feature in relation to screen")
	@Enum({"vertical", "horizontal"})
	private String orientation;

	@Required
	@Description("The offset from the screen origin in either the x (for vertical orientation) or y (for horizontal orientation) direction.")
	private int offset;

	@Required
	@Description("A display feature may mask content such that it is not physically displayed - this length along with the offset describes this area. A display feature that only splits content will have a 0 mask_length.")
	private int maskLength;

    public DisplayFeature() {
    }

	public String getOrientation() {
		return this.orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public int getOffset() {
		return this.offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getMaskLength() {
		return this.maskLength;
	}
	public void setMaskLength(int maskLength) {
		this.maskLength = maskLength;
	}
}
