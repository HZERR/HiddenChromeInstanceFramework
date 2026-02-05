package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.serviceWorker.WorkerRegistrationUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class ServiceWorkerWorkerRegistrationUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<WorkerRegistrationUpdatedEvent> {

    public ServiceWorkerWorkerRegistrationUpdatedEventProcessor() {
        super("ServiceWorker.workerRegistrationUpdated", WorkerRegistrationUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(WorkerRegistrationUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "ServiceWorker.workerRegistrationUpdated"; }
}
