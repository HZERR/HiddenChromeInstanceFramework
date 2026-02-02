package ru.hzerr.cdp.type.domSnapshot;

import ru.hzerr.annotation.Required;

public class RareBooleanData {

	@Required
	private int[] index;

    public RareBooleanData() {
    }

	public int[] getIndex() {
		return this.index;
	}
	public void setIndex(int[] index) {
		this.index = index;
	}
}
