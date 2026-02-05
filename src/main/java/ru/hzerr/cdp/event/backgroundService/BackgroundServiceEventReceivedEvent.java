package ru.hzerr.cdp.event.backgroundService;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.backgroundService.BackgroundServiceEvent;

@Description("Called with all existing backgroundServiceEvents when enabled, and all new events afterwards if enabled and recording.")
@Event("backgroundServiceEventReceived")
public class BackgroundServiceEventReceivedEvent {

	@Required
	private BackgroundServiceEvent backgroundServiceEvent;

    public BackgroundServiceEventReceivedEvent() {
    }

	public BackgroundServiceEvent getBackgroundServiceEvent() {
		return this.backgroundServiceEvent;
	}
	public void setBackgroundServiceEvent(BackgroundServiceEvent backgroundServiceEvent) {
		this.backgroundServiceEvent = backgroundServiceEvent;
	}
}
