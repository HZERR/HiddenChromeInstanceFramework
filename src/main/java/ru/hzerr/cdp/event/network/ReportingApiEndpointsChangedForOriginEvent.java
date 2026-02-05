package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import java.util.List;
import ru.hzerr.cdp.type.network.ReportingApiEndpoint;

@Experimental
@Event("reportingApiEndpointsChangedForOrigin")
public class ReportingApiEndpointsChangedForOriginEvent {

	@Required
	@Description("Origin of the document(s) which configured the endpoints.")
	private String origin;

	@Required
	private List<ReportingApiEndpoint> endpoints;

    public ReportingApiEndpointsChangedForOriginEvent() {
    }

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public List<ReportingApiEndpoint> getEndpoints() {
		return this.endpoints;
	}
	public void setEndpoints(List<ReportingApiEndpoint> endpoints) {
		this.endpoints = endpoints;
	}
}
