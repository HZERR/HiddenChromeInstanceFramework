package ru.hzerr.cdp.event.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.media.PlayerProperty;

@Description("This can be called multiple times, and can be used to set / override / remove player properties. A null propValue indicates removal.")
@Event("playerPropertiesChanged")
public class PlayerPropertiesChangedEvent {

	@Required
	@TypeDescription("Players will get an ID that is unique within the agent context.")
	private String playerId;

	@Required
	private List<PlayerProperty> properties;

    public PlayerPropertiesChangedEvent() {
    }

	public String getPlayerId() {
		return this.playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public List<PlayerProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<PlayerProperty> properties) {
		this.properties = properties;
	}
}
