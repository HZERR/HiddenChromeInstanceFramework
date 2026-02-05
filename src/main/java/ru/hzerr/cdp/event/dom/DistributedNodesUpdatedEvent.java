package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.dom.BackendNode;

@Experimental
@Description("Called when distribution is changed.")
@Event("distributedNodesUpdated")
public class DistributedNodesUpdatedEvent {

	@Required
	@Description("Insertion point where distributed nodes were updated.")
	@TypeDescription("Unique DOM node identifier.")
	private int insertionPointId;

	@Required
	@Description("Distributed nodes for given insertion point.")
	private List<BackendNode> distributedNodes;

    public DistributedNodesUpdatedEvent() {
    }

	public int getInsertionPointId() {
		return this.insertionPointId;
	}
	public void setInsertionPointId(int insertionPointId) {
		this.insertionPointId = insertionPointId;
	}
	public List<BackendNode> getDistributedNodes() {
		return this.distributedNodes;
	}
	public void setDistributedNodes(List<BackendNode> distributedNodes) {
		this.distributedNodes = distributedNodes;
	}
}
