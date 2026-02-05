package ru.hzerr.cdp.event.tracing;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Contains a bucket of collected trace events. When tracing is stopped collected events will be sent as a sequence of dataCollected events followed by tracingComplete event.")
@Event("dataCollected")
public class DataCollectedEvent {

	@Required

    public DataCollectedEvent() {
    }

}
