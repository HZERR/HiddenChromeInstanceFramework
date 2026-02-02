package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Pair of reporting metadata details for a candidate URL for `selectURL()`.")
public class SharedStorageReportingMetadata {

	@Required
	private String eventType;

	@Required
	private String reportingUrl;

    public SharedStorageReportingMetadata() {
    }

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getReportingUrl() {
		return this.reportingUrl;
	}
	public void setReportingUrl(String reportingUrl) {
		this.reportingUrl = reportingUrl;
	}
}
