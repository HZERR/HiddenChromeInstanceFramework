package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Called when a pseudo element is removed from an element.")
@Event("pseudoElementRemoved")
public class PseudoElementRemovedEvent {

	@Required
	@Description("Pseudo element's parent element id.")
	@TypeDescription("Unique DOM node identifier.")
	private int parentId;

	@Required
	@Description("The removed pseudo element id.")
	@TypeDescription("Unique DOM node identifier.")
	private int pseudoElementId;

    public PseudoElementRemovedEvent() {
    }

	public int getParentId() {
		return this.parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getPseudoElementId() {
		return this.pseudoElementId;
	}
	public void setPseudoElementId(int pseudoElementId) {
		this.pseudoElementId = pseudoElementId;
	}
}
