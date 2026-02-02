package ru.hzerr.cdp.type.browser;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Chrome histogram bucket.")
public class Bucket {

	@Required
	@Description("Minimum value (inclusive).")
	private int low;

	@Required
	@Description("Maximum value (exclusive).")
	private int high;

	@Required
	@Description("Number of samples.")
	private int count;

    public Bucket() {
    }

	public int getLow() {
		return this.low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHigh() {
		return this.high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
