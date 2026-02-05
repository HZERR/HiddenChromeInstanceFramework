package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.webAuthn.CredentialAssertedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class WebAuthnCredentialAssertedEventProcessor extends AbstractChromeInstanceEventProcessor<CredentialAssertedEvent> {

    public WebAuthnCredentialAssertedEventProcessor() {
        super("WebAuthn.credentialAsserted", CredentialAssertedEvent.class);
    }

    @Override
    protected abstract void onEvent(CredentialAssertedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "WebAuthn.credentialAsserted"; }
}
