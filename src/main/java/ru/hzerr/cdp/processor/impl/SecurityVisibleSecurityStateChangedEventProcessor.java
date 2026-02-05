package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.security.VisibleSecurityStateChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class SecurityVisibleSecurityStateChangedEventProcessor extends AbstractChromeInstanceEventProcessor<VisibleSecurityStateChangedEvent> {

    public SecurityVisibleSecurityStateChangedEventProcessor() {
        super("Security.visibleSecurityStateChanged", VisibleSecurityStateChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(VisibleSecurityStateChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Security.visibleSecurityStateChanged"; }
}
