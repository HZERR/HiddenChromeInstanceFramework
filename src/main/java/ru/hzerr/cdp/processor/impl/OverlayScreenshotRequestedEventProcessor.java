package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.overlay.ScreenshotRequestedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class OverlayScreenshotRequestedEventProcessor extends AbstractChromeInstanceEventProcessor<ScreenshotRequestedEvent> {

    public OverlayScreenshotRequestedEventProcessor() {
        super("Overlay.screenshotRequested", ScreenshotRequestedEvent.class);
    }

    @Override
    protected abstract void onEvent(ScreenshotRequestedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Overlay.screenshotRequested"; }
}
