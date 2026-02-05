package ru.hzerr.cdp.event.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.webAudio.AudioParam;

@Description("Notifies that a new AudioParam has been created.")
@Event("audioParamCreated")
public class AudioParamCreatedEvent {

	@Required
	private AudioParam param;

    public AudioParamCreatedEvent() {
    }

	public AudioParam getParam() {
		return this.param;
	}
	public void setParam(AudioParam param) {
		this.param = param;
	}
}
