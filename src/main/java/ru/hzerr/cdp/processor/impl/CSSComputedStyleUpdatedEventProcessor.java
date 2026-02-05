package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.css.ComputedStyleUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class CSSComputedStyleUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<ComputedStyleUpdatedEvent> {

    public CSSComputedStyleUpdatedEventProcessor() {
        super("CSS.computedStyleUpdated", ComputedStyleUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(ComputedStyleUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "CSS.computedStyleUpdated"; }
}
