package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.SignedExchangeReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkSignedExchangeReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<SignedExchangeReceivedEvent> {

    public NetworkSignedExchangeReceivedEventProcessor() {
        super("Network.signedExchangeReceived", SignedExchangeReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(SignedExchangeReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.signedExchangeReceived"; }
}
