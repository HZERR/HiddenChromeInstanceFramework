package ru.hzerr.cdp.event.accessibility;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.accessibility.AXNode;

@Experimental
@Description("The loadComplete event mirrors the load complete event sent by the browser to assistive technology when the web page has finished loading.")
@Event("loadComplete")
public class LoadCompleteEvent {

	@Required
	@Description("New document root node.")
	private AXNode root;

    public LoadCompleteEvent() {
    }

	public AXNode getRoot() {
		return this.root;
	}
	public void setRoot(AXNode root) {
		this.root = root;
	}
}
