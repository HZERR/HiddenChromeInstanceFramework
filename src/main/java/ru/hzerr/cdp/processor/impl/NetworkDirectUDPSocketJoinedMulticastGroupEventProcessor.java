package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectUDPSocketJoinedMulticastGroupEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectUDPSocketJoinedMulticastGroupEventProcessor extends AbstractChromeInstanceEventProcessor<DirectUDPSocketJoinedMulticastGroupEvent> {

    public NetworkDirectUDPSocketJoinedMulticastGroupEventProcessor() {
        super("Network.directUDPSocketJoinedMulticastGroup", DirectUDPSocketJoinedMulticastGroupEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectUDPSocketJoinedMulticastGroupEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directUDPSocketJoinedMulticastGroup"; }
}
