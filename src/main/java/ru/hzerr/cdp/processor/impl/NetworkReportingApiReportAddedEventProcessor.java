package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.ReportingApiReportAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkReportingApiReportAddedEventProcessor extends AbstractChromeInstanceEventProcessor<ReportingApiReportAddedEvent> {

    public NetworkReportingApiReportAddedEventProcessor() {
        super("Network.reportingApiReportAdded", ReportingApiReportAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(ReportingApiReportAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.reportingApiReportAdded"; }
}
