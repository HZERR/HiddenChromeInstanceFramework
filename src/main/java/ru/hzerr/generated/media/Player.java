package ru.hzerr.generated.media;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

public class Player {

	@Required
	@TypeDescription("Players will get an ID that is unique within the agent context.")
	private String playerId;

	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int domNodeId;

    public Player() {
    }

	public String getPlayerId() {
		return this.playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public int getDomNodeId() {
		return this.domNodeId;
	}
	public void setDomNodeId(int domNodeId) {
		this.domNodeId = domNodeId;
	}
}
