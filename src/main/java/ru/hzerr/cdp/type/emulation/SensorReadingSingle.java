package ru.hzerr.cdp.type.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class SensorReadingSingle {

	@Required
	private Number value;

    public SensorReadingSingle() {
    }

	public Number getValue() {
		return this.value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
}
