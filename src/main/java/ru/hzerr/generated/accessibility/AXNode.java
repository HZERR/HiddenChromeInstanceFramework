package ru.hzerr.generated.accessibility;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("A node in the accessibility tree.")
public class AXNode {

	@Required
	@Description("Unique identifier for this node.")
	@TypeDescription("Unique accessibility node identifier.")
	private String nodeId;

	@Required
	@Description("Whether this node is ignored for accessibility")
	private boolean ignored;

	@Description("Collection of reasons why this node is hidden.")
	private List<AXProperty> ignoredReasons;

	@Description("This `Node`'s role, whether explicit or implicit.")
	private AXValue role;

	@Description("This `Node`'s Chrome raw role.")
	private AXValue chromeRole;

	@Description("The accessible name for this `Node`.")
	private AXValue name;

	@Description("The accessible description for this `Node`.")
	private AXValue description;

	@Description("The value for this `Node`.")
	private AXValue value;

	@Description("All other properties")
	private List<AXProperty> properties;

	@Description("ID for this node's parent.")
	@TypeDescription("Unique accessibility node identifier.")
	private String parentId;

	@Description("IDs for each of this node's child nodes.")
	@TypeDescription("Unique accessibility node identifier.")
	private List<String> childIds;

	@Description("The backend ID for the associated DOM node, if any.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendDOMNodeId;

	@Description("The frame ID for the frame associated with this nodes document.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

    public AXNode() {
    }

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public boolean getIgnored() {
		return this.ignored;
	}
	public void setIgnored(boolean ignored) {
		this.ignored = ignored;
	}
	public List<AXProperty> getIgnoredReasons() {
		return this.ignoredReasons;
	}
	public void setIgnoredReasons(List<AXProperty> ignoredReasons) {
		this.ignoredReasons = ignoredReasons;
	}
	public AXValue getRole() {
		return this.role;
	}
	public void setRole(AXValue role) {
		this.role = role;
	}
	public AXValue getChromeRole() {
		return this.chromeRole;
	}
	public void setChromeRole(AXValue chromeRole) {
		this.chromeRole = chromeRole;
	}
	public AXValue getName() {
		return this.name;
	}
	public void setName(AXValue name) {
		this.name = name;
	}
	public AXValue getDescription() {
		return this.description;
	}
	public void setDescription(AXValue description) {
		this.description = description;
	}
	public AXValue getValue() {
		return this.value;
	}
	public void setValue(AXValue value) {
		this.value = value;
	}
	public List<AXProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<AXProperty> properties) {
		this.properties = properties;
	}
	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<String> getChildIds() {
		return this.childIds;
	}
	public void setChildIds(List<String> childIds) {
		this.childIds = childIds;
	}
	public int getBackendDOMNodeId() {
		return this.backendDOMNodeId;
	}
	public void setBackendDOMNodeId(int backendDOMNodeId) {
		this.backendDOMNodeId = backendDOMNodeId;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
}
