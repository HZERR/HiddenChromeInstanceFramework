package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAuthn.CredentialAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAuthnCredentialAddedEventProcessor extends AbstractChromeInstanceEventProcessor<CredentialAddedEvent> {

    public WebAuthnCredentialAddedEventProcessor() {
        super("WebAuthn.credentialAdded", CredentialAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(CredentialAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAuthn.credentialAdded"; }
}
