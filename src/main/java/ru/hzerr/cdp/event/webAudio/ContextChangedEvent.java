package ru.hzerr.cdp.event.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.webAudio.BaseAudioContext;

@Description("Notifies that existing BaseAudioContext has changed some properties (id stays the same)..")
@Event("contextChanged")
public class ContextChangedEvent {

	@Required
	private BaseAudioContext context;

    public ContextChangedEvent() {
    }

	public BaseAudioContext getContext() {
		return this.context;
	}
	public void setContext(BaseAudioContext context) {
		this.context = context;
	}
}
