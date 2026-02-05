package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.backgroundService.RecordingStateChangedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class BackgroundServiceRecordingStateChangedEventProcessor extends AbstractChromeInstanceEventProcessor<RecordingStateChangedEvent> {

    public BackgroundServiceRecordingStateChangedEventProcessor() {
        super("BackgroundService.recordingStateChanged", RecordingStateChangedEvent.class);
    }

    @Override
    protected abstract void onEvent(RecordingStateChangedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "BackgroundService.recordingStateChanged"; }
}
