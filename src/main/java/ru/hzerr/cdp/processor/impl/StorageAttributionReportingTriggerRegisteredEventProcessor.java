package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.storage.AttributionReportingTriggerRegisteredEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class StorageAttributionReportingTriggerRegisteredEventProcessor extends AbstractChromeInstanceEventProcessor<AttributionReportingTriggerRegisteredEvent> {

    public StorageAttributionReportingTriggerRegisteredEventProcessor() {
        super("Storage.attributionReportingTriggerRegistered", AttributionReportingTriggerRegisteredEvent.class);
    }

    @Override
    protected abstract void onEvent(AttributionReportingTriggerRegisteredEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Storage.attributionReportingTriggerRegistered"; }
}
