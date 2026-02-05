package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.network.DirectUDPSocketOpenedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class NetworkDirectUDPSocketOpenedEventProcessor extends AbstractChromeInstanceEventProcessor<DirectUDPSocketOpenedEvent> {

    public NetworkDirectUDPSocketOpenedEventProcessor() {
        super("Network.directUDPSocketOpened", DirectUDPSocketOpenedEvent.class);
    }

    @Override
    protected abstract void onEvent(DirectUDPSocketOpenedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Network.directUDPSocketOpened"; }
}
