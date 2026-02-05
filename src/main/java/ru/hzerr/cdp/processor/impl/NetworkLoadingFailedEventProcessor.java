package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.LoadingFailedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkLoadingFailedEventProcessor extends AbstractChromeInstanceEventProcessor<LoadingFailedEvent> {

    public NetworkLoadingFailedEventProcessor() {
        super("Network.loadingFailed", LoadingFailedEvent.class);
    }

    @Override
    protected abstract void onEvent(LoadingFailedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.loadingFailed"; }
}
