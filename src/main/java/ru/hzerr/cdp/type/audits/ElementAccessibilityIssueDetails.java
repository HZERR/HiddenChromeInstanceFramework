package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("This issue warns about errors in the select or summary element content model.")
public class ElementAccessibilityIssueDetails {

	@Required
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int nodeId;

	@Required
	private String elementAccessibilityIssueReason;

	@Required
	private boolean hasDisallowedAttributes;

    public ElementAccessibilityIssueDetails() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public String getElementAccessibilityIssueReason() {
		return this.elementAccessibilityIssueReason;
	}
	public void setElementAccessibilityIssueReason(String elementAccessibilityIssueReason) {
		this.elementAccessibilityIssueReason = elementAccessibilityIssueReason;
	}
	public boolean getHasDisallowedAttributes() {
		return this.hasDisallowedAttributes;
	}
	public void setHasDisallowedAttributes(boolean hasDisallowedAttributes) {
		this.hasDisallowedAttributes = hasDisallowedAttributes;
	}
}
