package ru.hzerr.cdp.event.security;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.security.VisibleSecurityState;

@Experimental
@Description("The security state of the page changed.")
@Event("visibleSecurityStateChanged")
public class VisibleSecurityStateChangedEvent {

	@Required
	@Description("Security state information about the page.")
	private VisibleSecurityState visibleSecurityState;

    public VisibleSecurityStateChangedEvent() {
    }

	public VisibleSecurityState getVisibleSecurityState() {
		return this.visibleSecurityState;
	}
	public void setVisibleSecurityState(VisibleSecurityState visibleSecurityState) {
		this.visibleSecurityState = visibleSecurityState;
	}
}
