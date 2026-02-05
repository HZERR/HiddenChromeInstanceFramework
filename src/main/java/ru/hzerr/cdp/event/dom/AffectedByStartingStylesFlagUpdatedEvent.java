package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Fired when a node's starting styles changes.")
@Event("affectedByStartingStylesFlagUpdated")
public class AffectedByStartingStylesFlagUpdatedEvent {

	@Required
	@Description("The id of the node.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Required
	@Description("If the node has starting styles.")
	private boolean affectedByStartingStyles;

    public AffectedByStartingStylesFlagUpdatedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public boolean getAffectedByStartingStyles() {
		return this.affectedByStartingStyles;
	}
	public void setAffectedByStartingStyles(boolean affectedByStartingStyles) {
		this.affectedByStartingStyles = affectedByStartingStyles;
	}
}
