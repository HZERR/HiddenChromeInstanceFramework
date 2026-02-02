package ru.hzerr.generated.layerTree;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("Information about a compositing layer.")
public class Layer {

	@Required
	@Description("The unique id for this layer.")
	@TypeDescription("Unique Layer identifier.")
	private String layerId;

	@Description("The id of parent (not present for root).")
	@TypeDescription("Unique Layer identifier.")
	private String parentLayerId;

	@Description("The backend id for the node associated with this layer.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

	@Required
	@Description("Offset from parent layer, X coordinate.")
	private Number offsetX;

	@Required
	@Description("Offset from parent layer, Y coordinate.")
	private Number offsetY;

	@Required
	@Description("Layer width.")
	private Number width;

	@Required
	@Description("Layer height.")
	private Number height;

	@Description("Transformation matrix for layer, default is identity matrix")
	private Number[] transform;

	@Description("Transform anchor point X, absent if no transform specified")
	private Number anchorX;

	@Description("Transform anchor point Y, absent if no transform specified")
	private Number anchorY;

	@Description("Transform anchor point Z, absent if no transform specified")
	private Number anchorZ;

	@Required
	@Description("Indicates how many time this layer has painted.")
	private int paintCount;

	@Required
	@Description("Indicates whether this layer hosts any content, rather than being used for transform/scrolling purposes only.")
	private boolean drawsContent;

	@Description("Set if layer is not visible.")
	private boolean invisible;

	@Description("Rectangles scrolling on main thread only.")
	private List<ScrollRect> scrollRects;

	@Description("Sticky position constraint information")
	private StickyPositionConstraint stickyPositionConstraint;

    public Layer() {
    }

	public String getLayerId() {
		return this.layerId;
	}
	public void setLayerId(String layerId) {
		this.layerId = layerId;
	}
	public String getParentLayerId() {
		return this.parentLayerId;
	}
	public void setParentLayerId(String parentLayerId) {
		this.parentLayerId = parentLayerId;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
	public Number getOffsetX() {
		return this.offsetX;
	}
	public void setOffsetX(Number offsetX) {
		this.offsetX = offsetX;
	}
	public Number getOffsetY() {
		return this.offsetY;
	}
	public void setOffsetY(Number offsetY) {
		this.offsetY = offsetY;
	}
	public Number getWidth() {
		return this.width;
	}
	public void setWidth(Number width) {
		this.width = width;
	}
	public Number getHeight() {
		return this.height;
	}
	public void setHeight(Number height) {
		this.height = height;
	}
	public Number[] getTransform() {
		return this.transform;
	}
	public void setTransform(Number[] transform) {
		this.transform = transform;
	}
	public Number getAnchorX() {
		return this.anchorX;
	}
	public void setAnchorX(Number anchorX) {
		this.anchorX = anchorX;
	}
	public Number getAnchorY() {
		return this.anchorY;
	}
	public void setAnchorY(Number anchorY) {
		this.anchorY = anchorY;
	}
	public Number getAnchorZ() {
		return this.anchorZ;
	}
	public void setAnchorZ(Number anchorZ) {
		this.anchorZ = anchorZ;
	}
	public int getPaintCount() {
		return this.paintCount;
	}
	public void setPaintCount(int paintCount) {
		this.paintCount = paintCount;
	}
	public boolean getDrawsContent() {
		return this.drawsContent;
	}
	public void setDrawsContent(boolean drawsContent) {
		this.drawsContent = drawsContent;
	}
	public boolean getInvisible() {
		return this.invisible;
	}
	public void setInvisible(boolean invisible) {
		this.invisible = invisible;
	}
	public List<ScrollRect> getScrollRects() {
		return this.scrollRects;
	}
	public void setScrollRects(List<ScrollRect> scrollRects) {
		this.scrollRects = scrollRects;
	}
	public StickyPositionConstraint getStickyPositionConstraint() {
		return this.stickyPositionConstraint;
	}
	public void setStickyPositionConstraint(StickyPositionConstraint stickyPositionConstraint) {
		this.stickyPositionConstraint = stickyPositionConstraint;
	}
}
