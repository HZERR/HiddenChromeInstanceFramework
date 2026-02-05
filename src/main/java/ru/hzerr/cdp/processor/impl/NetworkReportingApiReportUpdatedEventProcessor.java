package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.ReportingApiReportUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkReportingApiReportUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<ReportingApiReportUpdatedEvent> {

    public NetworkReportingApiReportUpdatedEventProcessor() {
        super("Network.reportingApiReportUpdated", ReportingApiReportUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(ReportingApiReportUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.reportingApiReportUpdated"; }
}
