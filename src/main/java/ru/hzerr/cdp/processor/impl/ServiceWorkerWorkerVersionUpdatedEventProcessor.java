package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.serviceWorker.WorkerVersionUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class ServiceWorkerWorkerVersionUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<WorkerVersionUpdatedEvent> {

    public ServiceWorkerWorkerVersionUpdatedEventProcessor() {
        super("ServiceWorker.workerVersionUpdated", WorkerVersionUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(WorkerVersionUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "ServiceWorker.workerVersionUpdated"; }
}
