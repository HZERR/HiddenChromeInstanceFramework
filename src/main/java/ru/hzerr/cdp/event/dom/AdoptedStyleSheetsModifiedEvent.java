package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Experimental
@Description("Fired when `Element`'s adoptedStyleSheets are modified.")
@Event("adoptedStyleSheetsModified")
public class AdoptedStyleSheetsModifiedEvent {

	@Required
	@Description("Id of the node that has changed.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Experimental
	@Required
	@Description("New adoptedStyleSheets array.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private List<String> adoptedStyleSheets;

    public AdoptedStyleSheetsModifiedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public List<String> getAdoptedStyleSheets() {
		return this.adoptedStyleSheets;
	}
	public void setAdoptedStyleSheets(List<String> adoptedStyleSheets) {
		this.adoptedStyleSheets = adoptedStyleSheets;
	}
}
