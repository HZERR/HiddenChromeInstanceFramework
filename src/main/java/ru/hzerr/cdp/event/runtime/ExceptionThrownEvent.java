package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.runtime.ExceptionDetails;

@Description("Issued when exception was thrown and unhandled.")
@Event("exceptionThrown")
public class ExceptionThrownEvent {

	@Required
	@Description("Timestamp of the exception.")
	@TypeDescription("Number of milliseconds since epoch.")
	private Number timestamp;

	@Required
	private ExceptionDetails exceptionDetails;

    public ExceptionThrownEvent() {
    }

	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
	public ExceptionDetails getExceptionDetails() {
		return this.exceptionDetails;
	}
	public void setExceptionDetails(ExceptionDetails exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}
}
