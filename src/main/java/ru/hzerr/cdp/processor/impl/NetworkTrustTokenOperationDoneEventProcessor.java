package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.TrustTokenOperationDoneEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkTrustTokenOperationDoneEventProcessor extends AbstractChromeInstanceEventProcessor<TrustTokenOperationDoneEvent> {

    public NetworkTrustTokenOperationDoneEventProcessor() {
        super("Network.trustTokenOperationDone", TrustTokenOperationDoneEvent.class);
    }

    @Override
    protected abstract void onEvent(TrustTokenOperationDoneEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.trustTokenOperationDone"; }
}
