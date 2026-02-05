package ru.hzerr.cdp.event.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Issued when unhandled exception was revoked.")
@Event("exceptionRevoked")
public class ExceptionRevokedEvent {

	@Required
	@Description("Reason describing why exception was revoked.")
	private String reason;

	@Required
	@Description("The id of revoked exception, as reported in `exceptionThrown`.")
	private int exceptionId;

    public ExceptionRevokedEvent() {
    }

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getExceptionId() {
		return this.exceptionId;
	}
	public void setExceptionId(int exceptionId) {
		this.exceptionId = exceptionId;
	}
}
