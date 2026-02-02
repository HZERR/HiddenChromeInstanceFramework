package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.Required;

@Experimental
public class AttributionReportingAggregatableDedupKey {

	@TypeExperimental
	private String dedupKey;

	@Required
	private AttributionReportingFilterPair filters;

    public AttributionReportingAggregatableDedupKey() {
    }

	public String getDedupKey() {
		return this.dedupKey;
	}
	public void setDedupKey(String dedupKey) {
		this.dedupKey = dedupKey;
	}
	public AttributionReportingFilterPair getFilters() {
		return this.filters;
	}
	public void setFilters(AttributionReportingFilterPair filters) {
		this.filters = filters;
	}
}
