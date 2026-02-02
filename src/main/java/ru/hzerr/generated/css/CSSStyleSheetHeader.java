package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;

@Description("CSS stylesheet metainformation.")
public class CSSStyleSheetHeader {

	@Required
	@Description("The stylesheet identifier.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("Owner frame identifier.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Stylesheet resource URL. Empty if this is a constructed stylesheet created using new CSSStyleSheet() (but non-empty if this is a constructed stylesheet imported as a CSS module script).")
	private String sourceURL;

	@Description("URL of source map associated with the stylesheet (if any).")
	private String sourceMapURL;

	@Required
	@Description("Stylesheet origin.")
	@TypeDescription("Stylesheet type: \"injected\" for stylesheets injected via extension, \"user-agent\" for user-agent stylesheets, \"inspector\" for stylesheets created by the inspector (i.e. those holding the \"via inspector\" rules), \"regular\" for regular stylesheets.")
	private String origin;

	@Required
	@Description("Stylesheet title.")
	private String title;

	@Description("The backend id for the owner node of the stylesheet.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int ownerNode;

	@Required
	@Description("Denotes whether the stylesheet is disabled.")
	private boolean disabled;

	@Description("Whether the sourceURL field value comes from the sourceURL comment.")
	private boolean hasSourceURL;

	@Required
	@Description("Whether this stylesheet is created for STYLE tag by parser. This flag is not set for document.written STYLE tags.")
	private boolean isInline;

	@Required
	@Description("Whether this stylesheet is mutable. Inline stylesheets become mutable after they have been modified via CSSOM API. `<link>` element's stylesheets become mutable only if DevTools modifies them. Constructed stylesheets (new CSSStyleSheet()) are mutable immediately after creation.")
	private boolean isMutable;

	@Required
	@Description("True if this stylesheet is created through new CSSStyleSheet() or imported as a CSS module script.")
	private boolean isConstructed;

	@Required
	@Description("Line offset of the stylesheet within the resource (zero based).")
	private Number startLine;

	@Required
	@Description("Column offset of the stylesheet within the resource (zero based).")
	private Number startColumn;

	@Required
	@Description("Size of the content (in characters).")
	private Number length;

	@Required
	@Description("Line offset of the end of the stylesheet within the resource (zero based).")
	private Number endLine;

	@Required
	@Description("Column offset of the end of the stylesheet within the resource (zero based).")
	private Number endColumn;

	@Experimental
	@Description("If the style sheet was loaded from a network resource, this indicates when the resource failed to load")
	private boolean loadingFailed;

    public CSSStyleSheetHeader() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getSourceURL() {
		return this.sourceURL;
	}
	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}
	public String getSourceMapURL() {
		return this.sourceMapURL;
	}
	public void setSourceMapURL(String sourceMapURL) {
		this.sourceMapURL = sourceMapURL;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getOwnerNode() {
		return this.ownerNode;
	}
	public void setOwnerNode(int ownerNode) {
		this.ownerNode = ownerNode;
	}
	public boolean getDisabled() {
		return this.disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public boolean getHasSourceURL() {
		return this.hasSourceURL;
	}
	public void setHasSourceURL(boolean hasSourceURL) {
		this.hasSourceURL = hasSourceURL;
	}
	public boolean getIsInline() {
		return this.isInline;
	}
	public void setIsInline(boolean isInline) {
		this.isInline = isInline;
	}
	public boolean getIsMutable() {
		return this.isMutable;
	}
	public void setIsMutable(boolean isMutable) {
		this.isMutable = isMutable;
	}
	public boolean getIsConstructed() {
		return this.isConstructed;
	}
	public void setIsConstructed(boolean isConstructed) {
		this.isConstructed = isConstructed;
	}
	public Number getStartLine() {
		return this.startLine;
	}
	public void setStartLine(Number startLine) {
		this.startLine = startLine;
	}
	public Number getStartColumn() {
		return this.startColumn;
	}
	public void setStartColumn(Number startColumn) {
		this.startColumn = startColumn;
	}
	public Number getLength() {
		return this.length;
	}
	public void setLength(Number length) {
		this.length = length;
	}
	public Number getEndLine() {
		return this.endLine;
	}
	public void setEndLine(Number endLine) {
		this.endLine = endLine;
	}
	public Number getEndColumn() {
		return this.endColumn;
	}
	public void setEndColumn(Number endColumn) {
		this.endColumn = endColumn;
	}
	public boolean getLoadingFailed() {
		return this.loadingFailed;
	}
	public void setLoadingFailed(boolean loadingFailed) {
		this.loadingFailed = loadingFailed;
	}
}
