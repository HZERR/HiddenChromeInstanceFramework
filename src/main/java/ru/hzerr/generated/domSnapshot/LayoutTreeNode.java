package ru.hzerr.generated.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.generated.dom.Rect;
import java.util.List;

@Description("Details of an element in the DOM tree with a LayoutObject.")
public class LayoutTreeNode {

	@Required
	@Description("The index of the related DOM node in the `domNodes` array returned by `getSnapshot`.")
	private int domNodeIndex;

	@Required
	@Description("The bounding box in document coordinates. Note that scroll offset of the document is ignored.")
	private Rect boundingBox;

	@Description("Contents of the LayoutText, if any.")
	private String layoutText;

	@Description("The post-layout inline text nodes, if any.")
	private List<InlineTextBox> inlineTextNodes;

	@Description("Index into the `computedStyles` array returned by `getSnapshot`.")
	private int styleIndex;

	@Description("Global paint order index, which is determined by the stacking order of the nodes. Nodes that are painted together will have the same index. Only provided if includePaintOrder in getSnapshot was true.")
	private int paintOrder;

	@Description("Set to true to indicate the element begins a new stacking context.")
	private boolean isStackingContext;

    public LayoutTreeNode() {
    }

	public int getDomNodeIndex() {
		return this.domNodeIndex;
	}
	public void setDomNodeIndex(int domNodeIndex) {
		this.domNodeIndex = domNodeIndex;
	}
	public Rect getBoundingBox() {
		return this.boundingBox;
	}
	public void setBoundingBox(Rect boundingBox) {
		this.boundingBox = boundingBox;
	}
	public String getLayoutText() {
		return this.layoutText;
	}
	public void setLayoutText(String layoutText) {
		this.layoutText = layoutText;
	}
	public List<InlineTextBox> getInlineTextNodes() {
		return this.inlineTextNodes;
	}
	public void setInlineTextNodes(List<InlineTextBox> inlineTextNodes) {
		this.inlineTextNodes = inlineTextNodes;
	}
	public int getStyleIndex() {
		return this.styleIndex;
	}
	public void setStyleIndex(int styleIndex) {
		this.styleIndex = styleIndex;
	}
	public int getPaintOrder() {
		return this.paintOrder;
	}
	public void setPaintOrder(int paintOrder) {
		this.paintOrder = paintOrder;
	}
	public boolean getIsStackingContext() {
		return this.isStackingContext;
	}
	public void setIsStackingContext(boolean isStackingContext) {
		this.isStackingContext = isStackingContext;
	}
}
