package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired when a node's scrollability state changes.")
@Event("scrollableFlagUpdated")
public class ScrollableFlagUpdatedEvent {

	@Required
	@Description("The id of the node.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Required
	@Description("If the node is scrollable.")
	private boolean isScrollable;

    public ScrollableFlagUpdatedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public boolean getIsScrollable() {
		return this.isScrollable;
	}
	public void setIsScrollable(boolean isScrollable) {
		this.isScrollable = isScrollable;
	}
}
