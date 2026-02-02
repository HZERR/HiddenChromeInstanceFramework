package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Experimental;
import java.util.List;
import ru.hzerr.annotation.TypeExperimental;

@Description("CSS rule representation.")
public class CSSRule {

	@Description("The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet rules) this rule came from.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("Rule selector data.")
	private SelectorList selectorList;

	@Experimental
	@Description("Array of selectors from ancestor style rules, sorted by distance from the current rule.")
	private String[] nestingSelectors;

	@Required
	@Description("Parent stylesheet's origin.")
	@TypeDescription("Stylesheet type: \"injected\" for stylesheets injected via extension, \"user-agent\" for user-agent stylesheets, \"inspector\" for stylesheets created by the inspector (i.e. those holding the \"via inspector\" rules), \"regular\" for regular stylesheets.")
	private String origin;

	@Required
	@Description("Associated style declaration.")
	private CSSStyle style;

	@Experimental
	@Description("The BackendNodeId of the DOM node that constitutes the origin tree scope of this rule.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int originTreeScopeNodeId;

	@Description("Media list array (for rules involving media queries). The array enumerates media queries starting with the innermost one, going outwards.")
	private List<CSSMedia> media;

	@Experimental
	@Description("Container query list array (for rules involving container queries). The array enumerates container queries starting with the innermost one, going outwards.")
	private List<CSSContainerQuery> containerQueries;

	@Experimental
	@Description("@supports CSS at-rule array. The array enumerates @supports at-rules starting with the innermost one, going outwards.")
	private List<CSSSupports> supports;

	@Experimental
	@Description("Cascade layer array. Contains the layer hierarchy that this rule belongs to starting with the innermost layer and going outwards.")
	private List<CSSLayer> layers;

	@Experimental
	@Description("@scope CSS at-rule array. The array enumerates @scope at-rules starting with the innermost one, going outwards.")
	private List<CSSScope> scopes;

	@Experimental
	@Description("The array keeps the types of ancestor CSSRules from the innermost going outwards.")
	@TypeExperimental
	@TypeDescription("Enum indicating the type of a CSS rule, used to represent the order of a style rule's ancestors. This list only contains rule types that are collected during the ancestor rule collection.")
	private List<String> ruleTypes;

	@Experimental
	@Description("@starting-style CSS at-rule array. The array enumerates @starting-style at-rules starting with the innermost one, going outwards.")
	private List<CSSStartingStyle> startingStyles;

    public CSSRule() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public SelectorList getSelectorList() {
		return this.selectorList;
	}
	public void setSelectorList(SelectorList selectorList) {
		this.selectorList = selectorList;
	}
	public String[] getNestingSelectors() {
		return this.nestingSelectors;
	}
	public void setNestingSelectors(String[] nestingSelectors) {
		this.nestingSelectors = nestingSelectors;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public CSSStyle getStyle() {
		return this.style;
	}
	public void setStyle(CSSStyle style) {
		this.style = style;
	}
	public int getOriginTreeScopeNodeId() {
		return this.originTreeScopeNodeId;
	}
	public void setOriginTreeScopeNodeId(int originTreeScopeNodeId) {
		this.originTreeScopeNodeId = originTreeScopeNodeId;
	}
	public List<CSSMedia> getMedia() {
		return this.media;
	}
	public void setMedia(List<CSSMedia> media) {
		this.media = media;
	}
	public List<CSSContainerQuery> getContainerQueries() {
		return this.containerQueries;
	}
	public void setContainerQueries(List<CSSContainerQuery> containerQueries) {
		this.containerQueries = containerQueries;
	}
	public List<CSSSupports> getSupports() {
		return this.supports;
	}
	public void setSupports(List<CSSSupports> supports) {
		this.supports = supports;
	}
	public List<CSSLayer> getLayers() {
		return this.layers;
	}
	public void setLayers(List<CSSLayer> layers) {
		this.layers = layers;
	}
	public List<CSSScope> getScopes() {
		return this.scopes;
	}
	public void setScopes(List<CSSScope> scopes) {
		this.scopes = scopes;
	}
	public List<String> getRuleTypes() {
		return this.ruleTypes;
	}
	public void setRuleTypes(List<String> ruleTypes) {
		this.ruleTypes = ruleTypes;
	}
	public List<CSSStartingStyle> getStartingStyles() {
		return this.startingStyles;
	}
	public void setStartingStyles(List<CSSStartingStyle> startingStyles) {
		this.startingStyles = startingStyles;
	}
}
