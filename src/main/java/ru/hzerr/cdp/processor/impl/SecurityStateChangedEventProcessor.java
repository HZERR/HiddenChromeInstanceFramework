package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.security.SecurityStateChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

@Deprecated
public abstract class SecurityStateChangedEventProcessor extends AbstractChromeInstanceEventProcessor<SecurityStateChangedEvent> {

    public SecurityStateChangedEventProcessor() {
        super("Security.securityStateChanged", SecurityStateChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(SecurityStateChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Security.securityStateChanged"; }
}
