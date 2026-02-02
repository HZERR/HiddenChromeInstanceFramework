package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Experimental;

@Experimental
public class SensorMetadata {

	private boolean available;

	private Number minimumFrequency;

	private Number maximumFrequency;

    public SensorMetadata() {
    }

	public boolean getAvailable() {
		return this.available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Number getMinimumFrequency() {
		return this.minimumFrequency;
	}
	public void setMinimumFrequency(Number minimumFrequency) {
		this.minimumFrequency = minimumFrequency;
	}
	public Number getMaximumFrequency() {
		return this.maximumFrequency;
	}
	public void setMaximumFrequency(Number maximumFrequency) {
		this.maximumFrequency = maximumFrequency;
	}
}
