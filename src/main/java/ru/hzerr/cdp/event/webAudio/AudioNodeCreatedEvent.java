package ru.hzerr.cdp.event.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.webAudio.AudioNode;

@Description("Notifies that a new AudioNode has been created.")
@Event("audioNodeCreated")
public class AudioNodeCreatedEvent {

	@Required
	private AudioNode node;

    public AudioNodeCreatedEvent() {
    }

	public AudioNode getNode() {
		return this.node;
	}
	public void setNode(AudioNode node) {
		this.node = node;
	}
}
