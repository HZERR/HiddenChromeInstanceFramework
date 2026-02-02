package ru.hzerr.cdp.type.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.annotation.Experimental;

@Description("Table of details of an element in the DOM tree with a LayoutObject.")
public class LayoutTreeSnapshot {

	@Required
	@Description("Index of the corresponding node in the `NodeTreeSnapshot` array returned by `captureSnapshot`.")
	private int[] nodeIndex;

	@Required
	@Description("Array of indexes specifying computed style strings, filtered according to the `computedStyles` parameter passed to `captureSnapshot`.")
	@TypeDescription("Index of the string in the strings table.")
	private List<List<Integer>> styles;

	@Required
	@Description("The absolute position bounding box.")
	private List<List<Number>> bounds;

	@Required
	@Description("Contents of the LayoutText, if any.")
	@TypeDescription("Index of the string in the strings table.")
	private List<Integer> text;

	@Required
	@Description("Stacking context information.")
	private RareBooleanData stackingContexts;

	@Description("Global paint order index, which is determined by the stacking order of the nodes. Nodes that are painted together will have the same index. Only provided if includePaintOrder in captureSnapshot was true.")
	private int[] paintOrders;

	@Description("The offset rect of nodes. Only available when includeDOMRects is set to true")
	private List<List<Number>> offsetRects;

	@Description("The scroll rect of nodes. Only available when includeDOMRects is set to true")
	private List<List<Number>> scrollRects;

	@Description("The client rect of nodes. Only available when includeDOMRects is set to true")
	private List<List<Number>> clientRects;

	@Experimental
	@Description("The list of background colors that are blended with colors of overlapping elements.")
	@TypeDescription("Index of the string in the strings table.")
	private List<Integer> blendedBackgroundColors;

	@Experimental
	@Description("The list of computed text opacities.")
	private Number[] textColorOpacities;

    public LayoutTreeSnapshot() {
    }

	public int[] getNodeIndex() {
		return this.nodeIndex;
	}
	public void setNodeIndex(int[] nodeIndex) {
		this.nodeIndex = nodeIndex;
	}
	public List<List<Integer>> getStyles() {
		return this.styles;
	}
	public void setStyles(List<List<Integer>> styles) {
		this.styles = styles;
	}
	public List<List<Number>> getBounds() {
		return this.bounds;
	}
	public void setBounds(List<List<Number>> bounds) {
		this.bounds = bounds;
	}
	public List<Integer> getText() {
		return this.text;
	}
	public void setText(List<Integer> text) {
		this.text = text;
	}
	public RareBooleanData getStackingContexts() {
		return this.stackingContexts;
	}
	public void setStackingContexts(RareBooleanData stackingContexts) {
		this.stackingContexts = stackingContexts;
	}
	public int[] getPaintOrders() {
		return this.paintOrders;
	}
	public void setPaintOrders(int[] paintOrders) {
		this.paintOrders = paintOrders;
	}
	public List<List<Number>> getOffsetRects() {
		return this.offsetRects;
	}
	public void setOffsetRects(List<List<Number>> offsetRects) {
		this.offsetRects = offsetRects;
	}
	public List<List<Number>> getScrollRects() {
		return this.scrollRects;
	}
	public void setScrollRects(List<List<Number>> scrollRects) {
		this.scrollRects = scrollRects;
	}
	public List<List<Number>> getClientRects() {
		return this.clientRects;
	}
	public void setClientRects(List<List<Number>> clientRects) {
		this.clientRects = clientRects;
	}
	public List<Integer> getBlendedBackgroundColors() {
		return this.blendedBackgroundColors;
	}
	public void setBlendedBackgroundColors(List<Integer> blendedBackgroundColors) {
		this.blendedBackgroundColors = blendedBackgroundColors;
	}
	public Number[] getTextColorOpacities() {
		return this.textColorOpacities;
	}
	public void setTextColorOpacities(Number[] textColorOpacities) {
		this.textColorOpacities = textColorOpacities;
	}
}
