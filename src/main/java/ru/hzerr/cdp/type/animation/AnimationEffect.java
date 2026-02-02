package ru.hzerr.cdp.type.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("AnimationEffect instance")
public class AnimationEffect {

	@Required
	@Description("`AnimationEffect`'s delay.")
	private Number delay;

	@Required
	@Description("`AnimationEffect`'s end delay.")
	private Number endDelay;

	@Required
	@Description("`AnimationEffect`'s iteration start.")
	private Number iterationStart;

	@Description("`AnimationEffect`'s iterations. Omitted if the value is infinite.")
	private Number iterations;

	@Required
	@Description("`AnimationEffect`'s iteration duration. Milliseconds for time based animations and percentage [0 - 100] for scroll driven animations (i.e. when viewOrScrollTimeline exists).")
	private Number duration;

	@Required
	@Description("`AnimationEffect`'s playback direction.")
	private String direction;

	@Required
	@Description("`AnimationEffect`'s fill mode.")
	private String fill;

	@Description("`AnimationEffect`'s target node.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

	@Description("`AnimationEffect`'s keyframes.")
	private KeyframesRule keyframesRule;

	@Required
	@Description("`AnimationEffect`'s timing function.")
	private String easing;

    public AnimationEffect() {
    }

	public Number getDelay() {
		return this.delay;
	}
	public void setDelay(Number delay) {
		this.delay = delay;
	}
	public Number getEndDelay() {
		return this.endDelay;
	}
	public void setEndDelay(Number endDelay) {
		this.endDelay = endDelay;
	}
	public Number getIterationStart() {
		return this.iterationStart;
	}
	public void setIterationStart(Number iterationStart) {
		this.iterationStart = iterationStart;
	}
	public Number getIterations() {
		return this.iterations;
	}
	public void setIterations(Number iterations) {
		this.iterations = iterations;
	}
	public Number getDuration() {
		return this.duration;
	}
	public void setDuration(Number duration) {
		this.duration = duration;
	}
	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getFill() {
		return this.fill;
	}
	public void setFill(String fill) {
		this.fill = fill;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
	public KeyframesRule getKeyframesRule() {
		return this.keyframesRule;
	}
	public void setKeyframesRule(KeyframesRule keyframesRule) {
		this.keyframesRule = keyframesRule;
	}
	public String getEasing() {
		return this.easing;
	}
	public void setEasing(String easing) {
		this.easing = easing;
	}
}
