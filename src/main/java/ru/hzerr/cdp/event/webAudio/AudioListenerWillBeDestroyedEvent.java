package ru.hzerr.cdp.event.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Notifies that a new AudioListener has been created.")
@Event("audioListenerWillBeDestroyed")
public class AudioListenerWillBeDestroyedEvent {

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String contextId;

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String listenerId;

    public AudioListenerWillBeDestroyedEvent() {
    }

	public String getContextId() {
		return this.contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	public String getListenerId() {
		return this.listenerId;
	}
	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
	}
}
