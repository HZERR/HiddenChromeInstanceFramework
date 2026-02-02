package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("CSS function conditional block representation.")
public class CSSFunctionConditionNode {

	@Description("Media query for this conditional block. Only one type of condition should be set.")
	private CSSMedia media;

	@Description("Container query for this conditional block. Only one type of condition should be set.")
	private CSSContainerQuery containerQueries;

	@Description("@supports CSS at-rule condition. Only one type of condition should be set.")
	private CSSSupports supports;

	@Required
	@Description("Block body.")
	private List<CSSFunctionNode> children;

	@Required
	@Description("The condition text.")
	private String conditionText;

    public CSSFunctionConditionNode() {
    }

	public CSSMedia getMedia() {
		return this.media;
	}
	public void setMedia(CSSMedia media) {
		this.media = media;
	}
	public CSSContainerQuery getContainerQueries() {
		return this.containerQueries;
	}
	public void setContainerQueries(CSSContainerQuery containerQueries) {
		this.containerQueries = containerQueries;
	}
	public CSSSupports getSupports() {
		return this.supports;
	}
	public void setSupports(CSSSupports supports) {
		this.supports = supports;
	}
	public List<CSSFunctionNode> getChildren() {
		return this.children;
	}
	public void setChildren(List<CSSFunctionNode> children) {
		this.children = children;
	}
	public String getConditionText() {
		return this.conditionText;
	}
	public void setConditionText(String conditionText) {
		this.conditionText = conditionText;
	}
}
