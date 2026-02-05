package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired for lifecycle events (navigation, load, paint, etc) in the current target (including local frames).")
@Event("lifecycleEvent")
public class LifecycleEventEvent {

	@Required
	@Description("Id of the frame.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Loader identifier. Empty string if the request is fetched from worker.")
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	private String name;

	@Required
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

    public LifecycleEventEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
}
