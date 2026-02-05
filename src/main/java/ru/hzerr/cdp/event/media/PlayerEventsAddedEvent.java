package ru.hzerr.cdp.event.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.media.PlayerEvent;

@Description("Send events as a list, allowing them to be batched on the browser for less congestion. If batched, events must ALWAYS be in chronological order.")
@Event("playerEventsAdded")
public class PlayerEventsAddedEvent {

	@Required
	@TypeDescription("Players will get an ID that is unique within the agent context.")
	private String playerId;

	@Required
	private List<PlayerEvent> events;

    public PlayerEventsAddedEvent() {
    }

	public String getPlayerId() {
		return this.playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public List<PlayerEvent> getEvents() {
		return this.events;
	}
	public void setEvents(List<PlayerEvent> events) {
		this.events = events;
	}
}
