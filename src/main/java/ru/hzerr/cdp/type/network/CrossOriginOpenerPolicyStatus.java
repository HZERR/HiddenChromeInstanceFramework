package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class CrossOriginOpenerPolicyStatus {

	@Required
	@TypeExperimental
	private String value;

	@Required
	@TypeExperimental
	private String reportOnlyValue;

	private String reportingEndpoint;

	private String reportOnlyReportingEndpoint;

    public CrossOriginOpenerPolicyStatus() {
    }

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getReportOnlyValue() {
		return this.reportOnlyValue;
	}
	public void setReportOnlyValue(String reportOnlyValue) {
		this.reportOnlyValue = reportOnlyValue;
	}
	public String getReportingEndpoint() {
		return this.reportingEndpoint;
	}
	public void setReportingEndpoint(String reportingEndpoint) {
		this.reportingEndpoint = reportingEndpoint;
	}
	public String getReportOnlyReportingEndpoint() {
		return this.reportOnlyReportingEndpoint;
	}
	public void setReportOnlyReportingEndpoint(String reportOnlyReportingEndpoint) {
		this.reportOnlyReportingEndpoint = reportOnlyReportingEndpoint;
	}
}
