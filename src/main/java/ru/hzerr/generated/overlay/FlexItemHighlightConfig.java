package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;

@Description("Configuration data for the highlighting of Flex item elements.")
public class FlexItemHighlightConfig {

	@Description("Style of the box representing the item's base size")
	private BoxStyle baseSizeBox;

	@Description("Style of the border around the box representing the item's base size")
	private LineStyle baseSizeBorder;

	@Description("Style of the arrow representing if the item grew or shrank")
	private LineStyle flexibilityArrow;

    public FlexItemHighlightConfig() {
    }

	public BoxStyle getBaseSizeBox() {
		return this.baseSizeBox;
	}
	public void setBaseSizeBox(BoxStyle baseSizeBox) {
		this.baseSizeBox = baseSizeBox;
	}
	public LineStyle getBaseSizeBorder() {
		return this.baseSizeBorder;
	}
	public void setBaseSizeBorder(LineStyle baseSizeBorder) {
		this.baseSizeBorder = baseSizeBorder;
	}
	public LineStyle getFlexibilityArrow() {
		return this.flexibilityArrow;
	}
	public void setFlexibilityArrow(LineStyle flexibilityArrow) {
		this.flexibilityArrow = flexibilityArrow;
	}
}
