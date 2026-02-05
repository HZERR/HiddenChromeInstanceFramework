package ru.hzerr.cdp.event.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.webAudio.AudioListener;

@Description("Notifies that the construction of an AudioListener has finished.")
@Event("audioListenerCreated")
public class AudioListenerCreatedEvent {

	@Required
	private AudioListener listener;

    public AudioListenerCreatedEvent() {
    }

	public AudioListener getListener() {
		return this.listener;
	}
	public void setListener(AudioListener listener) {
		this.listener = listener;
	}
}
