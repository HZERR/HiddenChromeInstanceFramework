package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.ResourceChangedPriorityEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkResourceChangedPriorityEventProcessor extends AbstractChromeInstanceEventProcessor<ResourceChangedPriorityEvent> {

    public NetworkResourceChangedPriorityEventProcessor() {
        super("Network.resourceChangedPriority", ResourceChangedPriorityEvent.class);
    }

    @Override
    protected abstract void onEvent(ResourceChangedPriorityEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.resourceChangedPriority"; }
}
