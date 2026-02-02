package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Match data for a CSS rule.")
public class RuleMatch {

	@Required
	@Description("CSS rule in the match.")
	private CSSRule rule;

	@Required
	@Description("Matching selector indices in the rule's selectorList selectors (0-based).")
	private int[] matchingSelectors;

    public RuleMatch() {
    }

	public CSSRule getRule() {
		return this.rule;
	}
	public void setRule(CSSRule rule) {
		this.rule = rule;
	}
	public int[] getMatchingSelectors() {
		return this.matchingSelectors;
	}
	public void setMatchingSelectors(int[] matchingSelectors) {
		this.matchingSelectors = matchingSelectors;
	}
}
