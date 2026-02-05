package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.inspector.WorkerScriptLoadedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class InspectorWorkerScriptLoadedEventProcessor extends AbstractChromeInstanceEventProcessor<WorkerScriptLoadedEvent> {

    public InspectorWorkerScriptLoadedEventProcessor() {
        super("Inspector.workerScriptLoaded", WorkerScriptLoadedEvent.class);
    }

    @Override
    protected abstract void onEvent(WorkerScriptLoadedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Inspector.workerScriptLoaded"; }
}
