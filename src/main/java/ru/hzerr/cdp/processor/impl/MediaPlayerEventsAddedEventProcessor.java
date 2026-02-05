package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.media.PlayerEventsAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class MediaPlayerEventsAddedEventProcessor extends AbstractChromeInstanceEventProcessor<PlayerEventsAddedEvent> {

    public MediaPlayerEventsAddedEventProcessor() {
        super("Media.playerEventsAdded", PlayerEventsAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(PlayerEventsAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Media.playerEventsAdded"; }
}
