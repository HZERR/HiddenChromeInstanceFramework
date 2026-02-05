package ru.hzerr.cdp.event.security;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Deprecated
@Description("There is a certificate error. If overriding certificate errors is enabled, then it should be handled with the `handleCertificateError` command. Note: this event does not fire if the certificate error has been allowed internally. Only one client per target should override certificate errors at the same time.")
@Event("certificateError")
public class CertificateErrorEvent {

	@Required
	@Description("The ID of the event.")
	private int eventId;

	@Required
	@Description("The type of the error.")
	private String errorType;

	@Required
	@Description("The url that was requested.")
	private String requestURL;

    public CertificateErrorEvent() {
    }

	public int getEventId() {
		return this.eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getErrorType() {
		return this.errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getRequestURL() {
		return this.requestURL;
	}
	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
}
