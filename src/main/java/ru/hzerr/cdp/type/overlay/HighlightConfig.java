package ru.hzerr.cdp.type.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.cdp.type.dom.RGBA;

@Description("Configuration data for the highlighting of page elements.")
public class HighlightConfig {

	@Description("Whether the node info tooltip should be shown (default: false).")
	private boolean showInfo;

	@Description("Whether the node styles in the tooltip (default: false).")
	private boolean showStyles;

	@Description("Whether the rulers should be shown (default: false).")
	private boolean showRulers;

	@Description("Whether the a11y info should be shown (default: true).")
	private boolean showAccessibilityInfo;

	@Description("Whether the extension lines from node to the rulers should be shown (default: false).")
	private boolean showExtensionLines;

	@Description("The content box highlight fill color (default: transparent).")
	private RGBA contentColor;

	@Description("The padding highlight fill color (default: transparent).")
	private RGBA paddingColor;

	@Description("The border highlight fill color (default: transparent).")
	private RGBA borderColor;

	@Description("The margin highlight fill color (default: transparent).")
	private RGBA marginColor;

	@Description("The event target element highlight fill color (default: transparent).")
	private RGBA eventTargetColor;

	@Description("The shape outside fill color (default: transparent).")
	private RGBA shapeColor;

	@Description("The shape margin fill color (default: transparent).")
	private RGBA shapeMarginColor;

	@Description("The grid layout color (default: transparent).")
	private RGBA cssGridColor;

	@Description("The color format used to format color styles (default: hex).")
	private String colorFormat;

	@Description("The grid layout highlight configuration (default: all transparent).")
	private GridHighlightConfig gridHighlightConfig;

	@Description("The flex container highlight configuration (default: all transparent).")
	private FlexContainerHighlightConfig flexContainerHighlightConfig;

	@Description("The flex item highlight configuration (default: all transparent).")
	private FlexItemHighlightConfig flexItemHighlightConfig;

	@Description("The contrast algorithm to use for the contrast ratio (default: aa).")
	private String contrastAlgorithm;

	@Description("The container query container highlight configuration (default: all transparent).")
	private ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig;

    public HighlightConfig() {
    }

	public boolean getShowInfo() {
		return this.showInfo;
	}
	public void setShowInfo(boolean showInfo) {
		this.showInfo = showInfo;
	}
	public boolean getShowStyles() {
		return this.showStyles;
	}
	public void setShowStyles(boolean showStyles) {
		this.showStyles = showStyles;
	}
	public boolean getShowRulers() {
		return this.showRulers;
	}
	public void setShowRulers(boolean showRulers) {
		this.showRulers = showRulers;
	}
	public boolean getShowAccessibilityInfo() {
		return this.showAccessibilityInfo;
	}
	public void setShowAccessibilityInfo(boolean showAccessibilityInfo) {
		this.showAccessibilityInfo = showAccessibilityInfo;
	}
	public boolean getShowExtensionLines() {
		return this.showExtensionLines;
	}
	public void setShowExtensionLines(boolean showExtensionLines) {
		this.showExtensionLines = showExtensionLines;
	}
	public RGBA getContentColor() {
		return this.contentColor;
	}
	public void setContentColor(RGBA contentColor) {
		this.contentColor = contentColor;
	}
	public RGBA getPaddingColor() {
		return this.paddingColor;
	}
	public void setPaddingColor(RGBA paddingColor) {
		this.paddingColor = paddingColor;
	}
	public RGBA getBorderColor() {
		return this.borderColor;
	}
	public void setBorderColor(RGBA borderColor) {
		this.borderColor = borderColor;
	}
	public RGBA getMarginColor() {
		return this.marginColor;
	}
	public void setMarginColor(RGBA marginColor) {
		this.marginColor = marginColor;
	}
	public RGBA getEventTargetColor() {
		return this.eventTargetColor;
	}
	public void setEventTargetColor(RGBA eventTargetColor) {
		this.eventTargetColor = eventTargetColor;
	}
	public RGBA getShapeColor() {
		return this.shapeColor;
	}
	public void setShapeColor(RGBA shapeColor) {
		this.shapeColor = shapeColor;
	}
	public RGBA getShapeMarginColor() {
		return this.shapeMarginColor;
	}
	public void setShapeMarginColor(RGBA shapeMarginColor) {
		this.shapeMarginColor = shapeMarginColor;
	}
	public RGBA getCssGridColor() {
		return this.cssGridColor;
	}
	public void setCssGridColor(RGBA cssGridColor) {
		this.cssGridColor = cssGridColor;
	}
	public String getColorFormat() {
		return this.colorFormat;
	}
	public void setColorFormat(String colorFormat) {
		this.colorFormat = colorFormat;
	}
	public GridHighlightConfig getGridHighlightConfig() {
		return this.gridHighlightConfig;
	}
	public void setGridHighlightConfig(GridHighlightConfig gridHighlightConfig) {
		this.gridHighlightConfig = gridHighlightConfig;
	}
	public FlexContainerHighlightConfig getFlexContainerHighlightConfig() {
		return this.flexContainerHighlightConfig;
	}
	public void setFlexContainerHighlightConfig(FlexContainerHighlightConfig flexContainerHighlightConfig) {
		this.flexContainerHighlightConfig = flexContainerHighlightConfig;
	}
	public FlexItemHighlightConfig getFlexItemHighlightConfig() {
		return this.flexItemHighlightConfig;
	}
	public void setFlexItemHighlightConfig(FlexItemHighlightConfig flexItemHighlightConfig) {
		this.flexItemHighlightConfig = flexItemHighlightConfig;
	}
	public String getContrastAlgorithm() {
		return this.contrastAlgorithm;
	}
	public void setContrastAlgorithm(String contrastAlgorithm) {
		this.contrastAlgorithm = contrastAlgorithm;
	}
	public ContainerQueryContainerHighlightConfig getContainerQueryContainerHighlightConfig() {
		return this.containerQueryContainerHighlightConfig;
	}
	public void setContainerQueryContainerHighlightConfig(ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig) {
		this.containerQueryContainerHighlightConfig = containerQueryContainerHighlightConfig;
	}
}
