package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.css.MediaQueryResultChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class CSSMediaQueryResultChangedEventProcessor extends AbstractChromeInstanceEventProcessor<MediaQueryResultChangedEvent> {

    public CSSMediaQueryResultChangedEventProcessor() {
        super("CSS.mediaQueryResultChanged", MediaQueryResultChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(MediaQueryResultChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "CSS.mediaQueryResultChanged"; }
}
