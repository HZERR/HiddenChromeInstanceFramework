package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.runtime.BindingCalledEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class RuntimeBindingCalledEventProcessor extends AbstractChromeInstanceEventProcessor<BindingCalledEvent> {

    public RuntimeBindingCalledEventProcessor() {
        super("Runtime.bindingCalled", BindingCalledEvent.class);
    }

    @Override
    protected abstract void onEvent(BindingCalledEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Runtime.bindingCalled"; }
}
