package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.dom.Node;

@Description("Fired when backend wants to provide client with the missing DOM structure. This happens upon most of the calls requesting node ids.")
@Event("setChildNodes")
public class SetChildNodesEvent {

	@Required
	@Description("Parent node id to populate with children.")
	@TypeDescription("Unique DOM node identifier.")
	private int parentId;

	@Required
	@Description("Child nodes array.")
	private List<Node> nodes;

    public SetChildNodesEvent() {
    }

	public int getParentId() {
		return this.parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public List<Node> getNodes() {
		return this.nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
}
