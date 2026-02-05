package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.AttributionReportingReportSentEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageAttributionReportingReportSentEventProcessor extends AbstractChromeInstanceEventProcessor<AttributionReportingReportSentEvent> {

    public StorageAttributionReportingReportSentEventProcessor() {
        super("Storage.attributionReportingReportSent", AttributionReportingReportSentEvent.class);
    }

    @Override
    protected abstract void onEvent(AttributionReportingReportSentEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.attributionReportingReportSent"; }
}
