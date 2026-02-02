package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class AttributionScopesData {

	@Required
	private String[] values;

	@Required
	@Description("number instead of integer because not all uint32 can be represented by int")
	private Number limit;

	@Required
	private Number maxEventStates;

    public AttributionScopesData() {
    }

	public String[] getValues() {
		return this.values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	public Number getLimit() {
		return this.limit;
	}
	public void setLimit(Number limit) {
		this.limit = limit;
	}
	public Number getMaxEventStates() {
		return this.maxEventStates;
	}
	public void setMaxEventStates(Number maxEventStates) {
		this.maxEventStates = maxEventStates;
	}
}
