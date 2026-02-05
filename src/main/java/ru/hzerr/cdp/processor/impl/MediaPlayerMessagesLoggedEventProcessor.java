package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.media.PlayerMessagesLoggedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class MediaPlayerMessagesLoggedEventProcessor extends AbstractChromeInstanceEventProcessor<PlayerMessagesLoggedEvent> {

    public MediaPlayerMessagesLoggedEventProcessor() {
        super("Media.playerMessagesLogged", PlayerMessagesLoggedEvent.class);
    }

    @Override
    protected abstract void onEvent(PlayerMessagesLoggedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Media.playerMessagesLogged"; }
}
