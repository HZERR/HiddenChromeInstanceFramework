package ru.hzerr.cdp.event.serviceWorker;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.serviceWorker.ServiceWorkerErrorMessage;

@Event("workerErrorReported")
public class WorkerErrorReportedEvent {

	@Required
	private ServiceWorkerErrorMessage errorMessage;

    public WorkerErrorReportedEvent() {
    }

	public ServiceWorkerErrorMessage getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(ServiceWorkerErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}
}
