package ru.hzerr.generated.layerTree;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.generated.dom.Rect;
import ru.hzerr.annotation.TypeDescription;

@Description("Sticky position constraints.")
public class StickyPositionConstraint {

	@Required
	@Description("Layout rectangle of the sticky element before being shifted")
	private Rect stickyBoxRect;

	@Required
	@Description("Layout rectangle of the containing block of the sticky element")
	private Rect containingBlockRect;

	@Description("The nearest sticky layer that shifts the sticky box")
	@TypeDescription("Unique Layer identifier.")
	private String nearestLayerShiftingStickyBox;

	@Description("The nearest sticky layer that shifts the containing block")
	@TypeDescription("Unique Layer identifier.")
	private String nearestLayerShiftingContainingBlock;

    public StickyPositionConstraint() {
    }

	public Rect getStickyBoxRect() {
		return this.stickyBoxRect;
	}
	public void setStickyBoxRect(Rect stickyBoxRect) {
		this.stickyBoxRect = stickyBoxRect;
	}
	public Rect getContainingBlockRect() {
		return this.containingBlockRect;
	}
	public void setContainingBlockRect(Rect containingBlockRect) {
		this.containingBlockRect = containingBlockRect;
	}
	public String getNearestLayerShiftingStickyBox() {
		return this.nearestLayerShiftingStickyBox;
	}
	public void setNearestLayerShiftingStickyBox(String nearestLayerShiftingStickyBox) {
		this.nearestLayerShiftingStickyBox = nearestLayerShiftingStickyBox;
	}
	public String getNearestLayerShiftingContainingBlock() {
		return this.nearestLayerShiftingContainingBlock;
	}
	public void setNearestLayerShiftingContainingBlock(String nearestLayerShiftingContainingBlock) {
		this.nearestLayerShiftingContainingBlock = nearestLayerShiftingContainingBlock;
	}
}
