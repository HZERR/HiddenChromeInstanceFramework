package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.dom.Node;

@Description("Mirrors `DOMNodeInserted` event.")
@Event("childNodeInserted")
public class ChildNodeInsertedEvent {

	@Required
	@Description("Id of the node that has changed.")
	@TypeDescription("Unique DOM node identifier.")
	private int parentNodeId;

	@Required
	@Description("Id of the previous sibling.")
	@TypeDescription("Unique DOM node identifier.")
	private int previousNodeId;

	@Required
	@Description("Inserted node data.")
	private Node node;

    public ChildNodeInsertedEvent() {
    }

	public int getParentNodeId() {
		return this.parentNodeId;
	}
	public void setParentNodeId(int parentNodeId) {
		this.parentNodeId = parentNodeId;
	}
	public int getPreviousNodeId() {
		return this.previousNodeId;
	}
	public void setPreviousNodeId(int previousNodeId) {
		this.previousNodeId = previousNodeId;
	}
	public Node getNode() {
		return this.node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
}
