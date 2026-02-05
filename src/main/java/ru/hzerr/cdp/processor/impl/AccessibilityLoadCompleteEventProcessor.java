package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.accessibility.LoadCompleteEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AccessibilityLoadCompleteEventProcessor extends AbstractChromeInstanceEventProcessor<LoadCompleteEvent> {

    public AccessibilityLoadCompleteEventProcessor() {
        super("Accessibility.loadComplete", LoadCompleteEvent.class);
    }

    @Override
    protected abstract void onEvent(LoadCompleteEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Accessibility.loadComplete"; }
}
