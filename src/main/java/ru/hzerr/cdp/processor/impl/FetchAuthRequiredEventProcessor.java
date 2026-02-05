package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.fetch.AuthRequiredEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class FetchAuthRequiredEventProcessor extends AbstractChromeInstanceEventProcessor<AuthRequiredEvent> {

    public FetchAuthRequiredEventProcessor() {
        super("Fetch.authRequired", AuthRequiredEvent.class);
    }

    @Override
    protected abstract void onEvent(AuthRequiredEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Fetch.authRequired"; }
}
