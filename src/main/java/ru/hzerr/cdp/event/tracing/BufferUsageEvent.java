package ru.hzerr.cdp.event.tracing;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Description;

@Experimental
@Event("bufferUsage")
public class BufferUsageEvent {

	@Description("A number in range [0..1] that indicates the used size of event buffer as a fraction of its total size.")
	private Number percentFull;

	@Description("An approximate number of events in the trace log.")
	private Number eventCount;

	@Description("A number in range [0..1] that indicates the used size of event buffer as a fraction of its total size.")
	private Number value;

    public BufferUsageEvent() {
    }

	public Number getPercentFull() {
		return this.percentFull;
	}
	public void setPercentFull(Number percentFull) {
		this.percentFull = percentFull;
	}
	public Number getEventCount() {
		return this.eventCount;
	}
	public void setEventCount(Number eventCount) {
		this.eventCount = eventCount;
	}
	public Number getValue() {
		return this.value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
}
