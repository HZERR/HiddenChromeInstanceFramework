package ru.hzerr.cdp.event.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.media.PlayerError;

@Description("Send a list of any errors that need to be delivered.")
@Event("playerErrorsRaised")
public class PlayerErrorsRaisedEvent {

	@Required
	@TypeDescription("Players will get an ID that is unique within the agent context.")
	private String playerId;

	@Required
	private List<PlayerError> errors;

    public PlayerErrorsRaisedEvent() {
    }

	public String getPlayerId() {
		return this.playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public List<PlayerError> getErrors() {
		return this.errors;
	}
	public void setErrors(List<PlayerError> errors) {
		this.errors = errors;
	}
}
