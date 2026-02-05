package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.PolicyUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkPolicyUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<PolicyUpdatedEvent> {

    public NetworkPolicyUpdatedEventProcessor() {
        super("Network.policyUpdated", PolicyUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(PolicyUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.policyUpdated"; }
}
