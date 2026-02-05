package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.network.ReportingApiReport;

@Experimental
@Description("Is sent whenever a new report is added. And after 'enableReportingApi' for all existing reports.")
@Event("reportingApiReportAdded")
public class ReportingApiReportAddedEvent {

	@Required
	private ReportingApiReport report;

    public ReportingApiReportAddedEvent() {
    }

	public ReportingApiReport getReport() {
		return this.report;
	}
	public void setReport(ReportingApiReport report) {
		this.report = report;
	}
}
