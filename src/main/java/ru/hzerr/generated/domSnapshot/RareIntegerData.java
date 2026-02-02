package ru.hzerr.generated.domSnapshot;

import ru.hzerr.annotation.Required;

public class RareIntegerData {

	@Required
	private int[] index;

	@Required
	private int[] value;

    public RareIntegerData() {
    }

	public int[] getIndex() {
		return this.index;
	}
	public void setIndex(int[] index) {
		this.index = index;
	}
	public int[] getValue() {
		return this.value;
	}
	public void setValue(int[] value) {
		this.value = value;
	}
}
