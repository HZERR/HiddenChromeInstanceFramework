package ru.hzerr.cdp.type.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("Table containing nodes.")
public class NodeTreeSnapshot {

	@Description("Parent node index.")
	private int[] parentIndex;

	@Description("`Node`'s nodeType.")
	private int[] nodeType;

	@Description("Type of the shadow root the `Node` is in. String values are equal to the `ShadowRootType` enum.")
	private RareStringData shadowRootType;

	@Description("`Node`'s nodeName.")
	@TypeDescription("Index of the string in the strings table.")
	private List<Integer> nodeName;

	@Description("`Node`'s nodeValue.")
	@TypeDescription("Index of the string in the strings table.")
	private List<Integer> nodeValue;

	@Description("`Node`'s id, corresponds to DOM.Node.backendNodeId.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private List<Integer> backendNodeId;

	@Description("Attributes of an `Element` node. Flatten name, value pairs.")
	@TypeDescription("Index of the string in the strings table.")
	private List<List<Integer>> attributes;

	@Description("Only set for textarea elements, contains the text value.")
	private RareStringData textValue;

	@Description("Only set for input elements, contains the input's associated text value.")
	private RareStringData inputValue;

	@Description("Only set for radio and checkbox input elements, indicates if the element has been checked")
	private RareBooleanData inputChecked;

	@Description("Only set for option elements, indicates if the element has been selected")
	private RareBooleanData optionSelected;

	@Description("The index of the document in the list of the snapshot documents.")
	private RareIntegerData contentDocumentIndex;

	@Description("Type of a pseudo element node.")
	private RareStringData pseudoType;

	@Description("Pseudo element identifier for this node. Only present if there is a valid pseudoType.")
	private RareStringData pseudoIdentifier;

	@Description("Whether this DOM node responds to mouse clicks. This includes nodes that have had click event listeners attached via JavaScript as well as anchor tags that naturally navigate when clicked.")
	private RareBooleanData isClickable;

	@Description("The selected url for nodes with a srcset attribute.")
	private RareStringData currentSourceURL;

	@Description("The url of the script (if any) that generates this node.")
	private RareStringData originURL;

    public NodeTreeSnapshot() {
    }

	public int[] getParentIndex() {
		return this.parentIndex;
	}
	public void setParentIndex(int[] parentIndex) {
		this.parentIndex = parentIndex;
	}
	public int[] getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(int[] nodeType) {
		this.nodeType = nodeType;
	}
	public RareStringData getShadowRootType() {
		return this.shadowRootType;
	}
	public void setShadowRootType(RareStringData shadowRootType) {
		this.shadowRootType = shadowRootType;
	}
	public List<Integer> getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(List<Integer> nodeName) {
		this.nodeName = nodeName;
	}
	public List<Integer> getNodeValue() {
		return this.nodeValue;
	}
	public void setNodeValue(List<Integer> nodeValue) {
		this.nodeValue = nodeValue;
	}
	public List<Integer> getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(List<Integer> backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
	public List<List<Integer>> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<List<Integer>> attributes) {
		this.attributes = attributes;
	}
	public RareStringData getTextValue() {
		return this.textValue;
	}
	public void setTextValue(RareStringData textValue) {
		this.textValue = textValue;
	}
	public RareStringData getInputValue() {
		return this.inputValue;
	}
	public void setInputValue(RareStringData inputValue) {
		this.inputValue = inputValue;
	}
	public RareBooleanData getInputChecked() {
		return this.inputChecked;
	}
	public void setInputChecked(RareBooleanData inputChecked) {
		this.inputChecked = inputChecked;
	}
	public RareBooleanData getOptionSelected() {
		return this.optionSelected;
	}
	public void setOptionSelected(RareBooleanData optionSelected) {
		this.optionSelected = optionSelected;
	}
	public RareIntegerData getContentDocumentIndex() {
		return this.contentDocumentIndex;
	}
	public void setContentDocumentIndex(RareIntegerData contentDocumentIndex) {
		this.contentDocumentIndex = contentDocumentIndex;
	}
	public RareStringData getPseudoType() {
		return this.pseudoType;
	}
	public void setPseudoType(RareStringData pseudoType) {
		this.pseudoType = pseudoType;
	}
	public RareStringData getPseudoIdentifier() {
		return this.pseudoIdentifier;
	}
	public void setPseudoIdentifier(RareStringData pseudoIdentifier) {
		this.pseudoIdentifier = pseudoIdentifier;
	}
	public RareBooleanData getIsClickable() {
		return this.isClickable;
	}
	public void setIsClickable(RareBooleanData isClickable) {
		this.isClickable = isClickable;
	}
	public RareStringData getCurrentSourceURL() {
		return this.currentSourceURL;
	}
	public void setCurrentSourceURL(RareStringData currentSourceURL) {
		this.currentSourceURL = currentSourceURL;
	}
	public RareStringData getOriginURL() {
		return this.originURL;
	}
	public void setOriginURL(RareStringData originURL) {
		this.originURL = originURL;
	}
}
