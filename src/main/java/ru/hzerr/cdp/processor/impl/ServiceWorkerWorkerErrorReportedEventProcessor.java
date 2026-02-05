package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.serviceWorker.WorkerErrorReportedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class ServiceWorkerWorkerErrorReportedEventProcessor extends AbstractChromeInstanceEventProcessor<WorkerErrorReportedEvent> {

    public ServiceWorkerWorkerErrorReportedEventProcessor() {
        super("ServiceWorker.workerErrorReported", WorkerErrorReportedEvent.class);
    }

    @Override
    protected abstract void onEvent(WorkerErrorReportedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "ServiceWorker.workerErrorReported"; }
}
