package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Mirrors `DOMNodeRemoved` event.")
@Event("childNodeRemoved")
public class ChildNodeRemovedEvent {

	@Required
	@Description("Parent id.")
	@TypeDescription("Unique DOM node identifier.")
	private int parentNodeId;

	@Required
	@Description("Id of the node that has been removed.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public ChildNodeRemovedEvent() {
    }

	public int getParentNodeId() {
		return this.parentNodeId;
	}
	public void setParentNodeId(int parentNodeId) {
		this.parentNodeId = parentNodeId;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
