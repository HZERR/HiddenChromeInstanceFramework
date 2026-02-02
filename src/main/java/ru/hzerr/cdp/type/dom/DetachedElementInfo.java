package ru.hzerr.cdp.type.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("A structure to hold the top-level node of a detached tree and an array of its retained descendants.")
public class DetachedElementInfo {

	@Required
	private Node treeNode;

	@Required
	@TypeDescription("Unique DOM node identifier.")
	private List<Integer> retainedNodeIds;

    public DetachedElementInfo() {
    }

	public Node getTreeNode() {
		return this.treeNode;
	}
	public void setTreeNode(Node treeNode) {
		this.treeNode = treeNode;
	}
	public List<Integer> getRetainedNodeIds() {
		return this.retainedNodeIds;
	}
	public void setRetainedNodeIds(List<Integer> retainedNodeIds) {
		this.retainedNodeIds = retainedNodeIds;
	}
}
