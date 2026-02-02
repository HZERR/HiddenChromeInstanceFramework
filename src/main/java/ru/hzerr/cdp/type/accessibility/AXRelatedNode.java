package ru.hzerr.cdp.type.accessibility;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class AXRelatedNode {

	@Required
	@Description("The BackendNodeId of the related DOM node.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendDOMNodeId;

	@Description("The IDRef value provided, if any.")
	private String idref;

	@Description("The text alternative of this node in the current context.")
	private String text;

    public AXRelatedNode() {
    }

	public int getBackendDOMNodeId() {
		return this.backendDOMNodeId;
	}
	public void setBackendDOMNodeId(int backendDOMNodeId) {
		this.backendDOMNodeId = backendDOMNodeId;
	}
	public String getIdref() {
		return this.idref;
	}
	public void setIdref(String idref) {
		this.idref = idref;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
