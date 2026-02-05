package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.dom.Node;

@Experimental
@Description("Called when a pseudo element is added to an element.")
@Event("pseudoElementAdded")
public class PseudoElementAddedEvent {

	@Required
	@Description("Pseudo element's parent element id.")
	@TypeDescription("Unique DOM node identifier.")
	private int parentId;

	@Required
	@Description("The added pseudo element.")
	private Node pseudoElement;

    public PseudoElementAddedEvent() {
    }

	public int getParentId() {
		return this.parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public Node getPseudoElement() {
		return this.pseudoElement;
	}
	public void setPseudoElement(Node pseudoElement) {
		this.pseudoElement = pseudoElement;
	}
}
