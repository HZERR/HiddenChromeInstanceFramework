package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.LoadingFinishedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkLoadingFinishedEventProcessor extends AbstractChromeInstanceEventProcessor<LoadingFinishedEvent> {

    public NetworkLoadingFinishedEventProcessor() {
        super("Network.loadingFinished", LoadingFinishedEvent.class);
    }

    @Override
    protected abstract void onEvent(LoadingFinishedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.loadingFinished"; }
}
