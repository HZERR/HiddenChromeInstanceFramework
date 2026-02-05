package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.ResponseReceivedEarlyHintsEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkResponseReceivedEarlyHintsEventProcessor extends AbstractChromeInstanceEventProcessor<ResponseReceivedEarlyHintsEvent> {

    public NetworkResponseReceivedEarlyHintsEventProcessor() {
        super("Network.responseReceivedEarlyHints", ResponseReceivedEarlyHintsEvent.class);
    }

    @Override
    protected abstract void onEvent(ResponseReceivedEarlyHintsEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.responseReceivedEarlyHints"; }
}
