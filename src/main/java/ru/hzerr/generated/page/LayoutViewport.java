package ru.hzerr.generated.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Layout viewport position and dimensions.")
public class LayoutViewport {

	@Required
	@Description("Horizontal offset relative to the document (CSS pixels).")
	private int pageX;

	@Required
	@Description("Vertical offset relative to the document (CSS pixels).")
	private int pageY;

	@Required
	@Description("Width (CSS pixels), excludes scrollbar if present.")
	private int clientWidth;

	@Required
	@Description("Height (CSS pixels), excludes scrollbar if present.")
	private int clientHeight;

    public LayoutViewport() {
    }

	public int getPageX() {
		return this.pageX;
	}
	public void setPageX(int pageX) {
		this.pageX = pageX;
	}
	public int getPageY() {
		return this.pageY;
	}
	public void setPageY(int pageY) {
		this.pageY = pageY;
	}
	public int getClientWidth() {
		return this.clientWidth;
	}
	public void setClientWidth(int clientWidth) {
		this.clientWidth = clientWidth;
	}
	public int getClientHeight() {
		return this.clientHeight;
	}
	public void setClientHeight(int clientHeight) {
		this.clientHeight = clientHeight;
	}
}
