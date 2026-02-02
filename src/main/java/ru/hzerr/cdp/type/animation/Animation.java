package ru.hzerr.cdp.type.animation;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Animation instance.")
public class Animation {

	@Required
	@Description("`Animation`'s id.")
	private String id;

	@Required
	@Description("`Animation`'s name.")
	private String name;

	@Required
	@Description("`Animation`'s internal paused state.")
	private boolean pausedState;

	@Required
	@Description("`Animation`'s play state.")
	private String playState;

	@Required
	@Description("`Animation`'s playback rate.")
	private Number playbackRate;

	@Required
	@Description("`Animation`'s start time. Milliseconds for time based animations and percentage [0 - 100] for scroll driven animations (i.e. when viewOrScrollTimeline exists).")
	private Number startTime;

	@Required
	@Description("`Animation`'s current time.")
	private Number currentTime;

	@Required
	@Description("Animation type of `Animation`.")
	@Enum({"CSSTransition", "CSSAnimation", "WebAnimation"})
	private String type;

	@Description("`Animation`'s source animation node.")
	private AnimationEffect source;

	@Description("A unique ID for `Animation` representing the sources that triggered this CSS animation/transition.")
	private String cssId;

	@Description("View or scroll timeline")
	private ViewOrScrollTimeline viewOrScrollTimeline;

    public Animation() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getPausedState() {
		return this.pausedState;
	}
	public void setPausedState(boolean pausedState) {
		this.pausedState = pausedState;
	}
	public String getPlayState() {
		return this.playState;
	}
	public void setPlayState(String playState) {
		this.playState = playState;
	}
	public Number getPlaybackRate() {
		return this.playbackRate;
	}
	public void setPlaybackRate(Number playbackRate) {
		this.playbackRate = playbackRate;
	}
	public Number getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Number startTime) {
		this.startTime = startTime;
	}
	public Number getCurrentTime() {
		return this.currentTime;
	}
	public void setCurrentTime(Number currentTime) {
		this.currentTime = currentTime;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public AnimationEffect getSource() {
		return this.source;
	}
	public void setSource(AnimationEffect source) {
		this.source = source;
	}
	public String getCssId() {
		return this.cssId;
	}
	public void setCssId(String cssId) {
		this.cssId = cssId;
	}
	public ViewOrScrollTimeline getViewOrScrollTimeline() {
		return this.viewOrScrollTimeline;
	}
	public void setViewOrScrollTimeline(ViewOrScrollTimeline viewOrScrollTimeline) {
		this.viewOrScrollTimeline = viewOrScrollTimeline;
	}
}
