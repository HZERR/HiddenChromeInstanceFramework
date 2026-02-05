package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("Called when shadow root is popped from the element.")
@Event("shadowRootPopped")
public class ShadowRootPoppedEvent {

	@Required
	@Description("Host element id.")
	@TypeDescription("Unique DOM node identifier.")
	private int hostId;

	@Required
	@Description("Shadow root id.")
	@TypeDescription("Unique DOM node identifier.")
	private int rootId;

    public ShadowRootPoppedEvent() {
    }

	public int getHostId() {
		return this.hostId;
	}
	public void setHostId(int hostId) {
		this.hostId = hostId;
	}
	public int getRootId() {
		return this.rootId;
	}
	public void setRootId(int rootId) {
		this.rootId = rootId;
	}
}
