package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class AttributionReportingFilterDataEntry {

	@Required
	private String key;

	@Required
	private String[] values;

    public AttributionReportingFilterDataEntry() {
    }

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String[] getValues() {
		return this.values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
}
