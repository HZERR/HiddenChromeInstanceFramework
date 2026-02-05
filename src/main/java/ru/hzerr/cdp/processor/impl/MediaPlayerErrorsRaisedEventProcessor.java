package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.media.PlayerErrorsRaisedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class MediaPlayerErrorsRaisedEventProcessor extends AbstractChromeInstanceEventProcessor<PlayerErrorsRaisedEvent> {

    public MediaPlayerErrorsRaisedEventProcessor() {
        super("Media.playerErrorsRaised", PlayerErrorsRaisedEvent.class);
    }

    @Override
    protected abstract void onEvent(PlayerErrorsRaisedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Media.playerErrorsRaised"; }
}
