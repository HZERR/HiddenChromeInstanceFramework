package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when `Container`'s child node count has changed.")
@Event("childNodeCountUpdated")
public class ChildNodeCountUpdatedEvent {

	@Required
	@Description("Id of the node that has changed.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Required
	@Description("New node count.")
	private int childNodeCount;

    public ChildNodeCountUpdatedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public int getChildNodeCount() {
		return this.childNodeCount;
	}
	public void setChildNodeCount(int childNodeCount) {
		this.childNodeCount = childNodeCount;
	}
}
