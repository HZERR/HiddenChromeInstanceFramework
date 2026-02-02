package ru.hzerr.cdp.type.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Protocol object for BaseAudioContext")
public class BaseAudioContext {

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String contextId;

	@Required
	@TypeDescription("Enum of BaseAudioContext types")
	private String contextType;

	@Required
	@TypeDescription("Enum of AudioContextState from the spec")
	private String contextState;

	private ContextRealtimeData realtimeData;

	@Required
	@Description("Platform-dependent callback buffer size.")
	private Number callbackBufferSize;

	@Required
	@Description("Number of output channels supported by audio hardware in use.")
	private Number maxOutputChannelCount;

	@Required
	@Description("Context sample rate.")
	private Number sampleRate;

    public BaseAudioContext() {
    }

	public String getContextId() {
		return this.contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	public String getContextType() {
		return this.contextType;
	}
	public void setContextType(String contextType) {
		this.contextType = contextType;
	}
	public String getContextState() {
		return this.contextState;
	}
	public void setContextState(String contextState) {
		this.contextState = contextState;
	}
	public ContextRealtimeData getRealtimeData() {
		return this.realtimeData;
	}
	public void setRealtimeData(ContextRealtimeData realtimeData) {
		this.realtimeData = realtimeData;
	}
	public Number getCallbackBufferSize() {
		return this.callbackBufferSize;
	}
	public void setCallbackBufferSize(Number callbackBufferSize) {
		this.callbackBufferSize = callbackBufferSize;
	}
	public Number getMaxOutputChannelCount() {
		return this.maxOutputChannelCount;
	}
	public void setMaxOutputChannelCount(Number maxOutputChannelCount) {
		this.maxOutputChannelCount = maxOutputChannelCount;
	}
	public Number getSampleRate() {
		return this.sampleRate;
	}
	public void setSampleRate(Number sampleRate) {
		this.sampleRate = sampleRate;
	}
}
