package ru.hzerr.cdp.type.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Keyframes Rule")
public class KeyframesRule {

	@Description("CSS keyframed animation's name.")
	private String name;

	@Required
	@Description("List of animation keyframes.")
	private List<KeyframeStyle> keyframes;

    public KeyframesRule() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<KeyframeStyle> getKeyframes() {
		return this.keyframes;
	}
	public void setKeyframes(List<KeyframeStyle> keyframes) {
		this.keyframes = keyframes;
	}
}
