package ru.hzerr.cdp.event.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Event for when an animation has been cancelled.")
@Event("animationCanceled")
public class AnimationCanceledEvent {

	@Required
	@Description("Id of the animation that was cancelled.")
	private String id;

    public AnimationCanceledEvent() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
