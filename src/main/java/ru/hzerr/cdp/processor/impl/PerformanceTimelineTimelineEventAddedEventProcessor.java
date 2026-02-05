package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.performanceTimeline.TimelineEventAddedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class PerformanceTimelineTimelineEventAddedEventProcessor extends AbstractChromeInstanceEventProcessor<TimelineEventAddedEvent> {

    public PerformanceTimelineTimelineEventAddedEventProcessor() {
        super("PerformanceTimeline.timelineEventAdded", TimelineEventAddedEvent.class);
    }

    @Override
    protected abstract void onEvent(TimelineEventAddedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "PerformanceTimeline.timelineEventAdded"; }
}
