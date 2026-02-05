package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.media.PlayerCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class MediaPlayerCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<PlayerCreatedEvent> {

    public MediaPlayerCreatedEventProcessor() {
        super("Media.playerCreated", PlayerCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(PlayerCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Media.playerCreated"; }
}
