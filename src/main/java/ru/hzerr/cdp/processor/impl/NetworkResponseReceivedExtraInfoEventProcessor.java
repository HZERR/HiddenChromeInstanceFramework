package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.ResponseReceivedExtraInfoEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkResponseReceivedExtraInfoEventProcessor extends AbstractChromeInstanceEventProcessor<ResponseReceivedExtraInfoEvent> {

    public NetworkResponseReceivedExtraInfoEventProcessor() {
        super("Network.responseReceivedExtraInfo", ResponseReceivedExtraInfoEvent.class);
    }

    @Override
    protected abstract void onEvent(ResponseReceivedExtraInfoEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.responseReceivedExtraInfo"; }
}
