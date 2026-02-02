package ru.hzerr.cdp.type.input;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Experimental;

public class TouchPoint {

	@Required
	@Description("X coordinate of the event relative to the main frame's viewport in CSS pixels.")
	private Number x;

	@Required
	@Description("Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.")
	private Number y;

	@Description("X radius of the touch area (default: 1.0).")
	private Number radiusX;

	@Description("Y radius of the touch area (default: 1.0).")
	private Number radiusY;

	@Description("Rotation angle (default: 0.0).")
	private Number rotationAngle;

	@Description("Force (default: 1.0).")
	private Number force;

	@Experimental
	@Description("The normalized tangential pressure, which has a range of [-1,1] (default: 0).")
	private Number tangentialPressure;

	@Description("The plane angle between the Y-Z plane and the plane containing both the stylus axis and the Y axis, in degrees of the range [-90,90], a positive tiltX is to the right (default: 0)")
	private Number tiltX;

	@Description("The plane angle between the X-Z plane and the plane containing both the stylus axis and the X axis, in degrees of the range [-90,90], a positive tiltY is towards the user (default: 0).")
	private Number tiltY;

	@Experimental
	@Description("The clockwise rotation of a pen stylus around its own major axis, in degrees in the range [0,359] (default: 0).")
	private int twist;

	@Description("Identifier used to track touch sources between events, must be unique within an event.")
	private Number id;

    public TouchPoint() {
    }

	public Number getX() {
		return this.x;
	}
	public void setX(Number x) {
		this.x = x;
	}
	public Number getY() {
		return this.y;
	}
	public void setY(Number y) {
		this.y = y;
	}
	public Number getRadiusX() {
		return this.radiusX;
	}
	public void setRadiusX(Number radiusX) {
		this.radiusX = radiusX;
	}
	public Number getRadiusY() {
		return this.radiusY;
	}
	public void setRadiusY(Number radiusY) {
		this.radiusY = radiusY;
	}
	public Number getRotationAngle() {
		return this.rotationAngle;
	}
	public void setRotationAngle(Number rotationAngle) {
		this.rotationAngle = rotationAngle;
	}
	public Number getForce() {
		return this.force;
	}
	public void setForce(Number force) {
		this.force = force;
	}
	public Number getTangentialPressure() {
		return this.tangentialPressure;
	}
	public void setTangentialPressure(Number tangentialPressure) {
		this.tangentialPressure = tangentialPressure;
	}
	public Number getTiltX() {
		return this.tiltX;
	}
	public void setTiltX(Number tiltX) {
		this.tiltX = tiltX;
	}
	public Number getTiltY() {
		return this.tiltY;
	}
	public void setTiltY(Number tiltY) {
		this.tiltY = tiltY;
	}
	public int getTwist() {
		return this.twist;
	}
	public void setTwist(int twist) {
		this.twist = twist;
	}
	public Number getId() {
		return this.id;
	}
	public void setId(Number id) {
		this.id = id;
	}
}
