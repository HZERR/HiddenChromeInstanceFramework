package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Experimental;

@Experimental
public class SensorReading {

	private SensorReadingSingle single;

	private SensorReadingXYZ xyz;

	private SensorReadingQuaternion quaternion;

    public SensorReading() {
    }

	public SensorReadingSingle getSingle() {
		return this.single;
	}
	public void setSingle(SensorReadingSingle single) {
		this.single = single;
	}
	public SensorReadingXYZ getXyz() {
		return this.xyz;
	}
	public void setXyz(SensorReadingXYZ xyz) {
		this.xyz = xyz;
	}
	public SensorReadingQuaternion getQuaternion() {
		return this.quaternion;
	}
	public void setQuaternion(SensorReadingQuaternion quaternion) {
		this.quaternion = quaternion;
	}
}
