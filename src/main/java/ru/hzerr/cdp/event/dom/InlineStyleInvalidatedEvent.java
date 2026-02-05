package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Experimental
@Description("Fired when `Element`'s inline style is modified via a CSS property modification.")
@Event("inlineStyleInvalidated")
public class InlineStyleInvalidatedEvent {

	@Required
	@Description("Ids of the nodes for which the inline styles have been invalidated.")
	@TypeDescription("Unique DOM node identifier.")
	private List<Integer> nodeIds;

    public InlineStyleInvalidatedEvent() {
    }

	public List<Integer> getNodeIds() {
		return this.nodeIds;
	}
	public void setNodeIds(List<Integer> nodeIds) {
		this.nodeIds = nodeIds;
	}
}
