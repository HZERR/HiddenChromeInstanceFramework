package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.ResponseReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkResponseReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<ResponseReceivedEvent> {

    public NetworkResponseReceivedEventProcessor() {
        super("Network.responseReceived", ResponseReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(ResponseReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.responseReceived"; }
}
