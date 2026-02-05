package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.css.StyleSheetChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class CSSStyleSheetChangedEventProcessor extends AbstractChromeInstanceEventProcessor<StyleSheetChangedEvent> {

    public CSSStyleSheetChangedEventProcessor() {
        super("CSS.styleSheetChanged", StyleSheetChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(StyleSheetChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "CSS.styleSheetChanged"; }
}
