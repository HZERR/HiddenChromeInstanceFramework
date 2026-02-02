package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class AttributionReportingAggregatableValueDictEntry {

	@Required
	private String key;

	@Required
	@Description("number instead of integer because not all uint32 can be represented by int")
	private Number value;

	@Required
	@TypeExperimental
	private String filteringId;

    public AttributionReportingAggregatableValueDictEntry() {
    }

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Number getValue() {
		return this.value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
	public String getFilteringId() {
		return this.filteringId;
	}
	public void setFilteringId(String filteringId) {
		this.filteringId = filteringId;
	}
}
