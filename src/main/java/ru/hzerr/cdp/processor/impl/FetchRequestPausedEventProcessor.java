package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.fetch.RequestPausedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class FetchRequestPausedEventProcessor extends AbstractChromeInstanceEventProcessor<RequestPausedEvent> {

    public FetchRequestPausedEventProcessor() {
        super("Fetch.requestPaused", RequestPausedEvent.class);
    }

    @Override
    protected abstract void onEvent(RequestPausedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Fetch.requestPaused"; }
}
