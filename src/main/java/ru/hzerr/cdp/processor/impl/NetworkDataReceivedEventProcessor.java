package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DataReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDataReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<DataReceivedEvent> {

    public NetworkDataReceivedEventProcessor() {
        super("Network.dataReceived", DataReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(DataReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.dataReceived"; }
}
