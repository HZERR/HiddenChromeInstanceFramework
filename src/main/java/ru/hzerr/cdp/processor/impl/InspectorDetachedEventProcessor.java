package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.inspector.DetachedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class InspectorDetachedEventProcessor extends AbstractChromeInstanceEventProcessor<DetachedEvent> {

    public InspectorDetachedEventProcessor() {
        super("Inspector.detached", DetachedEvent.class);
    }

    @Override
    protected abstract void onEvent(DetachedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Inspector.detached"; }
}
