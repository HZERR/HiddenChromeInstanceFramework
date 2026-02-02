package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("CSS keyframes rule representation.")
public class CSSKeyframesRule {

	@Required
	@Description("Animation name.")
	private Value animationName;

	@Required
	@Description("List of keyframes.")
	private List<CSSKeyframeRule> keyframes;

    public CSSKeyframesRule() {
    }

	public Value getAnimationName() {
		return this.animationName;
	}
	public void setAnimationName(Value animationName) {
		this.animationName = animationName;
	}
	public List<CSSKeyframeRule> getKeyframes() {
		return this.keyframes;
	}
	public void setKeyframes(List<CSSKeyframeRule> keyframes) {
		this.keyframes = keyframes;
	}
}
