package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired when `Element`'s attribute is modified.")
@Event("attributeModified")
public class AttributeModifiedEvent {

	@Required
	@Description("Id of the node that has changed.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Required
	@Description("Attribute name.")
	private String name;

	@Required
	@Description("Attribute value.")
	private String value;

    public AttributeModifiedEvent() {
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
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
