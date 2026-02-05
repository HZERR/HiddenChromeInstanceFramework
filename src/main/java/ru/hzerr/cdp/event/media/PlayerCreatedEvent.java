package ru.hzerr.cdp.event.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.media.Player;

@Description("Called whenever a player is created, or when a new agent joins and receives a list of active players. If an agent is restored, it will receive one event for each active player.")
@Event("playerCreated")
public class PlayerCreatedEvent {

	@Required
	private Player player;

    public PlayerCreatedEvent() {
    }

	public Player getPlayer() {
		return this.player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
}
