package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.storage.AttributionReportingTriggerRegistration;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
@Event("attributionReportingTriggerRegistered")
public class AttributionReportingTriggerRegisteredEvent {

	@Required
	private AttributionReportingTriggerRegistration registration;

	@Required
	@TypeExperimental
	private String eventLevel;

	@Required
	@TypeExperimental
	private String aggregatable;

    public AttributionReportingTriggerRegisteredEvent() {
    }

	public AttributionReportingTriggerRegistration getRegistration() {
		return this.registration;
	}
	public void setRegistration(AttributionReportingTriggerRegistration registration) {
		this.registration = registration;
	}
	public String getEventLevel() {
		return this.eventLevel;
	}
	public void setEventLevel(String eventLevel) {
		this.eventLevel = eventLevel;
	}
	public String getAggregatable() {
		return this.aggregatable;
	}
	public void setAggregatable(String aggregatable) {
		this.aggregatable = aggregatable;
	}
}
