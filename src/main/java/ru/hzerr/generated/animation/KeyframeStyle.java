package ru.hzerr.generated.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Keyframe Style")
public class KeyframeStyle {

	@Required
	@Description("Keyframe's time offset.")
	private String offset;

	@Required
	@Description("`AnimationEffect`'s timing function.")
	private String easing;

    public KeyframeStyle() {
    }

	public String getOffset() {
		return this.offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}
	public String getEasing() {
		return this.easing;
	}
	public void setEasing(String easing) {
		this.easing = easing;
	}
}
