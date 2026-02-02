package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("CSS media rule descriptor.")
public class CSSMedia {

	@Required
	@Description("Media query text.")
	private String text;

	@Required
	@Description("Source of the media query: \"mediaRule\" if specified by a @media rule, \"importRule\" if specified by an @import rule, \"linkedSheet\" if specified by a \"media\" attribute in a linked stylesheet's LINK tag, \"inlineSheet\" if specified by a \"media\" attribute in an inline stylesheet's STYLE tag.")
	@Enum({"mediaRule", "importRule", "linkedSheet", "inlineSheet"})
	private String source;

	@Description("URL of the document containing the media query description.")
	private String sourceURL;

	@Description("The associated rule (@media or @import) header range in the enclosing stylesheet (if available).")
	private SourceRange range;

	@Description("Identifier of the stylesheet containing this object (if exists).")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Description("Array of media queries.")
	private List<MediaQuery> mediaList;

    public CSSMedia() {
    }

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceURL() {
		return this.sourceURL;
	}
	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}
	public SourceRange getRange() {
		return this.range;
	}
	public void setRange(SourceRange range) {
		this.range = range;
	}
	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public List<MediaQuery> getMediaList() {
		return this.mediaList;
	}
	public void setMediaList(List<MediaQuery> mediaList) {
		this.mediaList = mediaList;
	}
}
