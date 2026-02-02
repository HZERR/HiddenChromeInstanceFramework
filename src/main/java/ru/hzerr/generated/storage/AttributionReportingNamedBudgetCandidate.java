package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class AttributionReportingNamedBudgetCandidate {

	private String name;

	@Required
	private AttributionReportingFilterPair filters;

    public AttributionReportingNamedBudgetCandidate() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AttributionReportingFilterPair getFilters() {
		return this.filters;
	}
	public void setFilters(AttributionReportingFilterPair filters) {
		this.filters = filters;
	}
}
