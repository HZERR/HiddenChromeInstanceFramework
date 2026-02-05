package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.media.PlayerPropertiesChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class MediaPlayerPropertiesChangedEventProcessor extends AbstractChromeInstanceEventProcessor<PlayerPropertiesChangedEvent> {

    public MediaPlayerPropertiesChangedEventProcessor() {
        super("Media.playerPropertiesChanged", PlayerPropertiesChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(PlayerPropertiesChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Media.playerPropertiesChanged"; }
}
