package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.input.DragInterceptedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class InputDragInterceptedEventProcessor extends AbstractChromeInstanceEventProcessor<DragInterceptedEvent> {

    public InputDragInterceptedEventProcessor() {
        super("Input.dragIntercepted", DragInterceptedEvent.class);
    }

    @Override
    protected abstract void onEvent(DragInterceptedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Input.dragIntercepted"; }
}
