package ru.hzerr.cdp.event.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Mirrors `DOMCharacterDataModified` event.")
@Event("characterDataModified")
public class CharacterDataModifiedEvent {

	@Required
	@Description("Id of the node that has changed.")
	@TypeDescription("Unique DOM node identifier.")
	private int nodeId;

	@Required
	@Description("New text value.")
	private String characterData;

    public CharacterDataModifiedEvent() {
    }

	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public String getCharacterData() {
		return this.characterData;
	}
	public void setCharacterData(String characterData) {
		this.characterData = characterData;
	}
}
