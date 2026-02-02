package ru.hzerr.cdp.type.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Box model.")
public class BoxModel {

	@Required
	@Description("Content box")
	@TypeDescription("An array of quad vertices, x immediately followed by y for each point, points clock-wise.")
	private Number[] content;

	@Required
	@Description("Padding box")
	@TypeDescription("An array of quad vertices, x immediately followed by y for each point, points clock-wise.")
	private Number[] padding;

	@Required
	@Description("Border box")
	@TypeDescription("An array of quad vertices, x immediately followed by y for each point, points clock-wise.")
	private Number[] border;

	@Required
	@Description("Margin box")
	@TypeDescription("An array of quad vertices, x immediately followed by y for each point, points clock-wise.")
	private Number[] margin;

	@Required
	@Description("Node width")
	private int width;

	@Required
	@Description("Node height")
	private int height;

	@Description("Shape outside coordinates")
	private ShapeOutsideInfo shapeOutside;

    public BoxModel() {
    }

	public Number[] getContent() {
		return this.content;
	}
	public void setContent(Number[] content) {
		this.content = content;
	}
	public Number[] getPadding() {
		return this.padding;
	}
	public void setPadding(Number[] padding) {
		this.padding = padding;
	}
	public Number[] getBorder() {
		return this.border;
	}
	public void setBorder(Number[] border) {
		this.border = border;
	}
	public Number[] getMargin() {
		return this.margin;
	}
	public void setMargin(Number[] margin) {
		this.margin = margin;
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public ShapeOutsideInfo getShapeOutside() {
		return this.shapeOutside;
	}
	public void setShapeOutside(ShapeOutsideInfo shapeOutside) {
		this.shapeOutside = shapeOutside;
	}
}
