package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.tracing.DataCollectedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class TracingDataCollectedEventProcessor extends AbstractChromeInstanceEventProcessor<DataCollectedEvent> {

    public TracingDataCollectedEventProcessor() {
        super("Tracing.dataCollected", DataCollectedEvent.class);
    }

    @Override
    protected abstract void onEvent(DataCollectedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Tracing.dataCollected"; }
}
