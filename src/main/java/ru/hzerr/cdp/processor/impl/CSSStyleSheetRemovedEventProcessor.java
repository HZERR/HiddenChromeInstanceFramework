package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.css.StyleSheetRemovedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class CSSStyleSheetRemovedEventProcessor extends AbstractChromeInstanceEventProcessor<StyleSheetRemovedEvent> {

    public CSSStyleSheetRemovedEventProcessor() {
        super("CSS.styleSheetRemoved", StyleSheetRemovedEvent.class);
    }

    @Override
    protected abstract void onEvent(StyleSheetRemovedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "CSS.styleSheetRemoved"; }
}
