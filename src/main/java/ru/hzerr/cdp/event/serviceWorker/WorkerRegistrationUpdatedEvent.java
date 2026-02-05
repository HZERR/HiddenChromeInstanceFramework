package ru.hzerr.cdp.event.serviceWorker;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.serviceWorker.ServiceWorkerRegistration;

@Event("workerRegistrationUpdated")
public class WorkerRegistrationUpdatedEvent {

	@Required
	private List<ServiceWorkerRegistration> registrations;

    public WorkerRegistrationUpdatedEvent() {
    }

	public List<ServiceWorkerRegistration> getRegistrations() {
		return this.registrations;
	}
	public void setRegistrations(List<ServiceWorkerRegistration> registrations) {
		this.registrations = registrations;
	}
}
