package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.AttributionReportingVerboseDebugReportSentEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageAttributionReportingVerboseDebugReportSentEventProcessor extends AbstractChromeInstanceEventProcessor<AttributionReportingVerboseDebugReportSentEvent> {

    public StorageAttributionReportingVerboseDebugReportSentEventProcessor() {
        super("Storage.attributionReportingVerboseDebugReportSent", AttributionReportingVerboseDebugReportSentEvent.class);
    }

    @Override
    protected abstract void onEvent(AttributionReportingVerboseDebugReportSentEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.attributionReportingVerboseDebugReportSent"; }
}
