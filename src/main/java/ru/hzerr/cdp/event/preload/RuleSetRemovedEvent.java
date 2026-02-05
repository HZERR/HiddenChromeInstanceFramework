package ru.hzerr.cdp.event.preload;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Event("ruleSetRemoved")
public class RuleSetRemovedEvent {

	@Required
	@TypeDescription("Unique id")
	private String id;

    public RuleSetRemovedEvent() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
