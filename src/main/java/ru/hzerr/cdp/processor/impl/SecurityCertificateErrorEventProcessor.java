package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.security.CertificateErrorEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

@Deprecated
public abstract class SecurityCertificateErrorEventProcessor extends AbstractChromeInstanceEventProcessor<CertificateErrorEvent> {

    public SecurityCertificateErrorEventProcessor() {
        super("Security.certificateError", CertificateErrorEvent.class);
    }

    @Override
    protected abstract void onEvent(CertificateErrorEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Security.certificateError"; }
}
