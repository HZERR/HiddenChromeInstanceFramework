package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.RequestWillBeSentExtraInfoEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkRequestWillBeSentExtraInfoEventProcessor extends AbstractChromeInstanceEventProcessor<RequestWillBeSentExtraInfoEvent> {

    public NetworkRequestWillBeSentExtraInfoEventProcessor() {
        super("Network.requestWillBeSentExtraInfo", RequestWillBeSentExtraInfoEvent.class);
    }

    @Override
    protected abstract void onEvent(RequestWillBeSentExtraInfoEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.requestWillBeSentExtraInfo"; }
}
