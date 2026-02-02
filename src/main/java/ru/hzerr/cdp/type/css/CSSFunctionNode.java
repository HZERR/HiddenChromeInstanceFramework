package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;

@Description("Section of the body of a CSS function rule.")
public class CSSFunctionNode {

	@Description("A conditional block. If set, style should not be set.")
	private CSSFunctionConditionNode condition;

	@Description("Values set by this node. If set, condition should not be set.")
	private CSSStyle style;

    public CSSFunctionNode() {
    }

	public CSSFunctionConditionNode getCondition() {
		return this.condition;
	}
	public void setCondition(CSSFunctionConditionNode condition) {
		this.condition = condition;
	}
	public CSSStyle getStyle() {
		return this.style;
	}
	public void setStyle(CSSStyle style) {
		this.style = style;
	}
}
