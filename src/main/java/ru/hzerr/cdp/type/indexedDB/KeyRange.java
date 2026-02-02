package ru.hzerr.cdp.type.indexedDB;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Key range.")
public class KeyRange {

	@Description("Lower bound.")
	private Key lower;

	@Description("Upper bound.")
	private Key upper;

	@Required
	@Description("If true lower bound is open.")
	private boolean lowerOpen;

	@Required
	@Description("If true upper bound is open.")
	private boolean upperOpen;

    public KeyRange() {
    }

	public Key getLower() {
		return this.lower;
	}
	public void setLower(Key lower) {
		this.lower = lower;
	}
	public Key getUpper() {
		return this.upper;
	}
	public void setUpper(Key upper) {
		this.upper = upper;
	}
	public boolean getLowerOpen() {
		return this.lowerOpen;
	}
	public void setLowerOpen(boolean lowerOpen) {
		this.lowerOpen = lowerOpen;
	}
	public boolean getUpperOpen() {
		return this.upperOpen;
	}
	public void setUpperOpen(boolean upperOpen) {
		this.upperOpen = upperOpen;
	}
}
