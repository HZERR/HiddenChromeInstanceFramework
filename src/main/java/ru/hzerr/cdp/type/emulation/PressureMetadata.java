package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Experimental;

@Experimental
public class PressureMetadata {

	private boolean available;

    public PressureMetadata() {
    }

	public boolean getAvailable() {
		return this.available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
