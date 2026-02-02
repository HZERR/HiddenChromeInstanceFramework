package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class AttributionReportingEventTriggerData {

	@Required
	@TypeExperimental
	private String data;

	@Required
	@TypeExperimental
	private String priority;

	@TypeExperimental
	private String dedupKey;

	@Required
	private AttributionReportingFilterPair filters;

    public AttributionReportingEventTriggerData() {
    }

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
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
