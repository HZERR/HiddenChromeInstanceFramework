package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.dom.Node;

@Experimental
@Description("Called when shadow root is pushed into the element.")
@Event("shadowRootPushed")
public class ShadowRootPushedEvent {

	@Required
	@Description("Host element id.")
	@TypeDescription("Unique DOM node identifier.")
	private int hostId;

	@Required
	@Description("Shadow root.")
	private Node root;

    public ShadowRootPushedEvent() {
    }

	public int getHostId() {
		return this.hostId;
	}
	public void setHostId(int hostId) {
		this.hostId = hostId;
	}
	public Node getRoot() {
		return this.root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
}
