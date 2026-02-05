package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.autofill.AddressFormFilledEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AutofillAddressFormFilledEventProcessor extends AbstractChromeInstanceEventProcessor<AddressFormFilledEvent> {

    public AutofillAddressFormFilledEventProcessor() {
        super("Autofill.addressFormFilled", AddressFormFilledEvent.class);
    }

    @Override
    protected abstract void onEvent(AddressFormFilledEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Autofill.addressFormFilled"; }
}
