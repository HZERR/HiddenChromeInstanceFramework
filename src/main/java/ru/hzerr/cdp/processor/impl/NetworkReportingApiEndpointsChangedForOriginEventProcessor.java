package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.ReportingApiEndpointsChangedForOriginEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkReportingApiEndpointsChangedForOriginEventProcessor extends AbstractChromeInstanceEventProcessor<ReportingApiEndpointsChangedForOriginEvent> {

    public NetworkReportingApiEndpointsChangedForOriginEventProcessor() {
        super("Network.reportingApiEndpointsChangedForOrigin", ReportingApiEndpointsChangedForOriginEvent.class);
    }

    @Override
    protected abstract void onEvent(ReportingApiEndpointsChangedForOriginEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.reportingApiEndpointsChangedForOrigin"; }
}
