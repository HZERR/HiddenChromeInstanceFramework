package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class SensorReadingQuaternion {

	@Required
	private Number x;

	@Required
	private Number y;

	@Required
	private Number z;

	@Required
	private Number w;

    public SensorReadingQuaternion() {
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
	public Number getZ() {
		return this.z;
	}
	public void setZ(Number z) {
		this.z = z;
	}
	public Number getW() {
		return this.w;
	}
	public void setW(Number w) {
		this.w = w;
	}
}
