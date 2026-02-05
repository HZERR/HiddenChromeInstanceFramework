package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.storage.AttributionReportingSourceRegistration;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
@Event("attributionReportingSourceRegistered")
public class AttributionReportingSourceRegisteredEvent {

	@Required
	private AttributionReportingSourceRegistration registration;

	@Required
	@TypeExperimental
	private String result;

    public AttributionReportingSourceRegisteredEvent() {
    }

	public AttributionReportingSourceRegistration getRegistration() {
		return this.registration;
	}
	public void setRegistration(AttributionReportingSourceRegistration registration) {
		this.registration = registration;
	}
	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
