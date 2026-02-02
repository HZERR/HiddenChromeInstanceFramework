package ru.hzerr.generated.log;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Violation configuration setting.")
public class ViolationSetting {

	@Required
	@Description("Violation type.")
	@Enum({"longTask", "longLayout", "blockedEvent", "blockedParser", "discouragedAPIUse", "handler", "recurringHandler"})
	private String name;

	@Required
	@Description("Time threshold to trigger upon.")
	private Number threshold;

    public ViolationSetting() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getThreshold() {
		return this.threshold;
	}
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
	}
}
