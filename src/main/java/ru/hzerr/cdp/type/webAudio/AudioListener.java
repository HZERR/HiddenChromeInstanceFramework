package ru.hzerr.cdp.type.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Protocol object for AudioListener")
public class AudioListener {

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String listenerId;

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String contextId;

    public AudioListener() {
    }

	public String getListenerId() {
		return this.listenerId;
	}
	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
	}
	public String getContextId() {
		return this.contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
}
