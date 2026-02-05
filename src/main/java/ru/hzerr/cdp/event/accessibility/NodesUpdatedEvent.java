package ru.hzerr.cdp.event.accessibility;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.accessibility.AXNode;

@Experimental
@Description("The nodesUpdated event is sent every time a previously requested node has changed the in tree.")
@Event("nodesUpdated")
public class NodesUpdatedEvent {

	@Required
	@Description("Updated node data.")
	private List<AXNode> nodes;

    public NodesUpdatedEvent() {
    }

	public List<AXNode> getNodes() {
		return this.nodes;
	}
	public void setNodes(List<AXNode> nodes) {
		this.nodes = nodes;
	}
}
