package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.AttributionReportingSourceRegisteredEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageAttributionReportingSourceRegisteredEventProcessor extends AbstractChromeInstanceEventProcessor<AttributionReportingSourceRegisteredEvent> {

    public StorageAttributionReportingSourceRegisteredEventProcessor() {
        super("Storage.attributionReportingSourceRegistered", AttributionReportingSourceRegisteredEvent.class);
    }

    @Override
    protected abstract void onEvent(AttributionReportingSourceRegisteredEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.attributionReportingSourceRegistered"; }
}
