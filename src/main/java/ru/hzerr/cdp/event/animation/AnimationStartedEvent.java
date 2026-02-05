package ru.hzerr.cdp.event.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.animation.Animation;

@Description("Event for animation that has been started.")
@Event("animationStarted")
public class AnimationStartedEvent {

	@Required
	@Description("Animation that was started.")
	private Animation animation;

    public AnimationStartedEvent() {
    }

	public Animation getAnimation() {
		return this.animation;
	}
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
}
