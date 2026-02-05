package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAuthn.CredentialUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAuthnCredentialUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<CredentialUpdatedEvent> {

    public WebAuthnCredentialUpdatedEventProcessor() {
        super("WebAuthn.credentialUpdated", CredentialUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(CredentialUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAuthn.credentialUpdated"; }
}
