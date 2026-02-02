package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.generated.dom.RGBA;

public class ScrollSnapContainerHighlightConfig {

	@Description("The style of the snapport border (default: transparent)")
	private LineStyle snapportBorder;

	@Description("The style of the snap area border (default: transparent)")
	private LineStyle snapAreaBorder;

	@Description("The margin highlight fill color (default: transparent).")
	private RGBA scrollMarginColor;

	@Description("The padding highlight fill color (default: transparent).")
	private RGBA scrollPaddingColor;

    public ScrollSnapContainerHighlightConfig() {
    }

	public LineStyle getSnapportBorder() {
		return this.snapportBorder;
	}
	public void setSnapportBorder(LineStyle snapportBorder) {
		this.snapportBorder = snapportBorder;
	}
	public LineStyle getSnapAreaBorder() {
		return this.snapAreaBorder;
	}
	public void setSnapAreaBorder(LineStyle snapAreaBorder) {
		this.snapAreaBorder = snapAreaBorder;
	}
	public RGBA getScrollMarginColor() {
		return this.scrollMarginColor;
	}
	public void setScrollMarginColor(RGBA scrollMarginColor) {
		this.scrollMarginColor = scrollMarginColor;
	}
	public RGBA getScrollPaddingColor() {
		return this.scrollPaddingColor;
	}
	public void setScrollPaddingColor(RGBA scrollPaddingColor) {
		this.scrollPaddingColor = scrollPaddingColor;
	}
}
