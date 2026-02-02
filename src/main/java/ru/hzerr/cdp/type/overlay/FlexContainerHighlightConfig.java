package ru.hzerr.cdp.type.overlay;

import ru.hzerr.annotation.Description;

@Description("Configuration data for the highlighting of Flex container elements.")
public class FlexContainerHighlightConfig {

	@Description("The style of the container border")
	private LineStyle containerBorder;

	@Description("The style of the separator between lines")
	private LineStyle lineSeparator;

	@Description("The style of the separator between items")
	private LineStyle itemSeparator;

	@Description("Style of content-distribution space on the main axis (justify-content).")
	private BoxStyle mainDistributedSpace;

	@Description("Style of content-distribution space on the cross axis (align-content).")
	private BoxStyle crossDistributedSpace;

	@Description("Style of empty space caused by row gaps (gap/row-gap).")
	private BoxStyle rowGapSpace;

	@Description("Style of empty space caused by columns gaps (gap/column-gap).")
	private BoxStyle columnGapSpace;

	@Description("Style of the self-alignment line (align-items).")
	private LineStyle crossAlignment;

    public FlexContainerHighlightConfig() {
    }

	public LineStyle getContainerBorder() {
		return this.containerBorder;
	}
	public void setContainerBorder(LineStyle containerBorder) {
		this.containerBorder = containerBorder;
	}
	public LineStyle getLineSeparator() {
		return this.lineSeparator;
	}
	public void setLineSeparator(LineStyle lineSeparator) {
		this.lineSeparator = lineSeparator;
	}
	public LineStyle getItemSeparator() {
		return this.itemSeparator;
	}
	public void setItemSeparator(LineStyle itemSeparator) {
		this.itemSeparator = itemSeparator;
	}
	public BoxStyle getMainDistributedSpace() {
		return this.mainDistributedSpace;
	}
	public void setMainDistributedSpace(BoxStyle mainDistributedSpace) {
		this.mainDistributedSpace = mainDistributedSpace;
	}
	public BoxStyle getCrossDistributedSpace() {
		return this.crossDistributedSpace;
	}
	public void setCrossDistributedSpace(BoxStyle crossDistributedSpace) {
		this.crossDistributedSpace = crossDistributedSpace;
	}
	public BoxStyle getRowGapSpace() {
		return this.rowGapSpace;
	}
	public void setRowGapSpace(BoxStyle rowGapSpace) {
		this.rowGapSpace = rowGapSpace;
	}
	public BoxStyle getColumnGapSpace() {
		return this.columnGapSpace;
	}
	public void setColumnGapSpace(BoxStyle columnGapSpace) {
		this.columnGapSpace = columnGapSpace;
	}
	public LineStyle getCrossAlignment() {
		return this.crossAlignment;
	}
	public void setCrossAlignment(LineStyle crossAlignment) {
		this.crossAlignment = crossAlignment;
	}
}
