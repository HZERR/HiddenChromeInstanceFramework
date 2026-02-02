package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
public class AttributionReportingFilterPair {

	@Required
	private List<AttributionReportingFilterConfig> filters;

	@Required
	private List<AttributionReportingFilterConfig> notFilters;

    public AttributionReportingFilterPair() {
    }

	public List<AttributionReportingFilterConfig> getFilters() {
		return this.filters;
	}
	public void setFilters(List<AttributionReportingFilterConfig> filters) {
		this.filters = filters;
	}
	public List<AttributionReportingFilterConfig> getNotFilters() {
		return this.notFilters;
	}
	public void setNotFilters(List<AttributionReportingFilterConfig> notFilters) {
		this.notFilters = notFilters;
	}
}
