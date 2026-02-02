package ru.hzerr.generated.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Protocol object for AudioParam")
public class AudioParam {

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String paramId;

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String nodeId;

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String contextId;

	@Required
	@TypeDescription("Enum of AudioParam types")
	private String paramType;

	@Required
	@TypeDescription("Enum of AudioParam::AutomationRate from the spec")
	private String rate;

	@Required
	private Number defaultValue;

	@Required
	private Number minValue;

	@Required
	private Number maxValue;

    public AudioParam() {
    }

	public String getParamId() {
		return this.paramId;
	}
	public void setParamId(String paramId) {
		this.paramId = paramId;
	}
	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getContextId() {
		return this.contextId;
	}
	public void setContextId(String contextId) {
		this.contextId = contextId;
	}
	public String getParamType() {
		return this.paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public Number getDefaultValue() {
		return this.defaultValue;
	}
	public void setDefaultValue(Number defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Number getMinValue() {
		return this.minValue;
	}
	public void setMinValue(Number minValue) {
		this.minValue = minValue;
	}
	public Number getMaxValue() {
		return this.maxValue;
	}
	public void setMaxValue(Number maxValue) {
		this.maxValue = maxValue;
	}
}
