package ru.hzerr.generated.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Fields in AudioContext that change in real-time.")
public class ContextRealtimeData {

	@Required
	@Description("The current context time in second in BaseAudioContext.")
	private Number currentTime;

	@Required
	@Description("The time spent on rendering graph divided by render quantum duration, and multiplied by 100. 100 means the audio renderer reached the full capacity and glitch may occur.")
	private Number renderCapacity;

	@Required
	@Description("A running mean of callback interval.")
	private Number callbackIntervalMean;

	@Required
	@Description("A running variance of callback interval.")
	private Number callbackIntervalVariance;

    public ContextRealtimeData() {
    }

	public Number getCurrentTime() {
		return this.currentTime;
	}
	public void setCurrentTime(Number currentTime) {
		this.currentTime = currentTime;
	}
	public Number getRenderCapacity() {
		return this.renderCapacity;
	}
	public void setRenderCapacity(Number renderCapacity) {
		this.renderCapacity = renderCapacity;
	}
	public Number getCallbackIntervalMean() {
		return this.callbackIntervalMean;
	}
	public void setCallbackIntervalMean(Number callbackIntervalMean) {
		this.callbackIntervalMean = callbackIntervalMean;
	}
	public Number getCallbackIntervalVariance() {
		return this.callbackIntervalVariance;
	}
	public void setCallbackIntervalVariance(Number callbackIntervalVariance) {
		this.callbackIntervalVariance = callbackIntervalVariance;
	}
}
