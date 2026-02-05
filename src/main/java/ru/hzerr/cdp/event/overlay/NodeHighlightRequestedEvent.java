package ru.hzerr.cdp.event.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when the node should be highlighted. This happens after call to `setInspectMode`.")
@Event("nodeHighlightRequested")
public class NodeHighlightRequestedEvent {

	@Required
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public NodeHighlightRequestedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
