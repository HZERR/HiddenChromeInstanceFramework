package ru.hzerr.cdp.type.serviceWorker;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("ServiceWorker error message.")
public class ServiceWorkerErrorMessage {

	@Required
	private String errorMessage;

	@Required
	private String registrationId;

	@Required
	private String versionId;

	@Required
	private String sourceURL;

	@Required
	private int lineNumber;

	@Required
	private int columnNumber;

    public ServiceWorkerErrorMessage() {
    }

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getRegistrationId() {
		return this.registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getVersionId() {
		return this.versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	public String getSourceURL() {
		return this.sourceURL;
	}
	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}
	public int getLineNumber() {
		return this.lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public int getColumnNumber() {
		return this.columnNumber;
	}
	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}
}
