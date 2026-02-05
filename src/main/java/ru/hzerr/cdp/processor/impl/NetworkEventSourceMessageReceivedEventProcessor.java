package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.EventSourceMessageReceivedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkEventSourceMessageReceivedEventProcessor extends AbstractChromeInstanceEventProcessor<EventSourceMessageReceivedEvent> {

    public NetworkEventSourceMessageReceivedEventProcessor() {
        super("Network.eventSourceMessageReceived", EventSourceMessageReceivedEvent.class);
    }

    @Override
    protected abstract void onEvent(EventSourceMessageReceivedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.eventSourceMessageReceived"; }
}
