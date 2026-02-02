package ru.hzerr.generated.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Document snapshot.")
public class DocumentSnapshot {

	@Required
	@Description("Document URL that `Document` or `FrameOwner` node points to.")
	@TypeDescription("Index of the string in the strings table.")
	private int documentURL;

	@Required
	@Description("Document title.")
	@TypeDescription("Index of the string in the strings table.")
	private int title;

	@Required
	@Description("Base URL that `Document` or `FrameOwner` node uses for URL completion.")
	@TypeDescription("Index of the string in the strings table.")
	private int baseURL;

	@Required
	@Description("Contains the document's content language.")
	@TypeDescription("Index of the string in the strings table.")
	private int contentLanguage;

	@Required
	@Description("Contains the document's character set encoding.")
	@TypeDescription("Index of the string in the strings table.")
	private int encodingName;

	@Required
	@Description("`DocumentType` node's publicId.")
	@TypeDescription("Index of the string in the strings table.")
	private int publicId;

	@Required
	@Description("`DocumentType` node's systemId.")
	@TypeDescription("Index of the string in the strings table.")
	private int systemId;

	@Required
	@Description("Frame ID for frame owner elements and also for the document node.")
	@TypeDescription("Index of the string in the strings table.")
	private int frameId;

	@Required
	@Description("A table with dom nodes.")
	private NodeTreeSnapshot nodes;

	@Required
	@Description("The nodes in the layout tree.")
	private LayoutTreeSnapshot layout;

	@Required
	@Description("The post-layout inline text nodes.")
	private TextBoxSnapshot textBoxes;

	@Description("Horizontal scroll offset.")
	private Number scrollOffsetX;

	@Description("Vertical scroll offset.")
	private Number scrollOffsetY;

	@Description("Document content width.")
	private Number contentWidth;

	@Description("Document content height.")
	private Number contentHeight;

    public DocumentSnapshot() {
    }

	public int getDocumentURL() {
		return this.documentURL;
	}
	public void setDocumentURL(int documentURL) {
		this.documentURL = documentURL;
	}
	public int getTitle() {
		return this.title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	public int getBaseURL() {
		return this.baseURL;
	}
	public void setBaseURL(int baseURL) {
		this.baseURL = baseURL;
	}
	public int getContentLanguage() {
		return this.contentLanguage;
	}
	public void setContentLanguage(int contentLanguage) {
		this.contentLanguage = contentLanguage;
	}
	public int getEncodingName() {
		return this.encodingName;
	}
	public void setEncodingName(int encodingName) {
		this.encodingName = encodingName;
	}
	public int getPublicId() {
		return this.publicId;
	}
	public void setPublicId(int publicId) {
		this.publicId = publicId;
	}
	public int getSystemId() {
		return this.systemId;
	}
	public void setSystemId(int systemId) {
		this.systemId = systemId;
	}
	public int getFrameId() {
		return this.frameId;
	}
	public void setFrameId(int frameId) {
		this.frameId = frameId;
	}
	public NodeTreeSnapshot getNodes() {
		return this.nodes;
	}
	public void setNodes(NodeTreeSnapshot nodes) {
		this.nodes = nodes;
	}
	public LayoutTreeSnapshot getLayout() {
		return this.layout;
	}
	public void setLayout(LayoutTreeSnapshot layout) {
		this.layout = layout;
	}
	public TextBoxSnapshot getTextBoxes() {
		return this.textBoxes;
	}
	public void setTextBoxes(TextBoxSnapshot textBoxes) {
		this.textBoxes = textBoxes;
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
	public Number getContentWidth() {
		return this.contentWidth;
	}
	public void setContentWidth(Number contentWidth) {
		this.contentWidth = contentWidth;
	}
	public Number getContentHeight() {
		return this.contentHeight;
	}
	public void setContentHeight(Number contentHeight) {
		this.contentHeight = contentHeight;
	}
}
