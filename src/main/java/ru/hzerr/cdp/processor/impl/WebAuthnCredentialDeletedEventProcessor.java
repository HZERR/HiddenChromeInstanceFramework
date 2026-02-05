package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAuthn.CredentialDeletedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAuthnCredentialDeletedEventProcessor extends AbstractChromeInstanceEventProcessor<CredentialDeletedEvent> {

    public WebAuthnCredentialDeletedEventProcessor() {
        super("WebAuthn.credentialDeleted", CredentialDeletedEvent.class);
    }

    @Override
    protected abstract void onEvent(CredentialDeletedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAuthn.credentialDeleted"; }
}
