package ru.hzerr.cdp.event.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Event("computedStyleUpdated")
public class ComputedStyleUpdatedEvent {

	@Required
	@Description("The node id that has updated computed styles.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

    public ComputedStyleUpdatedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
