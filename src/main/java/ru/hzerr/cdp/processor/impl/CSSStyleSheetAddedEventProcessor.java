package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.css.StyleSheetAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class CSSStyleSheetAddedEventProcessor extends AbstractChromeInstanceEventProcessor<StyleSheetAddedEvent> {

    public CSSStyleSheetAddedEventProcessor() {
        super("CSS.styleSheetAdded", StyleSheetAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(StyleSheetAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "CSS.styleSheetAdded"; }
}
