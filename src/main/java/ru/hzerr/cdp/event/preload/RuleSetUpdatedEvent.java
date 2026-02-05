package ru.hzerr.cdp.event.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.preload.RuleSet;

@Description("Upsert. Currently, it is only emitted when a rule set added.")
@Event("ruleSetUpdated")
public class RuleSetUpdatedEvent {

	@Required
	private RuleSet ruleSet;

    public RuleSetUpdatedEvent() {
    }

	public RuleSet getRuleSet() {
		return this.ruleSet;
	}
	public void setRuleSet(RuleSet ruleSet) {
		this.ruleSet = ruleSet;
	}
}
