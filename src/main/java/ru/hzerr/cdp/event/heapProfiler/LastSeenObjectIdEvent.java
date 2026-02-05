package ru.hzerr.cdp.event.heapProfiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.")
@Event("lastSeenObjectId")
public class LastSeenObjectIdEvent {

	@Required
	private int lastSeenObjectId;

	@Required
	private Number timestamp;

    public LastSeenObjectIdEvent() {
    }

	public int getLastSeenObjectId() {
		return this.lastSeenObjectId;
	}
	public void setLastSeenObjectId(int lastSeenObjectId) {
		this.lastSeenObjectId = lastSeenObjectId;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
}
