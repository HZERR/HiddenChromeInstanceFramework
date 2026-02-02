package ru.hzerr.generated.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("CSS Shape Outside details.")
public class ShapeOutsideInfo {

	@Required
	@Description("Shape bounds")
	@TypeDescription("An array of quad vertices, x immediately followed by y for each point, points clock-wise.")
	private Number[] bounds;

	@Required
	@Description("Shape coordinate details")
	private Object[] shape;

	@Required
	@Description("Margin shape bounds")
	private Object[] marginShape;

    public ShapeOutsideInfo() {
    }

	public Number[] getBounds() {
		return this.bounds;
	}
	public void setBounds(Number[] bounds) {
		this.bounds = bounds;
	}
	public Object[] getShape() {
		return this.shape;
	}
	public void setShape(Object[] shape) {
		this.shape = shape;
	}
	public Object[] getMarginShape() {
		return this.marginShape;
	}
	public void setMarginShape(Object[] marginShape) {
		this.marginShape = marginShape;
	}
}
