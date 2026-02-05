package ru.hzerr.cdp.event.performanceTimeline;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.performanceTimeline.TimelineEvent;

@Description("Sent when a performance timeline event is added. See reportPerformanceTimeline method.")
@Event("timelineEventAdded")
public class TimelineEventAddedEvent {

	@Required
	private TimelineEvent event;

    public TimelineEventAddedEvent() {
    }

	public TimelineEvent getEvent() {
		return this.event;
	}
	public void setEvent(TimelineEvent event) {
		this.event = event;
	}
}
