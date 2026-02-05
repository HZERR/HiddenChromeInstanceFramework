package ru.hzerr.cdp.event.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.media.PlayerMessage;

@Description("Send a list of any messages that need to be delivered.")
@Event("playerMessagesLogged")
public class PlayerMessagesLoggedEvent {

	@Required
	@TypeDescription("Players will get an ID that is unique within the agent context.")
	private String playerId;

	@Required
	private List<PlayerMessage> messages;

    public PlayerMessagesLoggedEvent() {
    }

	public String getPlayerId() {
		return this.playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public List<PlayerMessage> getMessages() {
		return this.messages;
	}
	public void setMessages(List<PlayerMessage> messages) {
		this.messages = messages;
	}
}
