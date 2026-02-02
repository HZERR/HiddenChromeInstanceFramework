package ru.hzerr.generated.performance;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Run-time execution metric.")
public class Metric {

	@Required
	@Description("Metric name.")
	private String name;

	@Required
	@Description("Metric value.")
	private Number value;

    public Metric() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getValue() {
		return this.value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
}
