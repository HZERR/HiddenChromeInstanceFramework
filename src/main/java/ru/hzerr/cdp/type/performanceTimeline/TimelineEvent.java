package ru.hzerr.cdp.type.performanceTimeline;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class TimelineEvent {

	@Required
	@Description("Identifies the frame that this event is related to. Empty for non-frame targets.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("The event type, as specified in https://w3c.github.io/performance-timeline/#dom-performanceentry-entrytype This determines which of the optional \"details\" fields is present.")
	private String type;

	@Required
	@Description("Name may be empty depending on the type.")
	private String name;

	@Required
	@Description("Time in seconds since Epoch, monotonically increasing within document lifetime.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number time;

	@Description("Event duration, if applicable.")
	private Number duration;

	private LargestContentfulPaint lcpDetails;

	private LayoutShift layoutShiftDetails;

    public TimelineEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getTime() {
		return this.time;
	}
	public void setTime(Number time) {
		this.time = time;
	}
	public Number getDuration() {
		return this.duration;
	}
	public void setDuration(Number duration) {
		this.duration = duration;
	}
	public LargestContentfulPaint getLcpDetails() {
		return this.lcpDetails;
	}
	public void setLcpDetails(LargestContentfulPaint lcpDetails) {
		this.lcpDetails = lcpDetails;
	}
	public LayoutShift getLayoutShiftDetails() {
		return this.layoutShiftDetails;
	}
	public void setLayoutShiftDetails(LayoutShift layoutShiftDetails) {
		this.layoutShiftDetails = layoutShiftDetails;
	}
}
