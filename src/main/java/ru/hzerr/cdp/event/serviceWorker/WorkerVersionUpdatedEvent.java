package ru.hzerr.cdp.event.serviceWorker;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.serviceWorker.ServiceWorkerVersion;

@Event("workerVersionUpdated")
public class WorkerVersionUpdatedEvent {

	@Required
	private List<ServiceWorkerVersion> versions;

    public WorkerVersionUpdatedEvent() {
    }

	public List<ServiceWorkerVersion> getVersions() {
		return this.versions;
	}
	public void setVersions(List<ServiceWorkerVersion> versions) {
		this.versions = versions;
	}
}
