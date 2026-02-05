package ru.hzerr.cdp.event.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when the node should be inspected. This happens after call to `setInspectMode` or when user manually inspects an element.")
@Event("inspectNodeRequested")
public class InspectNodeRequestedEvent {

	@Required
	@Description("Id of the node to inspect.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

    public InspectNodeRequestedEvent() {
    }

	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
}
