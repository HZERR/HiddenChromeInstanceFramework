package ru.hzerr.cdp.event.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired when resource loading priority is changed")
@Event("resourceChangedPriority")
public class ResourceChangedPriorityEvent {

	@Required
	@Description("Request identifier.")
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("New priority")
	@TypeDescription("Loading priority of a resource request.")
	private String newPriority;

	@Required
	@Description("Timestamp.")
	@TypeDescription("Monotonically increasing time in seconds since an arbitrary point in the past.")
	private Number timestamp;

    public ResourceChangedPriorityEvent() {
    }

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getNewPriority() {
		return this.newPriority;
	}
	public void setNewPriority(String newPriority) {
		this.newPriority = newPriority;
	}
	public Number getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(Number timestamp) {
		this.timestamp = timestamp;
	}
}
