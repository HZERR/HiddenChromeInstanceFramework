package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when `Element`'s attribute is removed.")
@Event("attributeRemoved")
public class AttributeRemovedEvent {

	@Required
	@Description("Id of the node that has changed.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Required
	@Description("A ttribute name.")
	private String name;

    public AttributeRemovedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
