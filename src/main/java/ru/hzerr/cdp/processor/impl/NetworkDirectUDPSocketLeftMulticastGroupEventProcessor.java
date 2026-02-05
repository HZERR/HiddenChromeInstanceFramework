package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectUDPSocketLeftMulticastGroupEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectUDPSocketLeftMulticastGroupEventProcessor extends AbstractChromeInstanceEventProcessor<DirectUDPSocketLeftMulticastGroupEvent> {

    public NetworkDirectUDPSocketLeftMulticastGroupEventProcessor() {
        super("Network.directUDPSocketLeftMulticastGroup", DirectUDPSocketLeftMulticastGroupEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectUDPSocketLeftMulticastGroupEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directUDPSocketLeftMulticastGroup"; }
}
