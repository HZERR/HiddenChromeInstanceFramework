package ru.hzerr.cdp.type.serviceWorker;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("ServiceWorker registration.")
public class ServiceWorkerRegistration {

	@Required
	private String registrationId;

	@Required
	private String scopeURL;

	@Required
	private boolean isDeleted;

    public ServiceWorkerRegistration() {
    }

	public String getRegistrationId() {
		return this.registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getScopeURL() {
		return this.scopeURL;
	}
	public void setScopeURL(String scopeURL) {
		this.scopeURL = scopeURL;
	}
	public boolean getIsDeleted() {
		return this.isDeleted;
	}
	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
