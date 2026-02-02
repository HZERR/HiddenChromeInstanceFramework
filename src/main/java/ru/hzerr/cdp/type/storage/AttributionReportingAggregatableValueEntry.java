package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
public class AttributionReportingAggregatableValueEntry {

	@Required
	private List<AttributionReportingAggregatableValueDictEntry> values;

	@Required
	private AttributionReportingFilterPair filters;

    public AttributionReportingAggregatableValueEntry() {
    }

	public List<AttributionReportingAggregatableValueDictEntry> getValues() {
		return this.values;
	}
	public void setValues(List<AttributionReportingAggregatableValueDictEntry> values) {
		this.values = values;
	}
	public AttributionReportingFilterPair getFilters() {
		return this.filters;
	}
	public void setFilters(AttributionReportingFilterPair filters) {
		this.filters = filters;
	}
}
