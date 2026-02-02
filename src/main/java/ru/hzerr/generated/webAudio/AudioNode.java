package ru.hzerr.generated.webAudio;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Protocol object for AudioNode")
public class AudioNode {

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String nodeId;

	@Required
	@TypeDescription("An unique ID for a graph object (AudioContext, AudioNode, AudioParam) in Web Audio API")
	private String contextId;

	@Required
	@TypeDescription("Enum of AudioNode types")
	private String nodeType;

	@Required
	private Number numberOfInputs;

	@Required
	private Number numberOfOutputs;

	@Required
	private Number channelCount;

	@Required
	@TypeDescription("Enum of AudioNode::ChannelCountMode from the spec")
	private String channelCountMode;

	@Required
	@TypeDescription("Enum of AudioNode::ChannelInterpretation from the spec")
	private String channelInterpretation;

    public AudioNode() {
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
	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public Number getNumberOfInputs() {
		return this.numberOfInputs;
	}
	public void setNumberOfInputs(Number numberOfInputs) {
		this.numberOfInputs = numberOfInputs;
	}
	public Number getNumberOfOutputs() {
		return this.numberOfOutputs;
	}
	public void setNumberOfOutputs(Number numberOfOutputs) {
		this.numberOfOutputs = numberOfOutputs;
	}
	public Number getChannelCount() {
		return this.channelCount;
	}
	public void setChannelCount(Number channelCount) {
		this.channelCount = channelCount;
	}
	public String getChannelCountMode() {
		return this.channelCountMode;
	}
	public void setChannelCountMode(String channelCountMode) {
		this.channelCountMode = channelCountMode;
	}
	public String getChannelInterpretation() {
		return this.channelInterpretation;
	}
	public void setChannelInterpretation(String channelInterpretation) {
		this.channelInterpretation = channelInterpretation;
	}
}
