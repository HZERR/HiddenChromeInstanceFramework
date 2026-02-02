package ru.hzerr.cdp.type.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.annotation.Experimental;

@Description("DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes. DOMNode is a base node mirror type.")
public class Node {

	@Required
	@Description("Node identifier that is passed into the rest of the DOM messages as the `nodeId`. Backend will only push node with given `id` once. It is aware of all requested nodes and will only fire DOM events for nodes known to the client.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Description("The id of the parent node if any.")
	@TypeDescription("Unique DOM node identifier.")
	private int parentId;

	@Required
	@Description("The BackendNodeId for this node.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

	@Required
	@Description("`Node`'s nodeType.")
	private int nodeType;

	@Required
	@Description("`Node`'s nodeName.")
	private String nodeName;

	@Required
	@Description("`Node`'s localName.")
	private String localName;

	@Required
	@Description("`Node`'s nodeValue.")
	private String nodeValue;

	@Description("Child count for `Container` nodes.")
	private int childNodeCount;

	@Description("Child nodes of this node when requested with children.")
	private List<Node> children;

	@Description("Attributes of the `Element` node in the form of flat array `[name1, value1, name2, value2]`.")
	private String[] attributes;

	@Description("Document URL that `Document` or `FrameOwner` node points to.")
	private String documentURL;

	@Description("Base URL that `Document` or `FrameOwner` node uses for URL completion.")
	private String baseURL;

	@Description("`DocumentType`'s publicId.")
	private String publicId;

	@Description("`DocumentType`'s systemId.")
	private String systemId;

	@Description("`DocumentType`'s internalSubset.")
	private String internalSubset;

	@Description("`Document`'s XML version in case of XML documents.")
	private String xmlVersion;

	@Description("`Attr`'s name.")
	private String name;

	@Description("`Attr`'s value.")
	private String value;

	@Description("Pseudo element type for this node.")
	@TypeDescription("Pseudo element type.")
	private String pseudoType;

	@Description("Pseudo element identifier for this node. Only present if there is a valid pseudoType.")
	private String pseudoIdentifier;

	@Description("Shadow root type.")
	@TypeDescription("Shadow root type.")
	private String shadowRootType;

	@Description("Frame ID for frame owner elements.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Description("Content document for frame owner elements.")
	private Node contentDocument;

	@Description("Shadow root list for given element host.")
	private List<Node> shadowRoots;

	@Description("Content document fragment for template elements.")
	private Node templateContent;

	@Description("Pseudo elements associated with this node.")
	private List<Node> pseudoElements;

	@Deprecated
	@Description("Deprecated, as the HTML Imports API has been removed (crbug.com/937746). This property used to return the imported document for the HTMLImport links. The property is always undefined now.")
	private Node importedDocument;

	@Description("Distributed nodes for given insertion point.")
	private List<BackendNode> distributedNodes;

	@Description("Whether the node is SVG.")
	private boolean isSVG;

	@TypeDescription("Document compatibility mode.")
	private String compatibilityMode;

	private BackendNode assignedSlot;

	@Experimental
	private boolean isScrollable;

	@Experimental
	private boolean affectedByStartingStyles;

	@Experimental
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private List<String> adoptedStyleSheets;

    public Node() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public int getParentId() {
		return this.parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
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
	public String getLocalName() {
		return this.localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	public String getNodeValue() {
		return this.nodeValue;
	}
	public void setNodeValue(String nodeValue) {
		this.nodeValue = nodeValue;
	}
	public int getChildNodeCount() {
		return this.childNodeCount;
	}
	public void setChildNodeCount(int childNodeCount) {
		this.childNodeCount = childNodeCount;
	}
	public List<Node> getChildren() {
		return this.children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	public String[] getAttributes() {
		return this.attributes;
	}
	public void setAttributes(String[] attributes) {
		this.attributes = attributes;
	}
	public String getDocumentURL() {
		return this.documentURL;
	}
	public void setDocumentURL(String documentURL) {
		this.documentURL = documentURL;
	}
	public String getBaseURL() {
		return this.baseURL;
	}
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getSystemId() {
		return this.systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getInternalSubset() {
		return this.internalSubset;
	}
	public void setInternalSubset(String internalSubset) {
		this.internalSubset = internalSubset;
	}
	public String getXmlVersion() {
		return this.xmlVersion;
	}
	public void setXmlVersion(String xmlVersion) {
		this.xmlVersion = xmlVersion;
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
	public String getPseudoType() {
		return this.pseudoType;
	}
	public void setPseudoType(String pseudoType) {
		this.pseudoType = pseudoType;
	}
	public String getPseudoIdentifier() {
		return this.pseudoIdentifier;
	}
	public void setPseudoIdentifier(String pseudoIdentifier) {
		this.pseudoIdentifier = pseudoIdentifier;
	}
	public String getShadowRootType() {
		return this.shadowRootType;
	}
	public void setShadowRootType(String shadowRootType) {
		this.shadowRootType = shadowRootType;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public Node getContentDocument() {
		return this.contentDocument;
	}
	public void setContentDocument(Node contentDocument) {
		this.contentDocument = contentDocument;
	}
	public List<Node> getShadowRoots() {
		return this.shadowRoots;
	}
	public void setShadowRoots(List<Node> shadowRoots) {
		this.shadowRoots = shadowRoots;
	}
	public Node getTemplateContent() {
		return this.templateContent;
	}
	public void setTemplateContent(Node templateContent) {
		this.templateContent = templateContent;
	}
	public List<Node> getPseudoElements() {
		return this.pseudoElements;
	}
	public void setPseudoElements(List<Node> pseudoElements) {
		this.pseudoElements = pseudoElements;
	}
	public Node getImportedDocument() {
		return this.importedDocument;
	}
	public void setImportedDocument(Node importedDocument) {
		this.importedDocument = importedDocument;
	}
	public List<BackendNode> getDistributedNodes() {
		return this.distributedNodes;
	}
	public void setDistributedNodes(List<BackendNode> distributedNodes) {
		this.distributedNodes = distributedNodes;
	}
	public boolean getIsSVG() {
		return this.isSVG;
	}
	public void setIsSVG(boolean isSVG) {
		this.isSVG = isSVG;
	}
	public String getCompatibilityMode() {
		return this.compatibilityMode;
	}
	public void setCompatibilityMode(String compatibilityMode) {
		this.compatibilityMode = compatibilityMode;
	}
	public BackendNode getAssignedSlot() {
		return this.assignedSlot;
	}
	public void setAssignedSlot(BackendNode assignedSlot) {
		this.assignedSlot = assignedSlot;
	}
	public boolean getIsScrollable() {
		return this.isScrollable;
	}
	public void setIsScrollable(boolean isScrollable) {
		this.isScrollable = isScrollable;
	}
	public boolean getAffectedByStartingStyles() {
		return this.affectedByStartingStyles;
	}
	public void setAffectedByStartingStyles(boolean affectedByStartingStyles) {
		this.affectedByStartingStyles = affectedByStartingStyles;
	}
	public List<String> getAdoptedStyleSheets() {
		return this.adoptedStyleSheets;
	}
	public void setAdoptedStyleSheets(List<String> adoptedStyleSheets) {
		this.adoptedStyleSheets = adoptedStyleSheets;
	}
}
