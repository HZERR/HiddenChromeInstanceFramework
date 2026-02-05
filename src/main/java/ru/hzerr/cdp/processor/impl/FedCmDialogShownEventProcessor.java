package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.fedCm.DialogShownEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class FedCmDialogShownEventProcessor extends AbstractChromeInstanceEventProcessor<DialogShownEvent> {

    public FedCmDialogShownEventProcessor() {
        super("FedCm.dialogShown", DialogShownEvent.class);
    }

    @Override
    protected abstract void onEvent(DialogShownEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "FedCm.dialogShown"; }
}
