package ru.hzerr.cdp.event.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.webAudio.BaseAudioContext;

@Description("Notifies that a new BaseAudioContext has been created.")
@Event("contextCreated")
public class ContextCreatedEvent {

	@Required
	private BaseAudioContext context;

    public ContextCreatedEvent() {
    }

	public BaseAudioContext getContext() {
		return this.context;
	}
	public void setContext(BaseAudioContext context) {
		this.context = context;
	}
}
