package ru.hzerr.cdp.type.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Backend node with a friendly name.")
public class BackendNode {

	@Required
	@Description("`Node`'s nodeType.")
	private int nodeType;

	@Required
	@Description("`Node`'s nodeName.")
	private String nodeName;

	@Required
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

    public BackendNode() {
    }

	public int getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(int nodeType) {
		this.nodeType = nodeType;
	}
	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
}
