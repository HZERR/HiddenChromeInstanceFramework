package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class AttributionReportingAggregationKeysEntry {

	@Required
	private String key;

	@Required
	@TypeExperimental
	private String value;

    public AttributionReportingAggregationKeysEntry() {
    }

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
