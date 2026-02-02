package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Inherited CSS rule collection from ancestor node.")
public class InheritedStyleEntry {

	@Description("The ancestor node's inline style, if any, in the style inheritance chain.")
	private CSSStyle inlineStyle;

	@Required
	@Description("Matches of CSS rules matching the ancestor node in the style inheritance chain.")
	private List<RuleMatch> matchedCSSRules;

    public InheritedStyleEntry() {
    }

	public CSSStyle getInlineStyle() {
		return this.inlineStyle;
	}
	public void setInlineStyle(CSSStyle inlineStyle) {
		this.inlineStyle = inlineStyle;
	}
	public List<RuleMatch> getMatchedCSSRules() {
		return this.matchedCSSRules;
	}
	public void setMatchedCSSRules(List<RuleMatch> matchedCSSRules) {
		this.matchedCSSRules = matchedCSSRules;
	}
}
