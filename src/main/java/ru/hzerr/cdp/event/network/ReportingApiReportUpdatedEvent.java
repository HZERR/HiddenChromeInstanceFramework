package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.network.ReportingApiReport;

@Experimental
@Event("reportingApiReportUpdated")
public class ReportingApiReportUpdatedEvent {

	@Required
	private ReportingApiReport report;

    public ReportingApiReportUpdatedEvent() {
    }

	public ReportingApiReport getReport() {
		return this.report;
	}
	public void setReport(ReportingApiReport report) {
		this.report = report;
	}
}
