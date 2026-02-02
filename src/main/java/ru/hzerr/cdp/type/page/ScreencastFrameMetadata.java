package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Screencast frame metadata.")
public class ScreencastFrameMetadata {

	@Required
	@Description("Top offset in DIP.")
	private Number offsetTop;

	@Required
	@Description("Page scale factor.")
	private Number pageScaleFactor;

	@Required
	@Description("Device screen width in DIP.")
	private Number deviceWidth;

	@Required
	@Description("Device screen height in DIP.")
	private Number deviceHeight;

	@Required
	@Description("Position of horizontal scroll in CSS pixels.")
	private Number scrollOffsetX;

	@Required
	@Description("Position of vertical scroll in CSS pixels.")
	private Number scrollOffsetY;

	@Description("Frame swap timestamp.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number timestamp;

    public ScreencastFrameMetadata() {
    }

	public Number getOffsetTop() {
		return this.offsetTop;
	}
	public void setOffsetTop(Number offsetTop) {
		this.offsetTop = offsetTop;
	}
	public Number getPageScaleFactor() {
		return this.pageScaleFactor;
	}
	public void setPageScaleFactor(Number pageScaleFactor) {
		this.pageScaleFactor = pageScaleFactor;
	}
	public Number getDeviceWidth() {
		return this.deviceWidth;
	}
	public void setDeviceWidth(Number deviceWidth) {
		this.deviceWidth = deviceWidth;
	}
	public Number getDeviceHeight() {
		return this.deviceHeight;
	}
	public void setDeviceHeight(Number deviceHeight) {
		this.deviceHeight = deviceHeight;
	}
	public Number getScrollOffsetX() {
		return this.scrollOffsetX;
	}
	public void setScrollOffsetX(Number scrollOffsetX) {
		this.scrollOffsetX = scrollOffsetX;
	}
	public Number getScrollOffsetY() {
		return this.scrollOffsetY;
	}
	public void setScrollOffsetY(Number scrollOffsetY) {
		this.scrollOffsetY = scrollOffsetY;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
}
