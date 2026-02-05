package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.backgroundService.BackgroundServiceEventReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class BackgroundServiceEventReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<BackgroundServiceEventReceivedEvent> {

    public BackgroundServiceEventReceivedEventProcessor() {
        super("BackgroundService.backgroundServiceEventReceived", BackgroundServiceEventReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(BackgroundServiceEventReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "BackgroundService.backgroundServiceEventReceived"; }
}
