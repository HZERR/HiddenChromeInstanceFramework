package ru.hzerr.generated.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.generated.domDebugger.EventListener;

@Description("A Node in the DOM tree.")
public class DOMNode {

	@Required
	@Description("`Node`'s nodeType.")
	private int nodeType;

	@Required
	@Description("`Node`'s nodeName.")
	private String nodeName;

	@Required
	@Description("`Node`'s nodeValue.")
	private String nodeValue;

	@Description("Only set for textarea elements, contains the text value.")
	private String textValue;

	@Description("Only set for input elements, contains the input's associated text value.")
	private String inputValue;

	@Description("Only set for radio and checkbox input elements, indicates if the element has been checked")
	private boolean inputChecked;

	@Description("Only set for option elements, indicates if the element has been selected")
	private boolean optionSelected;

	@Required
	@Description("`Node`'s id, corresponds to DOM.Node.backendNodeId.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

	@Description("The indexes of the node's child nodes in the `domNodes` array returned by `getSnapshot`, if any.")
	private int[] childNodeIndexes;

	@Description("Attributes of an `Element` node.")
	private List<NameValue> attributes;

	@Description("Indexes of pseudo elements associated with this node in the `domNodes` array returned by `getSnapshot`, if any.")
	private int[] pseudoElementIndexes;

	@Description("The index of the node's related layout tree node in the `layoutTreeNodes` array returned by `getSnapshot`, if any.")
	private int layoutNodeIndex;

	@Description("Document URL that `Document` or `FrameOwner` node points to.")
	private String documentURL;

	@Description("Base URL that `Document` or `FrameOwner` node uses for URL completion.")
	private String baseURL;

	@Description("Only set for documents, contains the document's content language.")
	private String contentLanguage;

	@Description("Only set for documents, contains the document's character set encoding.")
	private String documentEncoding;

	@Description("`DocumentType` node's publicId.")
	private String publicId;

	@Description("`DocumentType` node's systemId.")
	private String systemId;

	@Description("Frame ID for frame owner elements and also for the document node.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Description("The index of a frame owner element's content document in the `domNodes` array returned by `getSnapshot`, if any.")
	private int contentDocumentIndex;

	@Description("Type of a pseudo element node.")
	@TypeDescription("Pseudo element type.")
	private String pseudoType;

	@Description("Shadow root type.")
	@TypeDescription("Shadow root type.")
	private String shadowRootType;

	@Description("Whether this DOM node responds to mouse clicks. This includes nodes that have had click event listeners attached via JavaScript as well as anchor tags that naturally navigate when clicked.")
	private boolean isClickable;

	@Description("Details of the node's event listeners, if any.")
	private List<EventListener> eventListeners;

	@Description("The selected url for nodes with a srcset attribute.")
	private String currentSourceURL;

	@Description("The url of the script (if any) that generates this node.")
	private String originURL;

	@Description("Scroll offsets, set when this node is a Document.")
	private Number scrollOffsetX;

	private Number scrollOffsetY;

    public DOMNode() {
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
	public String getNodeValue() {
		return this.nodeValue;
	}
	public void setNodeValue(String nodeValue) {
		this.nodeValue = nodeValue;
	}
	public String getTextValue() {
		return this.textValue;
	}
	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}
	public String getInputValue() {
		return this.inputValue;
	}
	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
	public boolean getInputChecked() {
		return this.inputChecked;
	}
	public void setInputChecked(boolean inputChecked) {
		this.inputChecked = inputChecked;
	}
	public boolean getOptionSelected() {
		return this.optionSelected;
	}
	public void setOptionSelected(boolean optionSelected) {
		this.optionSelected = optionSelected;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
	public int[] getChildNodeIndexes() {
		return this.childNodeIndexes;
	}
	public void setChildNodeIndexes(int[] childNodeIndexes) {
		this.childNodeIndexes = childNodeIndexes;
	}
	public List<NameValue> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<NameValue> attributes) {
		this.attributes = attributes;
	}
	public int[] getPseudoElementIndexes() {
		return this.pseudoElementIndexes;
	}
	public void setPseudoElementIndexes(int[] pseudoElementIndexes) {
		this.pseudoElementIndexes = pseudoElementIndexes;
	}
	public int getLayoutNodeIndex() {
		return this.layoutNodeIndex;
	}
	public void setLayoutNodeIndex(int layoutNodeIndex) {
		this.layoutNodeIndex = layoutNodeIndex;
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
	public String getContentLanguage() {
		return this.contentLanguage;
	}
	public void setContentLanguage(String contentLanguage) {
		this.contentLanguage = contentLanguage;
	}
	public String getDocumentEncoding() {
		return this.documentEncoding;
	}
	public void setDocumentEncoding(String documentEncoding) {
		this.documentEncoding = documentEncoding;
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
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public int getContentDocumentIndex() {
		return this.contentDocumentIndex;
	}
	public void setContentDocumentIndex(int contentDocumentIndex) {
		this.contentDocumentIndex = contentDocumentIndex;
	}
	public String getPseudoType() {
		return this.pseudoType;
	}
	public void setPseudoType(String pseudoType) {
		this.pseudoType = pseudoType;
	}
	public String getShadowRootType() {
		return this.shadowRootType;
	}
	public void setShadowRootType(String shadowRootType) {
		this.shadowRootType = shadowRootType;
	}
	public boolean getIsClickable() {
		return this.isClickable;
	}
	public void setIsClickable(boolean isClickable) {
		this.isClickable = isClickable;
	}
	public List<EventListener> getEventListeners() {
		return this.eventListeners;
	}
	public void setEventListeners(List<EventListener> eventListeners) {
		this.eventListeners = eventListeners;
	}
	public String getCurrentSourceURL() {
		return this.currentSourceURL;
	}
	public void setCurrentSourceURL(String currentSourceURL) {
		this.currentSourceURL = currentSourceURL;
	}
	public String getOriginURL() {
		return this.originURL;
	}
	public void setOriginURL(String originURL) {
		this.originURL = originURL;
	}
	public Number getScrollOffsetX() {
		return this.scrollOffsetX;
	}
	public void setScrollOffsetX(Number scrollOffsetX) {
		this.scrollOffsetX = scrollOffsetX;
	}
	public Number getScrollOffsetY() {
		return this.scrollOffsetY;
	}
	public void setScrollOffsetY(Number scrollOffsetY) {
		this.scrollOffsetY = scrollOffsetY;
	}
}
