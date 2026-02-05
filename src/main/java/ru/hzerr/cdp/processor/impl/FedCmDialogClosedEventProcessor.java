package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.fedCm.DialogClosedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class FedCmDialogClosedEventProcessor extends AbstractChromeInstanceEventProcessor<DialogClosedEvent> {

    public FedCmDialogClosedEventProcessor() {
        super("FedCm.dialogClosed", DialogClosedEvent.class);
    }

    @Override
    protected abstract void onEvent(DialogClosedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "FedCm.dialogClosed"; }
}
