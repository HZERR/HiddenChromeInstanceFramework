package ru.hzerr.cdp.type.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.cdp.type.dom.RGBA;

@Description("Configuration data for the highlighting of Grid elements.")
public class GridHighlightConfig {

	@Description("Whether the extension lines from grid cells to the rulers should be shown (default: false).")
	private boolean showGridExtensionLines;

	@Description("Show Positive line number labels (default: false).")
	private boolean showPositiveLineNumbers;

	@Description("Show Negative line number labels (default: false).")
	private boolean showNegativeLineNumbers;

	@Description("Show area name labels (default: false).")
	private boolean showAreaNames;

	@Description("Show line name labels (default: false).")
	private boolean showLineNames;

	@Description("Show track size labels (default: false).")
	private boolean showTrackSizes;

	@Description("The grid container border highlight color (default: transparent).")
	private RGBA gridBorderColor;

	@Deprecated
	@Description("The cell border color (default: transparent). Deprecated, please use rowLineColor and columnLineColor instead.")
	private RGBA cellBorderColor;

	@Description("The row line color (default: transparent).")
	private RGBA rowLineColor;

	@Description("The column line color (default: transparent).")
	private RGBA columnLineColor;

	@Description("Whether the grid border is dashed (default: false).")
	private boolean gridBorderDash;

	@Deprecated
	@Description("Whether the cell border is dashed (default: false). Deprecated, please us rowLineDash and columnLineDash instead.")
	private boolean cellBorderDash;

	@Description("Whether row lines are dashed (default: false).")
	private boolean rowLineDash;

	@Description("Whether column lines are dashed (default: false).")
	private boolean columnLineDash;

	@Description("The row gap highlight fill color (default: transparent).")
	private RGBA rowGapColor;

	@Description("The row gap hatching fill color (default: transparent).")
	private RGBA rowHatchColor;

	@Description("The column gap highlight fill color (default: transparent).")
	private RGBA columnGapColor;

	@Description("The column gap hatching fill color (default: transparent).")
	private RGBA columnHatchColor;

	@Description("The named grid areas border color (Default: transparent).")
	private RGBA areaBorderColor;

	@Description("The grid container background color (Default: transparent).")
	private RGBA gridBackgroundColor;

    public GridHighlightConfig() {
    }

	public boolean getShowGridExtensionLines() {
		return this.showGridExtensionLines;
	}
	public void setShowGridExtensionLines(boolean showGridExtensionLines) {
		this.showGridExtensionLines = showGridExtensionLines;
	}
	public boolean getShowPositiveLineNumbers() {
		return this.showPositiveLineNumbers;
	}
	public void setShowPositiveLineNumbers(boolean showPositiveLineNumbers) {
		this.showPositiveLineNumbers = showPositiveLineNumbers;
	}
	public boolean getShowNegativeLineNumbers() {
		return this.showNegativeLineNumbers;
	}
	public void setShowNegativeLineNumbers(boolean showNegativeLineNumbers) {
		this.showNegativeLineNumbers = showNegativeLineNumbers;
	}
	public boolean getShowAreaNames() {
		return this.showAreaNames;
	}
	public void setShowAreaNames(boolean showAreaNames) {
		this.showAreaNames = showAreaNames;
	}
	public boolean getShowLineNames() {
		return this.showLineNames;
	}
	public void setShowLineNames(boolean showLineNames) {
		this.showLineNames = showLineNames;
	}
	public boolean getShowTrackSizes() {
		return this.showTrackSizes;
	}
	public void setShowTrackSizes(boolean showTrackSizes) {
		this.showTrackSizes = showTrackSizes;
	}
	public RGBA getGridBorderColor() {
		return this.gridBorderColor;
	}
	public void setGridBorderColor(RGBA gridBorderColor) {
		this.gridBorderColor = gridBorderColor;
	}
	public RGBA getCellBorderColor() {
		return this.cellBorderColor;
	}
	public void setCellBorderColor(RGBA cellBorderColor) {
		this.cellBorderColor = cellBorderColor;
	}
	public RGBA getRowLineColor() {
		return this.rowLineColor;
	}
	public void setRowLineColor(RGBA rowLineColor) {
		this.rowLineColor = rowLineColor;
	}
	public RGBA getColumnLineColor() {
		return this.columnLineColor;
	}
	public void setColumnLineColor(RGBA columnLineColor) {
		this.columnLineColor = columnLineColor;
	}
	public boolean getGridBorderDash() {
		return this.gridBorderDash;
	}
	public void setGridBorderDash(boolean gridBorderDash) {
		this.gridBorderDash = gridBorderDash;
	}
	public boolean getCellBorderDash() {
		return this.cellBorderDash;
	}
	public void setCellBorderDash(boolean cellBorderDash) {
		this.cellBorderDash = cellBorderDash;
	}
	public boolean getRowLineDash() {
		return this.rowLineDash;
	}
	public void setRowLineDash(boolean rowLineDash) {
		this.rowLineDash = rowLineDash;
	}
	public boolean getColumnLineDash() {
		return this.columnLineDash;
	}
	public void setColumnLineDash(boolean columnLineDash) {
		this.columnLineDash = columnLineDash;
	}
	public RGBA getRowGapColor() {
		return this.rowGapColor;
	}
	public void setRowGapColor(RGBA rowGapColor) {
		this.rowGapColor = rowGapColor;
	}
	public RGBA getRowHatchColor() {
		return this.rowHatchColor;
	}
	public void setRowHatchColor(RGBA rowHatchColor) {
		this.rowHatchColor = rowHatchColor;
	}
	public RGBA getColumnGapColor() {
		return this.columnGapColor;
	}
	public void setColumnGapColor(RGBA columnGapColor) {
		this.columnGapColor = columnGapColor;
	}
	public RGBA getColumnHatchColor() {
		return this.columnHatchColor;
	}
	public void setColumnHatchColor(RGBA columnHatchColor) {
		this.columnHatchColor = columnHatchColor;
	}
	public RGBA getAreaBorderColor() {
		return this.areaBorderColor;
	}
	public void setAreaBorderColor(RGBA areaBorderColor) {
		this.areaBorderColor = areaBorderColor;
	}
	public RGBA getGridBackgroundColor() {
		return this.gridBackgroundColor;
	}
	public void setGridBackgroundColor(RGBA gridBackgroundColor) {
		this.gridBackgroundColor = gridBackgroundColor;
	}
}
