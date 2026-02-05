package ru.hzerr.cdp.event.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Event for each animation that has been created.")
@Event("animationCreated")
public class AnimationCreatedEvent {

	@Required
	@Description("Id of the animation that was created.")
	private String id;

    public AnimationCreatedEvent() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
